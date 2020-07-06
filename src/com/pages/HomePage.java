package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.utilities.ConfigReader;

public class HomePage {
	ConfigReader conf = new ConfigReader();

	WebDriver driver;

	public HomePage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	public void openURL() {

		try {
			driver.get(conf.getURL());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void homePageTitleVerification() {
		try {
			Assert.assertEquals(driver.getTitle(),conf.homePageTitle());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOnMobile() {
		try {
			driver.findElement(By.xpath(conf.mobileElement())).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
