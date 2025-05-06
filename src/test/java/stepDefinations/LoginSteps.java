package stepDefinations;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {

    LoginPage loginPage;

    @Given("User launches the browser")
    public void launchBrowser() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
    }

    @When("User navigates to login page")
    public void navigateToLogin() {
        loginPage.navigateToLoginPage();
    }

    @When("User enters credentials")
    public void enterCredentials(DataTable table) {
        Map<String, String> data = table.asMap();
        loginPage.enterUsername(data.get("username"));
        loginPage.enterPassword(data.get("password"));
    }

    @Then("User should see the homepage")
    public void verifyLogin() {
        loginPage.verifyHomePage();
    }
}
