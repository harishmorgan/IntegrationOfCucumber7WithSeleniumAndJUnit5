package com.example.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
 
public class ForgotPasswordLocators {
     
    @FindBy(css = "h6.orangehrm-forgot-password-title")
    public WebElement ForgotPasswordHeading;
 
}