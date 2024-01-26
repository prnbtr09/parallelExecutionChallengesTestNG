package testClasses;

import driver.CreateDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTestSingleton {

    @BeforeMethod
    public void preSteps() {
        CreateDriver.getInstance().setDriver();
        CreateDriver.getInstance().getDriver().get("https://www.saucedemo.com/");
    }

    @Test()
    public void loginTest() {
        System.out.println("in test1");
        CreateDriver.getInstance().getDriver().findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        CreateDriver.getInstance().getDriver().findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        CreateDriver.getInstance().getDriver().findElement(By.xpath("//input[@id='login-button']")).click();
        Assert.assertTrue(CreateDriver.getInstance().getDriver().findElement(By.xpath("//*[text()='Products']")).isDisplayed());
    }

    @Test()
    public void loginTest2() {
        System.out.println("in test2");
        CreateDriver.getInstance().getDriver().findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        CreateDriver.getInstance().getDriver().findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        CreateDriver.getInstance().getDriver().findElement(By.xpath("//input[@id='login-button']")).click();
        Assert.assertTrue(CreateDriver.getInstance().getDriver().findElement(By.xpath("//*[text()='Products']")).isDisplayed());
    }

    @AfterMethod
    public void postSteps() {
        CreateDriver.getInstance().getDriver().quit();
    }


}
