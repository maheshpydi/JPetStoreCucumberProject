package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.stepdef.Hooks;
import com.mindtree.tests.TestBase;
import com.mindtree.uiStore.HomePageUi;
 

public class HomePage {
	WebDriver driver=Hooks.driver;
	TestBase tb=new TestBase();
	HomePageUi  login=new HomePageUi(driver);
	
	public  boolean isLocatorDisplayed(WebElement signOut) {
		tb.wait(10);
	 if(signOut.isDisplayed()==true)
		 return true;
	return false;
		 
		
	}

	
	public void clickOnElement(WebElement selectingFishProduct) {
		tb.wait(10);
		 tb.waitAndClick(selectingFishProduct);
		
	}

}
