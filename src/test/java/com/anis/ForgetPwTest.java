package com.anis;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ForgetPwTest extends BaseTests{

    @Test
    public void testRetrivePw(){
        var forgetPwPage = homePage.clickForgotPassword();

        String email = "abc@att.com";
        forgetPwPage.setEmail(email);
        var emailSentPage = forgetPwPage.clickRetPw();
        System.out.println("Email Page error :"+ emailSentPage.getMessage());
        assertEquals(emailSentPage.getMessage(), "Internal Server Error", "Message is incorrect");

        //System.out.println("error : "+ error);
        //assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
        //assertTrue(selectedOptions.contains(option), "Option not selected");
    }
}
