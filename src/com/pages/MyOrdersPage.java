package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.utilities.ConfigReader;

public class MyOrdersPage {

	ConfigReader conf = new ConfigReader();

	WebDriver driver;

	public MyOrdersPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	public void myOrdersClick() {
		try {
			driver.findElement(By.xpath(conf.myorders())).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String ordernoRecent() {
		try {
			return driver.findElement(By.xpath(conf.recentorderno())).getText();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return e.getMessage();
		}
	}


	public void viewOrder() {
		try {
			driver.findElement(By.xpath(conf.viewOrder())).click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String getorderno() {
		try {
			String Orderno = driver.findElement(By.xpath(conf.descripOrderno())).getText();
		//	String str1 = Orderno.replaceAll("[^0-9]","");
			return Orderno;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return e.getMessage();
		}
	}

	public void ordernoComparision() {
		try {
			Assert.assertEquals(ordernoRecent(), getorderno());
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void statusComparision() {
		try {
			String Expectedstatus="Pending";
			Assert.assertEquals(driver.findElement(By.xpath(conf.status())).getText(), Expectedstatus);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void printClick() {
		try {
			driver.findElement(By.xpath(conf.printOrder())).click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
    
    }




