Feature: Search Functionality
  @Search
  Scenario: Verify that user can search an "<item>"
    Given user is on the login page
    When  user clicks on the signin button
    Then  user should navigate to the login page
    When  user enters the username as "testaccount@mailinator.com", password as "Password1"
    And   user clicks on submit button
    Then  user should be logged in successfully
    And   user should be on the home page with search field text box
    When  user enters the item name in the search field text box
    And   clicks on the submit button
    Then  user should be navigated to the products page of the item

