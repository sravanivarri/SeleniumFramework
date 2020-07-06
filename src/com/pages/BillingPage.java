package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.utilities.ConfigReader;

public class BillingPage {

	WebDriver driver;
	ConfigReader conf = new ConfigReader();

	public BillingPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	public void addressSelect() {
		try {
			Select select = new Select(driver.findElement(By.xpath(conf.addressSelect())));
			select.selectByVisibleText(conf.addressVisibleElement());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void billingAddress(String address) {

		try {
			driver.findElement(By.xpath(conf.address())).sendKeys(address);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void billingCitySelect(String city) {
		try {
			driver.findElement(By.xpath(conf.billingCity())).sendKeys(city);
			;

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void billingpostcode(String postcode) {

		try {
			driver.findElement(By.xpath(conf.billingpostcode())).sendKeys(postcode);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void billingTelephone(String telephone) {

		try {
			driver.findElement(By.xpath(conf.telephone())).sendKeys(telephone);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void billingContinue() {
		try {
			WebElement element = driver.findElement(By.xpath(conf.billingContinue()));
			Actions actions = new Actions(driver);
			actions.moveToElement(element).click().perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void shippingContinue() {
		try {
			driver.findElement(By.xpath(conf.shippingmethodContinue())).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void paybyMoney() {
		try {
			driver.findElement(By.xpath(conf.moneyorder())).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void paymentContinue() {
		try {
			driver.findElement(By.xpath(conf.paymentinfoContinue())).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void placeOrderClick() {
		try {
			driver.findElement(By.xpath(conf.placeOrder())).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void oderGenerated() {
		String Expectedmsg = "THANK YOU FOR YOUR PURCHASE!";
		try {
			Assert.assertEquals(driver.findElement(By.xpath(conf.orderGenerated())).getText(), Expectedmsg);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String oderNumber() {

		try {
			return driver.findElement(By.xpath(conf.orderno())).getText();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			return e.getMessage();
		}

	}

}
