package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleSearchSteps {

    WebDriver driver = null;

    @Given("Browser is open")
    public void browser_is_open() {
        System.setProperty("webdriver.chrome.driver",
                "/Users/putraagung/IdeaProjects/SeleniumCucumber/src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @And("user in on google search page")
    public void user_in_on_google_search_page() {
        driver.navigate().to("https://www.google.com");
    }
    @When("user enter a text in search box")
    public void user_enter_a_text_in_search_box() {
        driver.findElement(By.name("q")).sendKeys("Putra Agung");
    }
    @And("hits enter")
    public void hits_enter() {
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }
    @Then("user navigated to the search results")
    public void user_navigated_to_the_search_resutls() {
        driver.getPageSource().contains("PUTRA AGUNG Tour & Travel");
        driver.close();
        driver.quit();
    }

}
