package com.mindtree.uiStore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageUi {
	public LoginPageUi(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
         @FindBy(xpath="//input[@name='username']")
        public static WebElement userName;
         @FindBy( xpath="//input[@name='password']")
         public static WebElement password;
         
         @FindBy(css="div[class='button-bar'] button[type='submit']")
         public static WebElement submitSignIn;
         
       
         
       

}
