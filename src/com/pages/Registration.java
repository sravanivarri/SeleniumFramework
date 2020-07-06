package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.utilities.ConfigReader;

public class Registration {

	ConfigReader conf = new ConfigReader();

	WebDriver driver;

	public Registration(WebDriver ldriver) {
		this.driver = ldriver;
	}

	public void Accountclick() {
		try {
			driver.findElement(By.xpath(conf.account())).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void Myaccountclick() {
		try {
			driver.findElement(By.xpath(conf.myAccount())).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void Createaccountclick() {
		try {
			driver.findElement(By.xpath(conf.Createaccount())).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 
	public void FirstnameEnter(String name) {
		try {
			driver.findElement(By.xpath(conf.FirstName())).sendKeys(name);;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 
	public void LastnameEnter(String lname) {
		try {
			driver.findElement(By.xpath(conf.Lastname())).sendKeys(lname);;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void emailidenter(String email) {
		try {
			driver.findElement(By.xpath(conf.emailid())).sendKeys(email);;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void PasswordEnter(String pwd) {
		try {
			driver.findElement(By.xpath(conf.passwordset())).sendKeys(pwd);;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void ConfirmpwdEnter(String cpwd) {
		try {
			driver.findElement(By.xpath(conf.confirmpwd())).sendKeys(cpwd);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void Registerclick() {
		try {
			driver.findElement(By.xpath(conf.register())).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void RegisterationVerify() {
		try {
			Assert.assertEquals(driver.findElement(By.xpath(conf.actual_success_msg_xpath())).getText(),conf.expected_register_success_msg());
		  //driver.getPageSource().contains(conf.expctdErrorMsg());--it ll return T or F
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}

	
	

	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
