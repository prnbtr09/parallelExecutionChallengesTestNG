package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
//import static driver.DriverManager.driver;


public class Hooks {

    @Before
    public void setUp(){
        System.out.println("In Pre steps");
    }

    @After
    public void tearDown(){
        System.out.println("In After");
//        driver.quit();
    }
}
