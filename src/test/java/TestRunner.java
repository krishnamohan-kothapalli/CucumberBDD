
// Explicitly telling the runner where my feature files and step definition files are located

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions( features = "src/test/resources/features",
                    glue = {"stepDefinitions"},
                    plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber.json"},
                    monochrome = true,
                    publish = true)

//Plugins to generate reports
//Monochrome - to generate the content in a cleaner way on the console
//Publish reports to the cloud

public class TestRunner extends AbstractTestNGCucumberTests {

    //AbstractTestNGCucumberTests class will help the test cases to run in parallel mode
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios(){
        return super.scenarios();
    }

}
