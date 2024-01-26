package testClasses;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTestStatic {

    private static ThreadLocal<WebDriver> threadLocalDriver=new ThreadLocal<>();


    @BeforeMethod
    public void preSteps() {
        WebDriverManager.chromedriver().setup();
        threadLocalDriver.set(new ChromeDriver());
        threadLocalDriver.get().get("https://www.saucedemo.com/");
    }

    @Test()
    public void loginTest() {
        System.out.println("in test1");
        threadLocalDriver.get().findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        threadLocalDriver.get().findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        threadLocalDriver.get().findElement(By.xpath("//input[@id='login-button']")).click();
        Assert.assertTrue(threadLocalDriver.get().findElement(By.xpath("//*[text()='Products']")).isDisplayed());
    }

    @Test()
    public void loginTest2() {
        System.out.println("in test2");
        threadLocalDriver.get().findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        threadLocalDriver.get().findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        threadLocalDriver.get().findElement(By.xpath("//input[@id='login-button']")).click();
        Assert.assertTrue(threadLocalDriver.get().findElement(By.xpath("//*[text()='Products']")).isDisplayed());
    }

    @AfterMethod
    public void postSteps() {
        threadLocalDriver.get().quit();
    }


}
