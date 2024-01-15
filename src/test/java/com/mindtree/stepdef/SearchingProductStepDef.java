package com.mindtree.stepdef;



import com.mindtree.steps.CatalogSteps;
import com.mindtree.steps.HomePageSteps;
import com.mindtree.steps.LoginSteps;
import com.mindtree.steps.OrderPageSteps;
import com.mindtree.steps.ProductPageSteps;
import com.mindtree.steps.RegistrationSteps;
import com.mindtree.uiStore.CatalogHomePageUi;
import com.mindtree.uiStore.ProductpageUi;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchingProductStepDef {
	CatalogSteps catalogSteps = new CatalogSteps();
	LoginSteps loginSteps = new LoginSteps();
	HomePageSteps homePageSteps = new HomePageSteps();
	ProductPageSteps productpage = new ProductPageSteps();
	RegistrationSteps registrationSteps = new RegistrationSteps();
	OrderPageSteps orderPageSteps = new OrderPageSteps();
	 
 

		@When("user click on search button")
		public void user_click_on_search_button() {
			try {
				Hooks.extentTest=Hooks.report.createTest("user click on search button");	
  catalogSteps.clickOnElement(CatalogHomePageUi.searchedBox);
				 
   Hooks.report.flush();
			} catch (Exception e) {
				 
				e.printStackTrace();
			}
		}

		 
		 @And("user enter product {string} in search box")
		public void user_enter_product_in_search_box(String searchKeyword) {
			 try {
				Hooks.extentTest=Hooks.report.createTest("user enter product in search box");	
				 catalogSteps.sendkeysToLocator(CatalogHomePageUi.searchedBox, searchKeyword);
				 catalogSteps.clickOnElement(CatalogHomePageUi.submitSearch);
				   Hooks.report.flush();
			} catch (Exception e) {
				 
				e.printStackTrace();
			}
		 
		}

		@Then("user will get search {string}")
		public void user_will_get_search(String  searchResult) {
			try {
				Hooks.extentTest=Hooks.report.createTest("user will get search reslts");	
				productpage.isElementDisplayed(ProductpageUi.searchedProduct,searchResult);
				
				 Hooks.report.flush();
			} catch (Exception e) {
				 
				e.printStackTrace();
			}
		    
		    
		}

}
