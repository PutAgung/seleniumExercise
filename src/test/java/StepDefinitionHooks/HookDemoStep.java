package StepDefinitionHooks;

import io.cucumber.java.*;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HookDemoStep {

    WebDriver driver = null;

    @Before(order = 1)
    public void  browserSetup(){
        System.out.println("==== Im inside Browser setup ====");
        System.setProperty("webdriver.chrome.driver",
                "src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Before (order = 0)
    public void  browserSetup2() {
        System.out.println("==== Im inside browser setup2 ====");
    }


    @After
    public void  tearDown(){
     System.out.println("==== Im inside teardown ====");
     driver.close();
     driver.quit();
    }

    @BeforeStep
    public void  beforeSteps() {
        System.out.println("==== Im inside before steps ====");
    }

    public void  afterSteps() {
        System.out.println("==== Im inside after steps ====");
    }




    @Given("user at login page")
    public void user_at_login_page() {

    }
    @When("user enter valid username and password")
    public void user_enter_valid_username_and_password() {

    }
    @When("click at login button")
    public void click_at_login_button() {

    }
    @Then("user directed to home page")
    public void user_directed_to_home_page() {

    }
}
