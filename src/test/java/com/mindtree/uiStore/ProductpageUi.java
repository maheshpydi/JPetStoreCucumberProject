package com.mindtree.uiStore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductpageUi {
	public ProductpageUi(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
          @FindBy( css="tbody tr td:nth-child(2)")
        public static WebElement  searchedProduct;
		 
		 @FindBy(xpath="//a[normalize-space()='FI-SW-01']")
	        public static WebElement  selectProduct;
		 @FindBy(css="tbody tr:nth-child(2) td:nth-child(5) a:nth-child(1)")
	        public static WebElement  addToCartButton;
		  @FindBy(xpath="//input[@name='EST-1']")
	        public static WebElement  updatingQuantity;
		  @FindBy(xpath="//button[contains(text(),'Update Cart')]")
	        public static WebElement  updatingCart; 
		  @FindBy(xpath="//a[normalize-space()='Proceed to Checkout']")
	        public static WebElement  proceedTocheckout;
		  
		 
		 
		 
}
 