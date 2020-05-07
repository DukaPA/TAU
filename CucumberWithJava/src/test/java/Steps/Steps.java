package Steps;

import Base.BaseUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class Steps extends BaseUtil{

    private BaseUtil baseUtil;

    public Steps(BaseUtil util){
        this.baseUtil = util;
    }

    private WebDriver driver;

    @Before()
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dusan\\Gitreps\\TAU\\CucumberWithJava\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }


    @Given("I am in the login page")
    @Given("I am in the login page of Para Bank application")
    public void iAmInTheLoginPageOfParaBankApplication() {

        driver.get("http://parabank.parasoft.com/parabank/index.htm");
    }

    @When("I enter valid {string} and {string} with {string}")
    public void i_enter_valid_credentials(String username, String password, String userFullName1) {
        baseUtil.userFullName = userFullName1;
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("username")).submit();
    }

    @Then("I should be taken to the Overview page")
    public void i_should_be_taken_to_the_Overview_page() throws Exception {
//        WebDriverWait wait = new WebDriverWait(driver, 20);
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='rightPanel']/div/div/h1")));
//
       driver.findElement(By.xpath("//*[@id='rightPanel']/div/div/h1")).isDisplayed();

        String actualuserFullName = driver.findElement(By.className("smallText")).getText().toString();
        assertTrue(actualuserFullName, actualuserFullName.contains(baseUtil.userFullName));
        driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a")).click();


    }
    @After()
    public void quietBrowser(){
        driver.close();
    }


}
