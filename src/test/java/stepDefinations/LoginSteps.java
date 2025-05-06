package stepDefinations;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.GooglePage;
import utils.DriverFactory;

public class LoginSteps {
    GooglePage googlePage;

    @Given("User launches the browser")
    public void user_launches_the_browser() {
        DriverFactory.initDriver();
    }

    @When("User opens Google homepage")
    public void user_opens_google_homepage() {
        DriverFactory.getDriver().get("https://www.google.com");
        googlePage = new GooglePage(DriverFactory.getDriver());
    }

    @Then("Page title should contain {string}")
    public void page_title_should_contain(String title) {
        Assert.assertTrue(googlePage.getPageTitle().contains(title));
    }

    @Then("Close the browser")
    public void close_the_browser() {
        DriverFactory.quitDriver();
    }
}
