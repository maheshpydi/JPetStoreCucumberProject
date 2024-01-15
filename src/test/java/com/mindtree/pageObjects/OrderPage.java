package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.stepdef.Hooks;
import com.mindtree.tests.TestBase;
import com.mindtree.uiStore.OrderPageUi;

public class OrderPage {
	WebDriver driver=Hooks.driver;
	TestBase tb=new TestBase();
	 OrderPageUi catalog=new OrderPageUi(driver);
	public void selectValueFromDropDown(WebElement cardType, String string) {
		tb.wait(10);
		 tb.SelectValueFromDropDown(cardType, string);
		
	}
	public void sendKeysToLocator(WebElement creditCardNumber, String string) {
		tb.wait(10);;
		 
		 tb.sendData(creditCardNumber, string);
		
	}
	public void clickOnElement(WebElement contineToOrder) {
		tb.wait(10);
		 tb.jSClick(contineToOrder);
		
	}
	public void jsClick(WebElement contineToOrder) {
		tb.wait(10);
		 tb.jSClick(contineToOrder);
		
	}
	public void scrollAndClick(WebElement contineToOrder) {
		tb.wait(10);
		 tb.actionMoveAndClick(contineToOrder);
		
	}
	public void isSuccessMeageDispayed(WebElement succesMessage) {
		tb.wait(10);
		 tb.isDisplayed(succesMessage);
		
	}

}
