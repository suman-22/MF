package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( features="src/test/Features", glue= {"Steps"})
public class Run extends AbstractTestNGCucumberTests {
}
