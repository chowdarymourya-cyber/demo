package Testrunner;

//fix  add depdnices 37 line 31 in pom.xml

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features ="@target/failedSecnarios.txt", 
    glue = "Stepobjects",
    plugin = {
        "pretty",
       "html:target/rerun-report.html",
       // "rerun:target/failedSecnarios.txt"
       
       // "json:target/rerun-report.json"
    },
    monochrome = true
  //  dryRun = false
)
public class FailedTestRunner {
}


//monochrome =true
//dryrun=true



//monochrome =true;
//