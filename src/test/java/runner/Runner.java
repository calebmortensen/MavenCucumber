package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//@all tag runs ALL Scenarios. Can use 'and' 'or'  'not' between tags too
@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",
		glue="stepdefinitions",
		plugin={"pretty","html:target/CucumberReport.html"})  //,tags="@all"

public class Runner {

}
