package AutomationPractice;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{
    @FindBy(css = "#login_form")
    public WebElement loginPage;

    @FindBy(css = "#email")
    public WebElement email;

    @FindBy(css = "#passwd")
    public WebElement password;

    @FindBy(css = "#SubmitLogin")
    public WebElement submitButton;

    @FindBy(css = ".account")
    public WebElement homepage;

    @FindBy(css = "#authentication")
    public WebElement validationMessage;

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    public boolean isUserOnLoginPage(){
        return loginPage.isDisplayed();
    }

    public void userWithValidLoginDetails(){
        email.sendKeys("testaccount@mailinator.com");
        password.sendKeys("Password1");
    }

    public void userWithInvalidLoginDetails(){
        email.sendKeys("    ");
        password.sendKeys("  ");
    }

    public void userClickingOnSubmitButton(){

        submitButton.click();
    }

    public boolean isUserOnHomePage(){
        return homepage.isDisplayed();
    }

    public boolean isValidationMessageDisplayed(){
        validationMessage.getText();
        System.out.println(validationMessage);
        return validationMessage.isDisplayed();
    }

}
