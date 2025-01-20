package com.anis.utils;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.events.WebDriverListener;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class EventReporter implements WebDriverListener {
    @Override
    public void beforeAnyCall(Object target, Method method, Object[] args) {
        System.out.println("Before calling method: " + method.getName());
    }
    @Override
    public void afterAnyCall(Object target, Method method, Object[] args, Object result) {
        System.out.println("After calling method: " + method.getName());
    }
    @Override
    public void onError(Object target, Method method, Object[] args, InvocationTargetException e) {
        System.out.println("Error while calling method: " + method.getName() + " - " + e.getMessage());
    }
    @Override
    public void beforeAnyWebDriverCall(WebDriver driver, Method method, Object[] args) {
        System.out.println("Before calling WebDriver method: " + method.getName());
    }
    @Override
    public void afterAnyWebDriverCall(WebDriver driver, Method method, Object[] args, Object result) {
        System.out.println("After calling WebDriver method: " + method.getName());
    }
    @Override
    public void beforeGet(WebDriver driver, String url) {
        System.out.println("Before navigating to URL: " + url);
    }
    @Override
    public void afterGet(WebDriver driver, String url) {
        System.out.println("After navigating to URL: " + url);
    }
    @Override
    public void beforeGetCurrentUrl(WebDriver driver) {
        System.out.println("Before getting current URL.");
    }
    @Override
    public void afterGetCurrentUrl(WebDriver driver,String result) {
        System.out.println("After getting current URL: " + result);
    }
    @Override
    public void beforeGetTitle(WebDriver driver) {
        System.out.println("Before getting page title.");
    }
    @Override
    public void afterGetTitle(WebDriver driver, String result) {
        System.out.println("After getting page title: " + result);
    }
    @Override
    public void beforeFindElement(WebDriver driver, By locator) {
        System.out.println("Before finding element by: " + locator);
    }
    @Override
    public void afterFindElement(WebDriver driver, By locator, WebElement result) {
        System.out.println("After finding element by: " + locator);
    }
    @Override
    public void beforeFindElements(WebDriver driver, By locator) {
        System.out.println("Before finding elements by: " + locator);
    }
    @Override
    public void afterFindElements(WebDriver driver, By locator, List<WebElement> result) {
        System.out.println("After finding elements by: " + locator);
    }
    @Override
    public void beforeGetPageSource(WebDriver driver) {
        System.out.println("Before getting page source.");
    }
    @Override
    public void afterGetPageSource(WebDriver driver, String result) {
        System.out.println("After getting page source.");
    }
    @Override
    public void beforeClose(WebDriver driver) {
        System.out.println("Before closing the WebDriver.");
    }
    @Override
    public void afterClose(WebDriver driver) {
        System.out.println("After closing the WebDriver.");
    }
    @Override
    public void beforeQuit(WebDriver driver) {
        System.out.println("Before quitting the WebDriver.");
    }
    @Override
    public void afterQuit(WebDriver driver) {
        System.out.println("After quitting the WebDriver.");
    }
    @Override
    public void beforeGetWindowHandles(WebDriver driver) {
        System.out.println("Before getting window handles.");
    }
    @Override
    public void afterGetWindowHandles(WebDriver driver, Set<String> result) {
        System.out.println("After getting window handles.");
    }
    @Override
    public void beforeGetWindowHandle(WebDriver driver) {
        System.out.println("Before getting window handle.");
    }
    @Override
    public void afterGetWindowHandle(WebDriver driver, String result) {
        System.out.println("After getting window handle.");
    }
    @Override
    public void beforeExecuteScript(WebDriver driver, String script, Object[] args) {
        System.out.println("Before executing script: " + script);
    }
    @Override
    public void afterExecuteScript(WebDriver driver, String script, Object[] args, Object result) {
        System.out.println("After executing script: " + script);
    }
    @Override
    public void beforeExecuteAsyncScript(WebDriver driver, String script, Object[] args) {
        System.out.println("Before executing async script: " + script);
    }
    @Override
    public void afterExecuteAsyncScript(WebDriver driver, String script, Object[] args, Object result) {
        System.out.println("After executing async script: " + script);
    }
    @Override
    public void beforePerform(WebDriver driver, Collection<Sequence> actions) {
        System.out.println("Before performing actions.");
    }
    @Override
    public void afterPerform(WebDriver driver, Collection<Sequence> actions) {
        System.out.println("After performing actions.");
    }
    @Override
    public void beforeResetInputState(WebDriver driver) {
        System.out.println("Before resetting input state.");
    }
    @Override
    public void afterResetInputState(WebDriver driver) {
        System.out.println("After resetting input state.");
    }
    @Override
    public void beforeAnyWebElementCall(WebElement element, Method method, Object[] args) {
        System.out.println("Before calling WebElement method: " + method.getName());
    }
    @Override
    public void afterAnyWebElementCall(WebElement element, Method method, Object[] args, Object result) {
        System.out.println("After calling WebElement method: " + method.getName());
    }
    @Override
    public void beforeClick(WebElement element) {
        System.out.println("Before clicking on element.");
    }
    @Override
    public void afterClick(WebElement element) {
        System.out.println("After clicking on element.");
    }
    @Override
    public void beforeSubmit(WebElement element) {
        System.out.println("Before submitting a form element.");
    }
    @Override
    public void afterSubmit(WebElement element) {
        System.out.println("After submitting a form element.");
    }
    @Override
    public void beforeSendKeys(WebElement element, CharSequence... keysToSend) {
        System.out.println("Before sending keys to element.");
    }
    @Override
    public void afterSendKeys(WebElement element, CharSequence... keysToSend) {
        System.out.println("After sending keys to element.");
    }
    @Override
    public void beforeClear(WebElement element) {
        System.out.println("Before clearing the text of an element.");
    }
    @Override
    public void afterClear(WebElement element) {
        System.out.println("After clearing the text of an element.");
    }
    @Override
    public void beforeGetTagName(WebElement element) {
        System.out.println("Before getting the tag name of an element.");
    }
    @Override
    public void afterGetTagName(WebElement element, String result) {
        System.out.println("After getting the tag name of an element: " + result);
    }
    @Override
    public void beforeGetAttribute(WebElement element, String name) {
        System.out.println("Before getting an attribute of an element: " + name);
    }
    @Override
    public void afterGetAttribute(WebElement element, String name, String result) {
        System.out.println("After getting an attribute of an element: " + name);
    }
    @Override
    public void beforeIsSelected(WebElement element) {
        System.out.println("Before checking if element is selected.");
    }
    @Override
    public void afterIsSelected(WebElement element, boolean result) {
        System.out.println("After checking if element is selected: " + result);
    }
    @Override
    public void beforeIsEnabled(WebElement element) {
        System.out.println("Before checking if element is enabled.");
    }
    @Override
    public void afterIsEnabled(WebElement element, boolean result) {
        System.out.println("After checking if element is enabled: " + result);
    }
    @Override
    public void beforeGetText(WebElement element) {
        System.out.println("Before getting text from element.");
    }
    @Override
    public void afterGetText(WebElement element, String result) {
        System.out.println("After getting text from element: " + result);
    }
    @Override
    public void beforeFindElement(WebElement element, By locator) {
        System.out.println("Before finding element within element: " + locator);
    }
    @Override
    public void afterFindElement(WebElement element, By locator, WebElement result) {
        System.out.println("After finding element within element: " + locator);
    }
    @Override
    public void beforeFindElements(WebElement element, By locator) {
        System.out.println("Before finding elements within element: " + locator);
    }
    @Override
    public void afterFindElements(WebElement element, By locator, List<WebElement> result) {
        System.out.println("After finding elements within element: " + locator);
    }

}