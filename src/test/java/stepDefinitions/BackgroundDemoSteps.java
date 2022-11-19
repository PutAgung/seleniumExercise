package stepDefinitions;

import io.cucumber.java.en.*;

public class BackgroundDemoSteps {

    //==== Background ====//
    @Given("user in a login page")
    public void user_in_a_login_page() {
    }
    @When("user enter usn and pwd")
    public void user_enter_usn_and_pwd() {
    }
    @And("clicking at login button")
    public void clicking_at_login_button() {
    }
    @Then("user is navigated to the homepage")
    public void user_is_navigated_to_the_homepage() {
    }

   //==== Scenario 1 ====//
    @When("user click on welcome link")
    public void user_click_on_welcome_link() {;
    }
    @Then("logout link is displayed")
    public void logout_link_is_displayed() {
    }

    //==== Scenario 2 ====//
    @When("user click on dashboard link")
    public void user_click_on_dashboard_link() {
    }
    @Then("quick launch toolbar is displayed")
    public void quick_launch_toolbar_is_displayed() {
    }
}
