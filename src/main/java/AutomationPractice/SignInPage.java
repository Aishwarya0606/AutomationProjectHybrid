package AutomationPractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BasePage{

    @FindBy(css = ".login")
    WebElement signinButton;

   public SignInPage(){ PageFactory.initElements(driver,this);}

    public void userClickingOnSignInButton() {
        signinButton.click();
    }
    public boolean userIsOnTheSignInPage(){
        return driver.getTitle().contains("My Store");
    }
}