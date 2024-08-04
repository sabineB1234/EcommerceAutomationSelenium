package automationExercise;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/specs/features/edisacProject/RegisterUserEdisac.feature"},
		//glue={"stepDefinition"},
	    plugin = {"pretty","html:target/cucumber-report.html","json:target/cucumber-report.json"},
	    		//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
	            //"io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"},
	    		//cucumber4-jvm
	        
	    monochrome = true,
	    //dryRun = false,
		tags ="@registeruserEdisac",
		snippets = SnippetType.CAMELCASE
		)

public class TestRunner {     

}
