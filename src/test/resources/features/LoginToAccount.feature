Feature: As a user of pet store i want to login to my account
Background:
 Given user is successfully naviaged to "https://jpetstore.aspectran.com/catalog/"

 
  @loginToAccount
  Scenario Outline: login to my account 
    When user click on sign in button
    And user enters userName and Password  
    When user click on login button
    Then user will navigated to homepage  
   
  

    
   
       
   