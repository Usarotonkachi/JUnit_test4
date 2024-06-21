Feature: Google Sign Up

  Scenario: Successful sign up
    Given I open the Google Sign Up page
    When I enter first name as "Jackie"
    And I enter last name as "Lin"
    And I click Next on the name page
    And I enter birthday as "1", "January", "1991"
    And I select gender as "Female"
    And I enter username as "jackielin1991"
    And I enter password as "SecurePassword123"
    And I confirm password as "SecurePassword123"
    And I click Next on the password page
    Then I should be redirected to the Google Home page
