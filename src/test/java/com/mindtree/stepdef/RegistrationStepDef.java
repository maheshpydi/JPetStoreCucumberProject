package com.mindtree.stepdef;

import com.mindtree.steps.CatalogSteps;
import com.mindtree.steps.HomePageSteps;
import com.mindtree.steps.LoginSteps;
import com.mindtree.steps.OrderPageSteps;
import com.mindtree.steps.ProductPageSteps;
import com.mindtree.steps.RegistrationSteps;
import com.mindtree.uiStore.RegistrationPageUi;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationStepDef {
	CatalogSteps catalogSteps = new CatalogSteps();
	LoginSteps loginSteps = new LoginSteps();
	HomePageSteps homePageSteps = new HomePageSteps();
	ProductPageSteps productpage = new ProductPageSteps();
	RegistrationSteps registrationSteps = new RegistrationSteps();
	OrderPageSteps orderPageSteps = new OrderPageSteps();
	public static String userId;
	public static String  newPassword;
	public static String confirmPasword;
	public static String  firstName;
	public static String lastName;
	public static String  email;
	public static  String  phone;
	public static String address1;
	public static String  address2;
	public static String country;
	public static String  state;
	public static String  zip;
	public static String  city;
	public static String  languuagePreference;
	public static String  favouritecategoey;
	@When("user enters user information")
	public void user_enters_user_information() {
		Hooks.extentTest=Hooks.report.createTest("user enters user information");	 
	    
	    
		try {
			registrationSteps.enterData(RegistrationPageUi.userId, userId);
			registrationSteps.enterData(RegistrationPageUi.newPasword, newPassword);
			registrationSteps.enterData(RegistrationPageUi.confirmPassword, confirmPasword);
			 Hooks.report.flush();
		} catch (Exception e) {
			 
			e.printStackTrace();
		}
	
	}

	@When("user enter account information")
	public void user_enter_account_information() {
		try {
			Hooks.extentTest=Hooks.report.createTest("user enters accont information");	 
			registrationSteps.enterData(RegistrationPageUi.firstName, firstName);
			registrationSteps.enterData(RegistrationPageUi.lastName, lastName);
			registrationSteps.enterData(RegistrationPageUi.email, email);
			registrationSteps.enterData(RegistrationPageUi.phone,  phone.toString());
			registrationSteps.enterData(RegistrationPageUi.address1, address1);
			registrationSteps.enterData(RegistrationPageUi.address2, address2);
			registrationSteps.enterData(RegistrationPageUi.city, city);
			registrationSteps.enterData(RegistrationPageUi.state,state);
			registrationSteps.enterData(RegistrationPageUi.zip,zip);
			registrationSteps.enterData(RegistrationPageUi.country,country);
			 Hooks.report.flush();
		} catch (Exception e) {
			 
			e.printStackTrace();
		}

	    
	}

	@When("user enter profile information")
	public void user_enter_profile_information() {
		try {
			Hooks.extentTest=Hooks.report.createTest("user enters profile information");	 
  registrationSteps.selectValueFromDropDown(RegistrationPageUi.languagePreference,"german");
  registrationSteps.selectValueFromDropDown(RegistrationPageUi.favouriteCategory,"FISH");
  registrationSteps.actionMoveAndClick(RegistrationPageUi.enableMyList);
  registrationSteps.actionMoveAndClick(RegistrationPageUi.enableMyBanner);
  Hooks.report.flush();
		} catch (Exception e) {
			 
			e.printStackTrace();
		}

	    
	}

	@Then("user click on save accouunt information")
	public void user_click_on_save_accouunt_information() {
		try {
			Hooks.extentTest=Hooks.report.createTest("user click on save accont information");	 
			registrationSteps.actionMoveAndClick(RegistrationPageUi.saveAccountinformation);
			Hooks.report.flush();
		} catch (Exception e) {
			 
			e.printStackTrace();
		}
	}
	@Then("user will get successful message for registaration")
	public void user_will_get_successful_message_for_registaration() {
		try {
			Hooks.extentTest=Hooks.report.createTest("user will get successful message for registaration");	 
			registrationSteps.isDispalyed(RegistrationPageUi.successMessage);
			Hooks.report.flush();
		} catch (Exception e) {  
			e.printStackTrace();
		}
	    	} 
	@Then("user can logout from the application")
	public void user_can_logout_from_the_application() {
		try {
			Hooks.extentTest=Hooks.report.createTest("user can logout from the application");	 
			registrationSteps.clickOnElement(RegistrationPageUi.logoutText);
			Hooks.report.flush();
		} catch (Exception e) {
			 
			e.printStackTrace();
		}
	    	} 
	 

}
