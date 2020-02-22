package java.BDDAutomationProject;


import AutomationPractice.BasePage;
import Utils.Utils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends BasePage {
Utils util = new Utils();
    @Before
    public void startingTheBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(baseURL);
        util.maximizeTheWindows();
    }
    @After
    public void quittingTheBrowser(){
        driver.close();
        driver.quit();

    }





}
