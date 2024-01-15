package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.stepdef.Hooks;
import com.mindtree.tests.TestBase;
import com.mindtree.uiStore.ProductpageUi;

public class ProductPage {
	WebDriver driver=Hooks.driver;
	TestBase tb=new TestBase();
     ProductpageUi product=new  ProductpageUi(driver);

	public boolean  isElementDisplayed(WebElement element, String string) {
		tb.wait(10);
		if( element.getText().equalsIgnoreCase(string))
			return true;
		return false;
		 
		
	}

	public void clickOnElement(WebElement selectProduct) {
		tb.wait(10);
		 tb.waitAndClick(selectProduct);
		
	}

	public void sendKeysToElement(WebElement updatingQuantity, String string) {
		tb.wait(10);
		 tb.sendData(updatingQuantity, string);
		
	}

	  
	public void scrollAndClick(WebElement proceedTocheckout) {
		tb.wait(10);
		 tb.actionMoveAndClick(proceedTocheckout);
		
	}

	public void jsClick(WebElement updatingCart) {
		tb.wait(10);
		 tb.jSClick(updatingCart);
		
	}

	 

}
