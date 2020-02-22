package java.BDDAutomationProject;

import AutomationPractice.LoginPage;
import Utils.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class LoginPageSteps {
    LoginPage login = new LoginPage();
    Utils util = new Utils();


    @Then("user should navigate to the login page")
    public void userShouldNavigateToTheLoginPage() {

        Assert.assertTrue(login.isUserOnLoginPage());

    }

    @Given("user enters the username as {string}, password as {string}")
    public void userEntersTheUsernameAsPasswordAs(String arg0, String arg1)  {

        login.userWithValidLoginDetails();

    }

    @And("user clicks on submit button")
    public void userClicksOnSubmitButton() {
     login.userClickingOnSubmitButton();
     util.waitForTheElementToRespond(3);

    }

    @Then("user should be logged in successfully")
    public void userShouldBeLoggedInSuccessfully() {

        Assert.assertTrue(login.isUserOnHomePage());

    }
    @Then("user should not  be logged in successfully")
    public void userShouldNotBeLoggedInSuccessfully() {
        login.userWithInvalidLoginDetails();

    }

    @And("user should see a validation message as {string}")
    public void userShouldSeeAValidationMessageAs(String arg0) {

        Assert.assertTrue(login.isValidationMessageDisplayed());
    }
}
