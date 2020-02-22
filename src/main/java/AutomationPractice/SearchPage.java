package AutomationPractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BasePage{

    @FindBy(css = "#search_query_top")
    public WebElement searchFieldTextBox;

    @FindBy(css = ".btn.btn-default.button-search")
    public WebElement submitButton;

    @FindBy(xpath = "//ul[@class=\"product_list grid row\"]")
    public WebElement productsPage;

    public SearchPage(){

        PageFactory.initElements(driver,this);

    }

    public boolean isUserOnSearchPage(){

        return searchFieldTextBox.isDisplayed();

    }

    public void userCanSearchAnItem(){

        searchFieldTextBox.sendKeys("T-Shirts");
    }

    public void userClickingOnSearchButton(){

        submitButton.click();
    }

    public boolean productsGridIsDisplayed(){

        productsPage.getText();
        System.out.println(productsPage.getText());
       return  productsPage.isDisplayed();

    }


}
