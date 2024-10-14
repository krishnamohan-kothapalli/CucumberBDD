package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class loginPage {


    private WebDriver driver;
    private LoginPage loginPage;


    // Cucumber hooks same like testNG
    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }

    @Given("user launches the website")
    public void userLaunchesTheWebsite() {
        driver.get("https://www.saucedemo.com/v1/");
        loginPage = new LoginPage(driver);
    }

    @Given("user entered {string} and {string}")
    public void userEnteredLoginDetails(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @When("user clicks on login button")
    public void userClicksOnLoginButton() {
        loginPage.clickOnLogin();
    }

    @Then("user validates the title of the page {string}")
    public void userValidatesTheTitleOfThePage(String title) {
        loginPage.validatePageTitle(title);
    }
}
