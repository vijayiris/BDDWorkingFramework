package RunnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		
		features= {"src/test/resources/Features"},
		glue= {"StepDefinations"},
		plugin= {"pretty", "html:target/htmlreport.html"},
		dryRun = false,
		tags= "@smoke" 
		
)
public class RunnerTest  extends AbstractTestNGCucumberTests{
	


}
