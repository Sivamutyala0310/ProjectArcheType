package it.pkg.testscripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import it.pkg.constants.ConstantFilePaths;
import it.pkg.constants.TimeOuts;
import it.pkg.helperpages.ScenarioHelper;
import it.pkg.reports.LogReports;
import it.pkg.testbase.TestBase;
import it.pkg.utils.ReadLocatorsFile;

public class basicTestcase2 extends TestBase
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
