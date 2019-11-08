package it.pkg.testscripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import it.pkg.constants.ConstantFilePaths;
import it.pkg.constants.TimeOuts;
import it.pkg.helperpages.ScenarioHelper;
import it.pkg.reports.LogReports;
import it.pkg.testbase.TestBase;
import it.pkg.utils.ReadLocatorsFile;

	public class basicTestcase extends TestBase {
		LogReports log = new LogReports();
		String url;
		
		@BeforeClass
		public void before() throws IOException {
		url = ReadLocatorsFile.getData(ConstantFilePaths.CONFIG_FILE,"url");
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TimeOuts.requiredPageLoadTime, TimeUnit.MINUTES);
		driver.manage().timeouts().implicitlyWait(TimeOuts.requiredImplicitWaitTime, TimeUnit.SECONDS);
		}
	
		@Test
		public void testcase1() throws IOException {
			
			   //Creating the JavascriptExecutor interface object by Type casting		
	        JavascriptExecutor execute = (JavascriptExecutor)driver;		
	        		
	        //Fetching the Domain Name of the site.	
	        String DomainName = execute.executeScript("return document.domain;").toString();			
	        log.info("Domain name of the site = "+DomainName);					
	          		
	        //Fetching the URL of the site.		
	        String url = execute.executeScript("return document.URL;").toString();	//Tostring() change object to name.		
	        log.info("URL of the site = "+url);					
	          		
	       //Method document.title fetch the Title name of the site.	
	       String TitleName = execute.executeScript("return document.title;").toString();			
	       log.info("Title of the page = "+TitleName);					

			ScenarioHelper helper=new ScenarioHelper(driver);
			helper.performAction();
	
		}
	}
