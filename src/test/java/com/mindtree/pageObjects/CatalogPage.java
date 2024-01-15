package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.stepdef.Hooks;
import com.mindtree.tests.TestBase;
import com.mindtree.uiStore.CatalogHomePageUi;

public class CatalogPage {
	 
	WebDriver driver=Hooks.driver;
	TestBase tb=new TestBase();
	CatalogHomePageUi homePage=new CatalogHomePageUi(driver);
	 
	public void clickOnElement(WebElement signIn) {
		tb.wait(10);
		 tb.waitAndClick(signIn);
		
	}

	public void sendkeysToLocator(WebElement locator, String data) {
		tb.wait(10);
		 tb.sendData(locator, data);
		
	}

	public  boolean isApplicationDispayed(String currentUrl, String url) {
		tb.wait(10);
		 if(currentUrl.contains(url))
			 return true;
		return false;
		
	}
}
