package stepDefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pagefactory.*;

import java.util.concurrent.TimeUnit;

public class LoginCaseSteps_PF {

    WebDriver driver = null;
    LoginPage_PF login;
    HomePage_PF home;

    @Given("Browser has open")
    public void Browser_has_open() {

        System.out.println("======== Run by Page Factory =======");
        System.setProperty("webdriver.chrome.driver",
                "/Users/putraagung/IdeaProjects/SeleniumCucumber/src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @And("user in login page")
    public void user_in_on_login_page() {
        driver.navigate().to("https://example.testproject.io/web/");
    }

    @When("^user enters (.*) and (.*)$")
    public void user_enters_usn_and_pwd (String username, String password) throws InterruptedException {

        login = new LoginPage_PF(driver);
        login.enterUsername(username);
        login.enterPassword(password);

    Thread.sleep(2000);
    }

    @And("user click on login button")
    public void user_click_on_login_button() {
        login.clickLogin();
    }
    @Then("user navigated to the home page")
    public void user_navigated_to_the_home_page() throws InterruptedException {

        home=new HomePage_PF(driver);
        home.checkLogoutIsDisplayed();
        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }
}
