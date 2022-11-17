//package stepDefinitions;
//
//import PagesObjects.loginPage;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.json.JsonOutput;
//
//import java.util.concurrent.TimeUnit;
//
//public class LoginCaseSteps_POM {
//
//    WebDriver driver = null;
//    loginPage login;
//
//    @Given("Browser has open")
//    public void Browser_has_open() {
//        System.out.println("======= Running by POM ======");
//        System.setProperty("webdriver.chrome.driver",
//                "/Users/putraagung/IdeaProjects/SeleniumCucumber/src/test/resources/drivers/chromedriver");
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//    }
//    @And("user in login page")
//    public void user_in_on_login_page() {
//        driver.navigate().to("https://example.testproject.io/web/");
//    }
//    @When("^user enters (.*) and (.*)$")
//    public void user_enters_usn_and_pwd (String username, String password) throws InterruptedException {
//        login = new loginPage(driver);
//        login.enterUsername(username);
//        login.enterPassword(password);
//
//    Thread.sleep(2000);
//    }
//    @And("user click on login button")
//    public void user_click_on_login_button() {
//        login.clickLogin();
//    }
//    @Then("user navigated to the home page")
//    public void user_navigated_to_the_home_page() {
//        login.checkLogOutIsDisplayed();
//        driver.close();
//         driver.quit();
//    }
//}
