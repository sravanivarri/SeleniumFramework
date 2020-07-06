package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.utilities.ConfigReader;

public class TVPage {
	ConfigReader conf = new ConfigReader();

	WebDriver driver;

	public TVPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	public void TVClick() {
		try {
			driver.findElement(By.xpath(conf.Tvclick())).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void AddtoWishlistclick() {
		try {
			driver.findElement(By.xpath(conf.addtoWishlist())).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void shareWhishlist() {
		try {
			driver.findElement(By.xpath(conf.shareWishlist())).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void emailid(String email) {
		try {
			driver.findElement(By.xpath(conf.TVemailenter())).sendKeys(email);;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void finalshareWhishlist() {
		try {
			driver.findElement(By.xpath(conf.finalShare())).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//another method to verify the final msg
	public void wishlistSuccessshare() {
		
		try{
			boolean msg=driver.getPageSource().contains(conf.expectedTVSharedMsg());
		
		if(msg==true)
		{
			Assert.assertTrue(true);;
		}
		
		else {
			Assert.assertTrue(false);
			
		}
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
