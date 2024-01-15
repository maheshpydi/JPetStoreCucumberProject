package com.mindtree.steps;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.mindtree.pageObjects.HomePage;

public class HomePageSteps {
    HomePage homePage=new HomePage();
	public void isLocatorDisplayed(WebElement signOut) {
	Assert.assertTrue(homePage.isLocatorDisplayed(signOut),"element not dispalyed"); 
		 
		
	}
	public void clickOnElement(WebElement selectingFishProduct) {
		homePage.clickOnElement(selectingFishProduct);
			
		
	}

}
