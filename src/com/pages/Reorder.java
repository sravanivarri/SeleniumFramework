package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utilities.ConfigReader;

public class Reorder {
	WebDriver driver;
	ConfigReader conf = new ConfigReader();

	public Reorder(WebDriver ldriver) {
		this.driver = ldriver;
	}

	public void reorderclick() {
		try {
			driver.findElement(By.xpath(conf.reorder())).click();
			;
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void enterqty(String qty) {
		try {
			driver.findElement(By.xpath(conf.qty())).sendKeys(qty);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String beforegrandTotal() {
		try {
			return driver.findElement(By.xpath(conf.beforeaftergrnadtotal())).getText();

		} catch (Exception e) {
			return e.getMessage();
		}

	}

	public void reorderupdate() {
		try {
			driver.findElement(By.xpath(conf.updateforreorder())).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String aftergrandTotal() {
		try {
			return driver.findElement(By.xpath(conf.beforeaftergrnadtotal())).getText();

		} catch (Exception e) {
			return e.getMessage();
		}

	}

}
