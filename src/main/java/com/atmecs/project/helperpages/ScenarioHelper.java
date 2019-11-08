package com.atmecs.project.helperpages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.atmecs.project.constants.ConstantFilePaths;
import com.atmecs.project.pageactions.PageActionsClick;
import com.atmecs.project.reports.LogReports;
import com.atmecs.project.utils.ReadLocatorsFile;



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
