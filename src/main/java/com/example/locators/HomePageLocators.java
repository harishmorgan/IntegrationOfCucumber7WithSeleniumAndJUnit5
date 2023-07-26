package com.example.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
 
public class HomePageLocators {
 
      @FindBy(css = "h6.oxd-topbar-header-breadcrumb-module")
      public  WebElement homePageUserName;
       
}