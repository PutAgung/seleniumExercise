//package stepDefinitions;
//import io.cucumber.java.en.*;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.concurrent.TimeUnit;
//
//public class LoginCaseSteps {
//
//    WebDriver driver = null;
//
//    @Given("Browser has open")
//    public void Browser_has_open() {
//        System.setProperty("webdriver.chrome.driver",
//                "/Users/putraagung/IdeaProjects/SeleniumCucumber/src/test/resources/drivers/chromedriver");
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//    }
//
//    @And("user in login page")
//    public void user_in_on_login_page() {
//        driver.navigate().to("https://example.testproject.io/web/");
//    }
//
//    @When("^user enters (.*) and (.*)$")
//    public void user_enters_usn_and_pwd (String username, String password) throws InterruptedException {
//        driver.findElement(By.id("name")).sendKeys(username);
//        driver.findElement(By.id("password")).sendKeys(password);
//    Thread.sleep(2000);
//    }
//    @And("user click on login button")
//    public void user_click_on_login_button() {
//        driver.findElement(By.id("login")).click();
//    }
//    @Then("user navigated to the home page")
//    public void user_navigated_to_the_home_page() {
//        driver.close();
//        driver.quit();
//    }
//}
