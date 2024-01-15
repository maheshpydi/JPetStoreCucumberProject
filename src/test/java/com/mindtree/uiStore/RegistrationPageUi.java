package com.mindtree.uiStore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPageUi {
	public RegistrationPageUi(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
          @FindBy(css="input[name='username']")
        public static WebElement userId ;
          @FindBy(css="input[name='password']")
          public static WebElement newPasword;
          @FindBy(css="input[name='repeatedPassword']")
          public static WebElement confirmPassword ;
          @FindBy(css="input[name='firstName']")
          public static WebElement firstName ;
          @FindBy(css="input[name='lastName']")
          public static WebElement lastName ;
          @FindBy(css="input[name='email']")
          public static WebElement email ;
          @FindBy(css="input[name='phone']")
          public static WebElement phone ;
          @FindBy(css="input[name='address1']")
          public static WebElement address1 ;
          @FindBy(css="input[name='address2']")
          public static WebElement address2;
          @FindBy(css="input[name='city']")
          public static WebElement city;
          @FindBy(css="input[name='state']")
          public static WebElement state;
          @FindBy(css="input[name='zip']")
          public static WebElement zip;
          @FindBy(css="input[name='country']")
          public static WebElement country;
          @FindBy(css="select[name='languagePreference']")
          public static WebElement languagePreference ;
          @FindBy(css="select[name='favouriteCategoryId']")
          public static WebElement favouriteCategory ;
          @FindBy(css="input[value='true'][name='listOption']")
          public static WebElement enableMyList;
          @FindBy(css="input[value='true'][name='bannerOption']")
          public static WebElement enableMyBanner;
          @FindBy(xpath="//button[contains(text(),'Save Account Information')]")
          public static WebElement saveAccountinformation;
          @FindBy(xpath="//*[@id=\"MessageBar\"]/p")
          public static WebElement successMessage;
          @FindBy(xpath="//a[contains(text(),'Sign Out')]")
          public static WebElement logoutText;
          
        
		 
         
         

}
