Feature: Login Functionality

  Background:

    Given user is on the login page
    When user clicks on the signin button
    Then user should navigate to the login page

    @validlogin
    Scenario: Verify user can login with valid login credentials
      Given user enters the username as "testaccount@mailinator.com", password as "Password1"
      And   user clicks on submit button
      Then  user should be logged in successfully

    @invalidlogin
    Scenario: Verify user cannot login with invalid credentials
      Given user enters the username as "   ", password as "   "
      And   user clicks on submit button
      Then  user should not  be logged in successfully
      And   user should see a validation message as "An email address required."
