#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dataallocators;

import java.io.IOException;
import java.util.Properties;


import ${package}.constants.ConstantFilePaths;
import ${package}.utils.ReadLocatorsFile;

/**
 * 
 * Allocating locators
 *
 */

public class ${artifactId}XpathAllocators 
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
		${artifactId}XpathAllocators keys = new ${artifactId}XpathAllocators();
		keys.getData();
	}
}
