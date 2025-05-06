package stepDefinations;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.assertTrue;

public class LoginSteps {

    WebDriver driver;

    @Given("User launches the browser")
    public void user_launches_the_browser() {
        driver = new ChromeDriver();  // make sure WebDriverManager is setup if needed
    }

    @When("User opens Google homepage")
    public void user_opens_google_homepage() {
        driver.get("https://www.google.com");
    }

    @Then("Page title should contain {string}")
    public void page_title_should_contain(String expectedTitle) {
        String actualTitle = driver.getTitle();
        assertTrue(actualTitle.contains(expectedTitle), "Title does not match!");
    }

    @And("Close the browser")
    public void close_the_browser() {
        if (driver != null) {
            driver.quit();
        }
    }
}