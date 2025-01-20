package com.anis;

import com.anis.utils.WindowManager;
import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.*;
import com.anis.pages.HomePage;

import java.io.File;
import java.io.IOException;


public class BaseTests {


    private WebDriver driver;
    protected HomePage homePage;


    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
        driver = new ChromeDriver();
        goHome();
        setCookie();

    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

    @AfterClass
    public void tearDown(){
        System.out.println("tear down");
        driver.quit();
    }
    @AfterMethod
    public void recordFailure(ITestResult result){

        if(ITestResult.FAILURE == result.getStatus())
        {
            var camera = (TakesScreenshot)driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);

            try{
                Files.move(screenshot, new File("./resources/screenshots/" + result.getName() + ".png"));

            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }

    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }

    private ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        //options.setHeadless(true);
        return options;
    }

    private void setCookie(){
        Cookie cookie = new Cookie.Builder("tau", "123")
                .domain("the-internet.herokuapp.com")
                .build();
        driver.manage().addCookie(cookie);
    }



}
