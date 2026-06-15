package Testrunner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
    features ="src/test/resources/folder", // Adjust path if needed
    glue = "Stepobjects",               // Package where your step definitions are
    plugin = {"pretty", "html:target/cucumber-report.html",
    		"json:target/cucumber.json",
    	 // "rerun:@target/failedSecnarios.txt"
    
    },
    monochrome = true,
    dryRun=false
)

public class parallelRunner extends AbstractTestNGCucumberTests {
	@Override
    @DataProvider(parallel =true)
public Object[][] scenarios() {
        return super.scenarios();
        
        
        
    }
}

