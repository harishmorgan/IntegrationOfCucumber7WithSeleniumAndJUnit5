package com.example.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
 
public class LoginPageLocators {
 
    @FindBy(name = "username")
    public WebElement userName;
  
    @FindBy(name = "password")
    public WebElement password;
     
    @FindBy(css = "span.oxd-text.oxd-text--span.oxd-input-field-error-message.oxd-input-group__message")
    public WebElement missingUsernameErrorMessage;
     
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement login;
  
    @FindBy(css = "p.oxd-text.oxd-text--p.oxd-alert-content-text")
    public  WebElement errorMessage;
    
    @FindBy(css = "p.orangehrm-login-forgot-header")
    public  WebElement ForgotYourPasswordLink;
}