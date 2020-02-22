package java.BDDAutomationProject;

import AutomationPractice.SearchPage;
import Utils.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class SearchPageSteps {
    SearchPage search = new SearchPage();
    Utils util = new Utils();


    @And("user should be on the home page with search field text box")
    public void userShouldBeOnTheHomePageWithSearchFieldTextBox() {
        search.isUserOnSearchPage();
    }

    @When("user enters the item name in the search field text box")
    public void userEntersTheItemNameInTheSearchFieldTextBox() {
        search.userCanSearchAnItem();

    }

    @And("clicks on the submit button")
    public void clicksOnTheSubmitButton() {
        search.userClickingOnSearchButton();
        util.waitForTheElementToRespond(3);}


    @Then("user should be navigated to the products page of the item")
    public void userShouldBeNavigatedToTheProductsPageOfTheItem(){

        Assert.assertTrue(search.productsGridIsDisplayed());


        }
    }
