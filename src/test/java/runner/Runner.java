package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//@all tag runs ALL Scenarios. Can use 'and' 'or'  'not' between tags too
//all vs individual: src/test/java/features.Search.feature
@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",
		glue={"stepdefinitions"},
	  //tags="@smoke" "@all"
		//publish=true, //publishes to cucumber.io
		//dryRun=false, //false is default - runs everything even if a feature isn't implemented
		plugin={"pretty",
				"html:target/CucumberReport.html",
				"json:target/CucumberReport.json",
				"junit:target/CucumberReport.xml"})

public class Runner {

}

