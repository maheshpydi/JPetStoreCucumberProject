package com.mindtree.stepdef;

 

import com.mindtree.steps.CatalogSteps;
import com.mindtree.steps.HomePageSteps;
import com.mindtree.steps.LoginSteps;
import com.mindtree.steps.OrderPageSteps;
import com.mindtree.steps.ProductPageSteps;
import com.mindtree.steps.RegistrationSteps;
import com.mindtree.uiStore.CatalogHomePageUi;
import com.mindtree.uiStore.HomePageUi;
import com.mindtree.uiStore.LoginPageUi;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	CatalogSteps catalogSteps = new CatalogSteps();
	LoginSteps loginSteps = new LoginSteps();
	HomePageSteps homePageSteps = new HomePageSteps();
	ProductPageSteps productpage = new ProductPageSteps();
	RegistrationSteps registrationSteps = new RegistrationSteps();
	OrderPageSteps orderPageSteps = new OrderPageSteps();
	public static String userName;
	public static String Password;
	@When("user click on sign in button")
	public void user_click_on_sign_in_button() {
		try {
			Hooks.extentTest=Hooks.report.createTest("user click on sign in button");	 
			catalogSteps.clickOnElement( CatalogHomePageUi.signInText);
					 
			Hooks.report.flush();
		} catch (Exception e) {
			 
			e.printStackTrace();
		}
	}
	@When("user enters userName and Password")
	public void user_enters_user_name_and_password() {
		try {
			Hooks.extentTest=Hooks.report.createTest("user enters userName and Password");
			loginSteps.sendkeysToLocator(LoginPageUi.userName,userName);
			loginSteps.sendkeysToLocator(LoginPageUi.password ,Password);    
			Hooks.report.flush();
		} catch (Exception e) {
			 
			e.printStackTrace();
		}
		
	    
	}
	@Then("user will navigated to homepage")
	public void user_will_navigated_to_homepage() {
		try {
			Hooks.extentTest=Hooks.report.createTest("user will navigated to homepage");
			homePageSteps.isLocatorDisplayed(HomePageUi.signOut);
			Hooks.report.flush();
		} catch (Exception e) {  
			e.printStackTrace();
		}
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		try {
			Hooks.extentTest=Hooks.report.createTest("user click on login button");
  loginSteps.clickOnElement(LoginPageUi.submitSignIn);
			Hooks.report.flush();
		} catch (Exception e) {
			 
			e.printStackTrace();
		}
	}

}
 
