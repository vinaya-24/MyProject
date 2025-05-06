package stepDefinations;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;

public class LoginSteps {
    WebDriver driver;

    @Given("User launches the browser")
    public void launchBrowser() {
        driver = new ChromeDriver();
    }

    @When("User opens Google homepage")
    public void openGoogle() {
        driver.get("https://www.google.com");
    }

    @Then("Page title should contain {string}")
    public void checkTitle(String expectedTitle) {
        assertTrue(driver.getTitle().contains(expectedTitle));
    }

    @And("Close the browser")
    public void closeBrowser() {
        driver.quit();
    }
}
