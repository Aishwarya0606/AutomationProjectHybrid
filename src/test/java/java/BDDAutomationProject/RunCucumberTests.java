package java.BDDAutomationProject;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/features",
        tags = "@validlogin, @Search",

       plugin = "html:target/CucumberHTMLReports")

public class RunCucumberTests {





}
