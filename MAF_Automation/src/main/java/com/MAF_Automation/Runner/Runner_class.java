package com.MAF_Automation.Runner;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class Runner_class {
	
	
	@CucumberOptions(features ={"C:\\Users\\Dell\\eclipse-workspace\\MAF_Automation\\src\\main\\java\\Feature\\Maf.feature"},
	                    glue = {"com.MAF_Automation.Stepdefinations", "com.MAF_Automation"},
	                    plugin ={"pretty", "html:target/cucumber"},
	                   	monochrome = true,
	                   tags = {"@web"},
//	                   tags= {"Smoke"},
	                   dryRun = false,
			           strict = true
	                      )


	@Test
	public class RunTest extends AbstractTestNGCucumberTests
	{
      
	}


}
