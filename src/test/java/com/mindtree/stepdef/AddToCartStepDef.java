package com.mindtree.stepdef;

import com.mindtree.steps.HomePageSteps;
import com.mindtree.steps.OrderPageSteps;
import com.mindtree.steps.ProductPageSteps;
import com.mindtree.steps.RegistrationSteps;
import com.mindtree.uiStore.HomePageUi;
import com.mindtree.uiStore.OrderPageUi;
import com.mindtree.uiStore.ProductpageUi;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartStepDef {
	 
	public static String  firstName;
	public static String lastName;
	public static String address1;
	public static String  address2;
	public static String country;
	public static String  state;
	public static String  zip;
	public static String  city;
	public static String cardNumber;
	 
	HomePageSteps homePageSteps = new HomePageSteps();
	ProductPageSteps productpage = new ProductPageSteps();
	RegistrationSteps registrationSteps = new RegistrationSteps();
	 OrderPageSteps orderPageSteps=new OrderPageSteps();
	@When("user select a  product in homepage")
	public void user_select_a_product_in_homepage() {
		try {
			Hooks.extentTest=Hooks.report.createTest("user select a  product in homepage");	 
			homePageSteps.clickOnElement(HomePageUi.selectingFishProduct);
			Hooks.report.flush();
		} catch (Exception e) {
			 
			e.printStackTrace();
		}
		 
	}

	@When("user select a produuct id")
	public void user_select_a_produuct_id() {
		
		try {
			Hooks.extentTest=Hooks.report.createTest("user select a  product in homepage");	 
			productpage.clickOnElement(ProductpageUi.selectProduct);
			 Hooks.report.flush();
		} catch (Exception e) {
			 
			e.printStackTrace();
		}
	}

	@When("user adds product to cart")
	public void user_adds_product_to_cart() {
		try {
			Hooks.extentTest=Hooks.report.createTest("user adds product to cart");	 
			productpage.clickOnElement(ProductpageUi.addToCartButton);
			 Hooks.report.flush();
		} catch (Exception e) {
			 
			e.printStackTrace();
		}
	}

	@When("user update quantity and click on checkout")
	public void user_update_quantity_and_click_on_checkout() {
		try {
			Hooks.extentTest=Hooks.report.createTest("user update quantity and click on checkout");	 
			productpage.sendKeysToElement(ProductpageUi.updatingQuantity, "3");
			productpage.jsClick(ProductpageUi.updatingCart);
			productpage.scrollAndClick(ProductpageUi.proceedTocheckout);
			 Hooks.report.flush();
		} catch (Exception e) {
			 
			e.printStackTrace();
		}
	}

	@When("user enters payment and shipinng deatils")
	public void user_enters_payment_and_shipinng_deatils() {
		try {
			Hooks.extentTest=Hooks.report.createTest("user enters payment and shipinng deatils");	 
			
			orderPageSteps.sendKeysToLocator(OrderPageUi.creditCardNumber, cardNumber);
			orderPageSteps.sendKeysToLocator(OrderPageUi.billToFirstName,firstName);
			orderPageSteps.sendKeysToLocator(OrderPageUi.billToLastName, lastName);
			orderPageSteps.sendKeysToLocator(OrderPageUi.billingAddres1,address1);
			orderPageSteps.sendKeysToLocator(OrderPageUi.billingAddres2, address2);
			orderPageSteps.sendKeysToLocator(OrderPageUi.billingCity, city);
			orderPageSteps.sendKeysToLocator(OrderPageUi.billingState, state);
			orderPageSteps.sendKeysToLocator(OrderPageUi.billingZip, zip);
			orderPageSteps.sendKeysToLocator(OrderPageUi.billingContry,country);
			orderPageSteps.scrollAndClick(OrderPageUi.contineToOrder);
			orderPageSteps.scrollAndClick(OrderPageUi.confirmOrder);
			 Hooks.report.flush();
		} catch (Exception e) {
			 
			e.printStackTrace();
		}
	}

	@Then("user can verify order submitted")
	public void user_can_verify_order_submitted() {
		try {
			Hooks.extentTest=Hooks.report.createTest("user can verify order submitte");	 
			orderPageSteps.isSuccessMeageDispayed(OrderPageUi.succesMessage);
			 Hooks.report.flush();
		} catch (Exception e) {
			 
			e.printStackTrace();
		}
	}

}
