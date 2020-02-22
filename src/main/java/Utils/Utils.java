package Utils;

import AutomationPractice.BasePage;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Utils extends BasePage {

public void waitForTheElementToRespond(int time){
    driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);

}

public void maximizeTheWindows(){
    driver.manage().window().maximize();
}
}
