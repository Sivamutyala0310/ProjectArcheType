#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
	package ${package}.utils;
	
	/**
	 * 
	 * Parsing the locator type and locator value which is getting from the
	 * properties file
	 *
	 */
	public class FindLocatorType {
		static String locatorType;
		static String locatorValue;
		static String[] locatorData = new String[2];
	
		public static String[] findingLocatorValue(String locatorProperty) {
			locatorType = locatorProperty.split(":")[0];
			locatorValue = locatorProperty.split(":")[1];
	
			locatorData[0] = locatorType;
			locatorData[1] = locatorValue;
	
			return locatorData;
		}
	}
