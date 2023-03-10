Feature: Referral Registration
  As a user, I want to be able to register for the referral program so that I can refer my friends and earn rewards.
  
  Scenario: Successful Referral Registration
    Given I am on the referral registration page
    When I enter my name
    And  I enter the my email 
    And  I enter the mobile number 
    And  I enter the Address
    And  I select the country 
    And  I enter the Pincode 
    And  I Enter the Nominee name 
    And  I enter the Nominee Relation 
    And  I enter the password 
    And  I enter the confirmpassword 
    And I click the "Submit" button
    Then I should see a confirmation message saying that my registration was successful
    
  