package java.BDDAutomationProject;



import AutomationPractice.SignInPage;
import Utils.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class SignInPageSteps {
Utils util = new Utils();

 SignInPage signin = new SignInPage();


    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {

        Assert.assertTrue(signin.userIsOnTheSignInPage());

    }

    @When("user clicks on the signin button")
    public void userClicksOnTheSigninButton() {

        signin.userClickingOnSignInButton();
        util.waitForTheElementToRespond(3);


    }
}
