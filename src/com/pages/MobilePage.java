package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.utilities.ConfigReader;

public class MobilePage {

	ConfigReader conf = new ConfigReader();
	WebDriver driver;

	public MobilePage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	public void mobilePageTitle() {
		try {
			Assert.assertEquals(driver.getTitle(), conf.mobilePageTitle());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void sortByOption() {
		try {
			Select select = new Select(driver.findElement(By.xpath(conf.sortbyElement())));
			select.selectByVisibleText(conf.sortedVisibleElement());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String readXperiaCost() {
		try {
			return driver.findElement(By.xpath(conf.sonyXperiaPrice())).getText();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return e.getMessage();
		}
	}

	public void clickOnExperia() {
		try {
			driver.findElement(By.id(conf.sonyXperiaLink())).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String readXperiaCostDetailsScreen() {
		try {
			return driver.findElement(By.xpath(conf.xperiaPriceDetails())).getText();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return e.getMessage();
		}
	}

	public void addToCart() {
		try {
			driver.findElement(By.xpath(conf.xperiaAddToCart())).click();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void xperiaAddToCompare() {
		try {
			driver.findElement(By.xpath(conf.xperiaAddToCompare())).click();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void iphoneAddToCompare() {
		try {
			driver.findElement(By.xpath(conf.iphoneAddToCompare())).click();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public String iphoneTitle() {
		try {
			return driver.findElement(By.xpath(conf.iphoneTitle())).getText();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return e.getMessage();
		}
	}

	public String xperiaTitle() {
		try {
			return driver.findElement(By.xpath(conf.xperiaTitle())).getText();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return e.getMessage();
		}
	}

	public void compareButton() {
		try {
			driver.findElement(By.xpath(conf.compareBtn())).click();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
