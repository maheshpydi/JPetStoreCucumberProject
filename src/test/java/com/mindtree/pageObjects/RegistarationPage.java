package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.mindtree.stepdef.Hooks;
import com.mindtree.tests.TestBase;
import com.mindtree.uiStore.RegistrationPageUi;

public class RegistarationPage {
	WebDriver driver=Hooks.driver;
	TestBase tb=new TestBase();
	RegistrationPageUi registartion=new RegistrationPageUi(driver);

	public void sendkeysToLocator(WebElement locator, String data) {
		tb.wait(10);
		 tb.sendData(locator, data);
		
	}

	public void clickOnElement(WebElement enableMyList) {
		tb.wait(10);
		 tb.actionMoveAndClick(enableMyList);
		 
		
	}

	public void selectValueFromDropDown(WebElement languagePreference, String string) {
		tb.wait(10);
		 Select select=new Select(languagePreference);
		 select.selectByValue(string);
		
	}

	public void jsClick(WebElement saveAccountinformation) {
		tb.wait(10);
	 tb.jSClick(saveAccountinformation);
		
	}

	public void actionMoveAndClick(WebElement saveAccountinformation) {
		tb.wait(10);
		 tb.actionMoveAndClick(saveAccountinformation);
		
	}

	public void isDispalyed(WebElement successMessage) {
		tb.wait(10);
		 tb.isDisplayed(successMessage);
		
	}
 

}
