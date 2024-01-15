Feature: As a user of pet store i want to register for an account
Background:
   Given user is successfully naviaged to "https://jpetstore.aspectran.com/account/newAccountForm"
 
     @register  
    Scenario Outline: registering for an account 
    When user enters user information
    And user enter account information
    And user enter profile information
    Then user click on save accouunt information
    Then user will get successful message for registaration
   

    
   
       
   