package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.ITestContext;
import org.testng.annotations.*;

@CucumberOptions(features = "src/test/resources",
        glue = {"stepDefs", "hooks"},
        tags = "@ParallelExecution",
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "rerun:target/failed.txt"})
public class UITestRunnnerTestNG extends AbstractTestNGCucumberTests {

    @DataProvider(parallel = true)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }

    @BeforeSuite
    public void beforeSuite() {
//        System.out.println("before execution of suite");
    }

    @AfterSuite
    public void afterSuite() {
//        System.out.println("in after suite");
    }


    @BeforeClass
    public void beforeClass(ITestContext context) {
//        System.out.println("before class");
        context.getCurrentXmlTest().getSuite().setDataProviderThreadCount(2);
    }


    @AfterClass
    public void afterClass() {
//        System.out.println("after class");
    }
}
