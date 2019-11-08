#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.helperpages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import ${package}.constants.ConstantFilePaths;
import ${package}.pageactions.PageActionsClick;
import ${package}.reports.LogReports;
import ${package}.utils.ReadLocatorsFile;



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
