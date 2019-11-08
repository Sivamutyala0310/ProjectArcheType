package com.atmecs.project.dataallocators;

import java.io.IOException;
import java.util.Properties;

import com.atmecs.project.constants.ConstantFilePaths;
import com.atmecs.project.utils.ReadLocatorsFile;


/**
 * 
 * Allocating the validation data.
 *
 */
public class ProjectValidationDataAllocators
{
Properties properties;
	
	// define String variables
	
	
	
	
	
	
	public void getData() throws IOException {
		properties = ReadLocatorsFile.loadProperty(ConstantFilePaths.VALIDATIONTESTDATA_FILE);
		
		
		// calling setters();
		
		


	
	
	
	
	
}
	/*
	 * public void setClickOnAboutUsXpath() { clickOnAboutUsXpath =
	 * properties.getProperty("clickOnAboutUsXpath"); }
	 */
	
	// implementation setters and getters
	
	
	public static void main(String[] args) throws IOException {
		ProjectValidationDataAllocators keys = new ProjectValidationDataAllocators();
		keys.getData();
	}
}
