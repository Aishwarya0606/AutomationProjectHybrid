package AutomationPractice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage  {
 public static WebDriver driver;
 public static String baseURL = "http://automationpractice.com/index.php";

 public BasePage(){
     PageFactory.initElements(driver,this);
 }


}
