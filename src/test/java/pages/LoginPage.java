package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage {

    private WebDriver driver;


    //Locators

    private By usernameInputLocator = By.id("user-name");
    private By passwordInputLocator = By.id("password");
    private By loginButtonLocator = By.id("login-button");

    //Constructor - so that cannot access the driver outside of this class
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //Method to input the username
    public void enterUsername(String username){
        WebElement usernameInput = driver.findElement(usernameInputLocator);
        usernameInput.sendKeys(username);
    }

    //Method to input the password
    public void enterPassword(String password){
        WebElement passwordInput = driver.findElement(passwordInputLocator);
        passwordInput.sendKeys(password);
    }

    //Method to click on the login button
    public void clickOnLogin(){
        WebElement loginButton = driver.findElement(loginButtonLocator);
        loginButton.click();
    }

    //Method to validate the page title
    public void validatePageTitle(String expTitle){
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expTitle);
    }




}
