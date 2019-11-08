package it.pkg.dataallocators;

import java.io.IOException;
import java.util.Properties;


import it.pkg.constants.ConstantFilePaths;
import it.pkg.utils.ReadLocatorsFile;

/**
 * 
 * Allocating locators
 *
 */

public class basicXpathAllocators 
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
		basicXpathAllocators keys = new basicXpathAllocators();
		keys.getData();
	}
}
