/**
 * 
 */
package com.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * @author prosenjit.majumder
 *
 */
public class ProductComparePage {
	
	com.utilities.ConfigReader conf = new com.utilities.ConfigReader();
	
	WebDriver driver;

	public ProductComparePage(WebDriver ldriver) {
		this.driver = ldriver;
	}
	
	public void windowHeadingComparison() {
		try {
			Assert.assertEquals(driver.findElement(By.xpath(conf.actualPopupHeading())).getText(), conf.expctdPopupHeading().toUpperCase());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void closeWindowBtn() {
		try {
			driver.findElement(By.xpath(conf.closeWindow())).click();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}
