package com.TestRunnerCRM;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import com.vimalselvam.cucumber.listener.Reporter;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features",
				plugin = {"pretty", "html:reports/cucumberreport","json:reports/cucumberreport/jsonreport",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
						},
		glue="com.stepDefinitionCRM",
				
		strict= true
					
		)

public class TestRunnerCRM {
	
		
	  @AfterClass
	  
	  public static void Extentsreport()
	  
	  {
		  Reporter.loadXMLConfig("src/test/resources/extent-config2.xml");
	  Reporter.setSystemInfo("user", System.getProperty("user.name"));
	  Reporter.setSystemInfo("os", "Windows");
	  Reporter.setTestRunnerOutput("Sample test runner output message"); }
	 

}

