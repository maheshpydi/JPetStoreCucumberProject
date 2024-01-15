package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.stepdef.Hooks;
import com.mindtree.tests.TestBase;
import com.mindtree.uiStore.LoginPageUi;

public class LoginPage {
	
	WebDriver driver=Hooks.driver;
	TestBase tb=new TestBase();
	LoginPageUi  login=new LoginPageUi(driver);

	 
	public void clickOnElement(WebElement signIn) {
		 tb.waitAndClick(signIn);
		
	}
	public void sendkeysToLocator(WebElement locator, String data) {
		tb.wait(10);
		 tb.sendData(locator, data);
		
	}
	public void jsClick(WebElement submitSignIn) {
		tb.wait(10);
		 tb.jSClick(submitSignIn);
		
	}
	
}
