package com.atmecs.project.dataallocators;

import java.io.IOException;
import java.util.Properties;


import com.atmecs.project.constants.ConstantFilePaths;
import com.atmecs.project.utils.ReadLocatorsFile;

/**
 * 
 * Allocating locators
 *
 */

public class ProjectXpathAllocators 
{
	Properties properties;
	
	// define String variables
	
	
	
	
	
	
	public void getData() throws IOException {
		properties = ReadLocatorsFile.loadProperty(ConstantFilePaths.LOCATORS_FILE);
		
		
		// calling setters();
		
		


	
	
	
	
	
}
	/*
	 * public void setClickOnAboutUsXpath() { clickOnAboutUsXpath =
	 * properties.getProperty("clickOnAboutUsXpath"); }
	 */
	
	// implementation setters and getters
	
	
	public static void main(String[] args) throws IOException {
		ProjectXpathAllocators keys = new ProjectXpathAllocators();
		keys.getData();
	}
}
