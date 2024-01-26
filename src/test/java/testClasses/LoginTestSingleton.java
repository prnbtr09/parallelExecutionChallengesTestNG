package testClasses;

import driver.CreateDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTestSingleton {
    private static WebDriver driver;

    @Parameters("url")
    @BeforeMethod
    public void preSteps(String url) {
        CreateDriver.getInstance().setDriver();
        driver=CreateDriver.getInstance().getDriver();
        driver.get(url);
    }

    @Test()
    public void loginTest() {
        System.out.println("in test1");
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Products']")).isDisplayed());
    }

    @Test()
    public void loginTest2() {
        System.out.println("in test2");
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Products']")).isDisplayed());
    }

    @AfterMethod
    public void postSteps() {
        driver.quit();
    }


}
