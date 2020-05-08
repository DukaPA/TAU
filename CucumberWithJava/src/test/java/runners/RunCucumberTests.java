package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(glue={"Steps"},features = "src/test/java/Features", plugin = {"pretty", "html:target/site/cucumber-pretty", "json:target/cucumber/json"})
public class RunCucumberTests {

}