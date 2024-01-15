package com.mindtree.steps;

import org.openqa.selenium.WebElement;

import com.mindtree.pageObjects.LoginPage;

public class LoginSteps {
 LoginPage page=new LoginPage();
	public void clickOnElement(WebElement signIn) {
		 page.clickOnElement(signIn);
		
	}

	public void sendkeysToLocator(WebElement locator, String  data ) {
		 page.sendkeysToLocator( locator,data);
	}

	public void jsClick(WebElement submitSignIn) {
		 page.jsClick(submitSignIn);
		
	}

	 
}
