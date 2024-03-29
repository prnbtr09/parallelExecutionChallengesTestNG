package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateDriver {
    private static CreateDriver INSTANCE;

    private WebDriver driver;
    private ThreadLocal<WebDriver> webDriverThreadLocal=new ThreadLocal<>();

    private CreateDriver() {

    }

    public static CreateDriver getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CreateDriver();
        }
        return INSTANCE;
    }

    public void setDriver() {
        WebDriverManager.chromedriver().setup();
        webDriverThreadLocal.set(new ChromeDriver());
    }

    public WebDriver getDriver() {
        return webDriverThreadLocal.get();
    }


}
