package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utilities.ConfigReader;

public class LoginPage {

	ConfigReader conf = new ConfigReader();

	WebDriver driver;

	public LoginPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	public void openLoginURL() {

		try {
			driver.get(conf.getLoginURL());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
   
   public void setUsername(String Uname) {
	   try {
	 	   driver.findElement(By.xpath(conf.username())).sendKeys(Uname);;
	    }catch(Exception e) {
	 	   e.printStackTrace();
	    }

	    }
   public void setPassword(String Pwd) {
	   try {
	 	   driver.findElement(By.xpath(conf.password())).sendKeys(Pwd);;
	    }catch(Exception e) {
	 	   e.printStackTrace();
	    }

	    }
   public void login() {
	   try {
	 	   driver.findElement(By.xpath(conf.login())).click();
	    }catch(Exception e) {
	 	   e.printStackTrace();
	    }

	    }
   public void logout() {
	   try {
	 	   driver.findElement(By.xpath(conf.logout())).click();
	    }catch(Exception e) {
	 	   e.printStackTrace();
	    }

	    }
	                

}
