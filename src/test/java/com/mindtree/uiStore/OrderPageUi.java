package com.mindtree.uiStore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPageUi {
	public OrderPageUi(WebDriver driver) {
		PageFactory.initElements(  driver,this);
	}
         @FindBy(css="select[name='cardType']")
        public static WebElement  cardType;
         
         @FindBy(xpath="//input[@name='creditCard']")
         public static WebElement creditCardNumber;
       
         @FindBy(xpath="//input[@name='billToFirstName']")
         public static WebElement  billToFirstName ;
         @FindBy(xpath="//input[@name='billToLastName']")
         public static WebElement  billToLastName ;
         
         @FindBy(xpath="//input[@name='billAddress1']")
         public static WebElement billingAddres1  ;
          
          @FindBy(xpath="//input[@name='billAddress2']")
          public static WebElement billingAddres2 ;
        
          @FindBy(xpath="//input[@name='billCity']")
          public static WebElement billingCity   ;
          @FindBy(xpath="//input[@name='billState']")
          public static WebElement billingState  ;
          @FindBy(xpath ="//input[@name='billZip']")
          public static WebElement billingZip ;
           
           @FindBy(xpath="//input[@name='billCountry']")
           public static WebElement billingContry ;
           @FindBy(xpath="//*[@id=\"CenterForm\"]/form/div/button[1]")
           public static WebElement  contineToOrder ;
           @FindBy(xpath="//*[@id=\"CenterForm\"]/form/div/button[1]")
           public static WebElement   confirmOrder ;
           
           @FindBy(xpath="//div[@id='MessageBar']")
           public static WebElement  succesMessage ;
}
