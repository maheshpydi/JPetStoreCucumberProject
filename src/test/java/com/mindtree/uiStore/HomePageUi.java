package com.mindtree.uiStore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageUi {

	public HomePageUi(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
         @FindBy(xpath="//a[normalize-space()='Sign Out']")
        public static WebElement signOut;
		 
		@FindBy(xpath="//*[@id=\"QuickLinks\"]/a[1]")
        public static WebElement selectingFishProduct;
		  @FindBy(xpath="//input[@placeholder='Product Search']")
          public static WebElement  searchedBox;
		  
		  
	
}
