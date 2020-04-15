package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
				features = "F://Eclipse//SeleniumCucumberProject//features//OrangeHRM.feature",
				glue = "stepDefinitions"
		)


public class TestRunner {

}