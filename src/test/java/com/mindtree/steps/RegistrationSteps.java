package com.mindtree.steps;

import org.openqa.selenium.WebElement;

import com.mindtree.pageObjects.RegistarationPage;

public class RegistrationSteps {
	RegistarationPage registartionPage=new RegistarationPage();

	public void enterData(WebElement locator, String  data) {
		 
		registartionPage.sendkeysToLocator( locator,data);
	
		
	}

	public void clickOnElement(WebElement enableMyList) {
		 registartionPage.clickOnElement(enableMyList);
		
	}

	public void selectValueFromDropDown(WebElement languagePreference, String string) {
		 registartionPage.selectValueFromDropDown(languagePreference,string);
		
	}

	public void jsClick(WebElement saveAccountinformation) {
		 registartionPage.jsClick(saveAccountinformation);
		
	}

	public void actionMoveAndClick(WebElement saveAccountinformation) {
		 registartionPage.actionMoveAndClick(saveAccountinformation);
		
	}

	public void isDispalyed(WebElement successMessage) {
		 registartionPage.isDispalyed(successMessage);
		
	}

}
