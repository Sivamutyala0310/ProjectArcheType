package com.atmecs.project.testscripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.atmecs.project.constants.ConstantFilePaths;
import com.atmecs.project.constants.TimeOuts;
import com.atmecs.project.helperpages.ScenarioHelper;
import com.atmecs.project.reports.LogReports;
import com.atmecs.project.testbase.TestBase;
import com.atmecs.project.utils.ReadLocatorsFile;

public class ProjectTestcase2 extends TestBase
{
	LogReports log = new LogReports();
	
	String url;
	
	@BeforeClass
	public void before() throws IOException {
	url = ReadLocatorsFile.getData(ConstantFilePaths.CONFIG_FILE,"url1");
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(TimeOuts.requiredPageLoadTime, TimeUnit.MINUTES);
	driver.manage().timeouts().implicitlyWait(TimeOuts.requiredImplicitWaitTime, TimeUnit.SECONDS);
	}
	
@Test
	public void testcase2() throws IOException
	{
	ScenarioHelper helper=new ScenarioHelper(driver);
	helper.performAction();
		}

}
