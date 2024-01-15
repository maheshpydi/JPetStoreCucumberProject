package com.mindtree.steps;

import org.openqa.selenium.WebElement;

import com.mindtree.pageObjects.OrderPage;

public class OrderPageSteps {
      OrderPage orderPage=new OrderPage();
	public void selectValueFromDropDown(WebElement cardType, String string) {
		 orderPage.selectValueFromDropDown(cardType,string);
		
	}
	public void sendKeysToLocator(WebElement creditCardNumber, String string) {
		orderPage.sendKeysToLocator(creditCardNumber,string);
		
	}
	public void clickOnElement(WebElement contineToOrder) {
		 orderPage.clickOnElement(contineToOrder);
		
	}
	public void jsClick(WebElement contineToOrder) {
		 orderPage.jsClick(contineToOrder);
		
	}
	public void scrollAndClick(WebElement contineToOrder) {
		 orderPage.scrollAndClick(contineToOrder);
		
	}
	public void isSuccessMeageDispayed(WebElement succesMessage) {
		 orderPage.isSuccessMeageDispayed(succesMessage);
		
	}

}
