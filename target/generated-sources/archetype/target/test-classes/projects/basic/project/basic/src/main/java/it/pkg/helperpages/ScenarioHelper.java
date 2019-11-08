package it.pkg.helperpages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import it.pkg.constants.ConstantFilePaths;
import it.pkg.pageactions.PageActionsClick;
import it.pkg.reports.LogReports;
import it.pkg.utils.ReadLocatorsFile;



public class ScenarioHelper {
	public WebDriver driver;
	Properties properties;
	LogReports log = new LogReports();
	String locatorProperty;
	String actualTextTitle;

	public ScenarioHelper(WebDriver driver) {
		this.driver = driver;
	}

	public void performAction() throws IOException {
		properties=ReadLocatorsFile.loadProperty(ConstantFilePaths.LOCATORS_FILE);
		locatorProperty=properties.getProperty("loc.SearchDropDown");
		PageActionsClick.clickElement(driver, locatorProperty);
	}
}
