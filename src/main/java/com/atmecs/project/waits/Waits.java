package com.atmecs.project.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.atmecs.project.constants.TimeOuts;
import com.atmecs.project.reports.LogReports;

	/**
	* To wait for certain conditions (Expected Conditions) or the maximum time
	* exceeded before throwing an "ElementNotVisibleException" exception.
	*/
public class Waits {

	public static WebElement element;
	static LogReports log = new LogReports();

	public static void explicitWait(WebDriver driver, String locatorType, String locatorValue) {
		WebDriverWait wait = new WebDriverWait(driver,TimeOuts.requiredWaitingTIME);
		try {
			switch (locatorType) {
			case "CLASSNAME":
				element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(locatorValue)));
				break;
			case "CSSSELECTOR":
				element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locatorValue)));
				break;
			case "ID":
				element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locatorValue)));
				break;
			case "LINKTEXT":
				element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(locatorValue)));
				break;
			case "NAME":
				element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(locatorValue)));
				break;
			case "PARTIALLINKTEXT":
				element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(locatorValue)));
				break;
			case "TAGNAME":
				element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName(locatorValue)));
				break;
			case "XPATH":
				element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locatorValue)));
				break;
			default:
				break;
			}
		} catch (Exception e) {
			log.info("Exception occured in Waits");
		}
	}
	/*
	 * public static void fluentWait(WebDriver driver) { Wait<WebDriver> wait = new
	 * FluentWait<WebDriver>(driver) .withTimeout(30, TimeUnit.SECONDS)
	 * .pollingEvery(5, TimeUnit.SECONDS) .ignoring(NoSuchElementException.class); }
	 */

}
