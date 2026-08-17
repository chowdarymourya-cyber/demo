  package Testrunner;
import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features ="src/test/resources/folder/login.feature", // Adjust path if needed
    glue = "Step_Defination",               // Package where your step definitions are
    plugin = {"pretty", 
    		"html:target/rerun-report.html", 
    		"json:target/cucumber.json"
    },
    monochrome= true,
  dryRun=true
    
    		
 		
    		 
)
    		
public class Runner { 
    
}



