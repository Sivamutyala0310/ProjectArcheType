#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.validatetest;

import org.testng.Assert;

import ${package}.reports.LogReports;

	/**
	* Determine the the state of the application whether it is the same what we are
	* expecting or not.
	*
	*/

public class ValidateResult
{
	static LogReports report = new LogReports();

	
	public static boolean validateData(String actual, String expected, String message) {
		try {
			Assert.assertEquals(actual,expected);
			report.info("Passed : " + message + ": " + "Actual data : " + actual + "   " + "Expected data :" + expected);
			return true;
		} catch (AssertionError assertionError) {
			report.info("failed: " + message + ": " + "Actual data : " + actual + "   " + "Expected :" + expected);
			return false;
		}
	}

}