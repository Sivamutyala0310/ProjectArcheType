#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.testscripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ${package}.constants.ConstantFilePaths;
import ${package}.constants.TimeOuts;
import ${package}.helperpages.ScenarioHelper;
import ${package}.reports.LogReports;
import ${package}.testbase.TestBase;
import ${package}.utils.ReadLocatorsFile;

public class ${artifactId}Testcase2 extends TestBase
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
