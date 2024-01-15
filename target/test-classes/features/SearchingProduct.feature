Feature: As a user of pet store i want to search for a product
 Background:
 Given user is successfully naviaged to "https://jpetstore.aspectran.com/catalog/"
  @searchingForProduct
  Scenario Outline: searching for a prodct  
    And user enter product "<searchkeyword>" in search box
    When user click on search button
    Then user will get search "<searchResult>"
     
     Examples:
    | searchkeyword | searchResult|
    |Angelfish      |Angelfish    |
      
     