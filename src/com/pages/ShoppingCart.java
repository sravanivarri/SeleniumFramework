package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utilities.ConfigReader;

public class ShoppingCart {
	
	WebDriver driver;
	ConfigReader conf = new ConfigReader();
	
	public ShoppingCart(WebDriver ldriver) {
		this.driver = ldriver;
	}
	
	public void provideQty() {
		try {
			driver.findElement(By.xpath(conf.qty())).clear();
			driver.findElement(By.xpath(conf.qty())).sendKeys(conf.qtyAmnt());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void clickOnUpdate() {
		try {
			driver.findElement(By.xpath(conf.update())).click();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public String actualErrMsg() {
		try {
			return driver.findElement(By.xpath(conf.actErrorMsg())).getText();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return e.getMessage();
		}
	}
	
	public String expctdErrMsg() {
		return conf.expctdErrorMsg();
	}
	
	public void clickOnEmptyCart() {
		try {
			driver.findElement(By.id(conf.emptyCartBtn())).click();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public String actualEmptyCartMsg() {
		try {
			return driver.findElement(By.xpath(conf.actEmptyCartMsg())).getText();
		} catch (Exception e) {
			// TODO: handle exception
			return e.getMessage();
		}
		
	}
	
	public String expctdEmptyCartMsg() {
		return conf.expctdEmptyCartMsg();
	}
	
}
