package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginStepDef {

    public WebDriver driver;



    @Given("user has launched url {string}")
    public void launchURL(String url) {
//        driver=DriverManager.getDriver();
//        driver.get(url);
    }

    @Given("user has entered username {string} and password {string}")
    public void enteredCredentials1(String userName, String password) throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(userName);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
    }

    @When("User click on Login")
    public void clickOnLogin() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
    }


}
