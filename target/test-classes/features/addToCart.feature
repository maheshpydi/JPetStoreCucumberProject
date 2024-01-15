Feature: As a user of the application i want to order a product  
Background:
      Given user is successfully naviaged to "https://jpetstore.aspectran.com/catalog/"
  
  @addToCart
  Scenario: ordering a product  
      @addToCart
  Scenario:  search functionality 
     When user enters "product" in searchbox in amazon
     And user click on searchbox in homepage
     And user waits for page to load
     Then search results should display
     Examples:
      |product|
      |mobile|
      |tv|
      |Refridgerator|
     
    
 
    
 