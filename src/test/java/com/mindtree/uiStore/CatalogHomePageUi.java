package com.mindtree.uiStore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CatalogHomePageUi extends PageFactory {
	 
		public CatalogHomePageUi(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
	          @FindBy(xpath="//input[@placeholder='Product Search']")
	        public static WebElement  searchedBox;
			 
			 @FindBy(xpath="//button[normalize-space()='Search']")
		        public static WebElement  submitSearch;
			 
			  @FindBy( xpath="//a[normalize-space()='Sign In']")
		        public static WebElement  signInText;
			  
			 
			 
			 
	
	 

}
