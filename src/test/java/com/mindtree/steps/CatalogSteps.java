package com.mindtree.steps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.mindtree.pageObjects.CatalogPage;

public class CatalogSteps {
	CatalogPage catalog=new CatalogPage();
	public void clickOnElement(WebElement signIn) {
		catalog.clickOnElement(signIn);
	
}

public void sendkeysToLocator(WebElement locator, String  data ) {
	catalog.sendkeysToLocator( locator,data);
}

public  void isApplicationDispayed(String currentUrl, String url) {
	Assert.assertTrue( catalog.isApplicationDispayed(currentUrl,url));  
	
}

 

}
