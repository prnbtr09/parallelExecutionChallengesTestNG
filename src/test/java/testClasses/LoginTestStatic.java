package testClasses;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTestStatic {
    private static WebDriver driver;

    @Parameters("url")
    @BeforeMethod
    public void preSteps(String url) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
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
