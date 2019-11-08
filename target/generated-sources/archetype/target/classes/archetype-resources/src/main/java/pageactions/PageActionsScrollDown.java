#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.pageactions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


	/**
	* To move the window up and down.( Scroll by visible element) Scroll using
	* pixcel.
	*/
public class PageActionsScrollDown 
{
public static void homePageScrollDown(WebDriver driver) {
		
		JavascriptExecutor javaScriptExecutor = (JavascriptExecutor) driver;
		javaScriptExecutor.executeScript("window.scrollBy(0,1200)");
	}
	
	public static void PageScrollDown(WebDriver driver) {
		
		JavascriptExecutor javaScriptExecutor = (JavascriptExecutor) driver;
		javaScriptExecutor.executeScript("window.scrollBy(0,700)");
	}
	
public static void scrollDownToBottom(WebDriver driver) {
		
		JavascriptExecutor javaScriptExecutor = (JavascriptExecutor) driver;
		javaScriptExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
}
