package com.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import com.utilities.ConfigReader;

public class AddtoCartEstimateTotal {

	WebDriver driver;
	ConfigReader conf = new ConfigReader();

	public AddtoCartEstimateTotal(WebDriver ldriver) {
		this.driver = ldriver;
	}

	public void mainEmail(String email) {

		try {
			driver.findElement(By.xpath(conf.mainemail())).sendKeys(email);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void mainPassword(String pwd) {
		try {
			driver.findElement(By.xpath(conf.mainPassword())).sendKeys(pwd);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void actualLogin() {
		try {
			driver.findElement(By.xpath(conf.mainlogin())).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void myWishlist() {
		try {
			driver.findElement(By.xpath(conf.myWishlist())).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addtoCart() {
		try {
			driver.findElement(By.xpath(conf.addtoCart())).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void countrySelect() {
		try {
			Select select = new Select(driver.findElement(By.xpath(conf.countrySelect())));
			select.selectByVisibleText(conf.countryVisibleElement());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void stateSelect() {
		try {
			Select select = new Select(driver.findElement(By.xpath(conf.StateSelect())));
			select.selectByVisibleText(conf.stateVisibleElement());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void pincode(String pin) {
		try {
			driver.findElement(By.xpath(conf.pincode())).sendKeys(pin);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void clickonEstimate() {
		try {
			driver.findElement(By.xpath(conf.estimate())).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void flatRate() {
		try {
			driver.findElement(By.xpath(conf.flatrateRadiobutton())).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateTotal() {
		try {
			driver.findElement(By.xpath(conf.updateTotal())).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String flatRatePrice() {
		try {
			String Flatrate= driver.findElement(By.xpath(conf.flatratePrice())).getText();
			if(Flatrate!=null) {
				return Flatrate;
			}else 
				return null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return e.getMessage();
		}
	}

	public String subTotalPrice() {
		try {
			return driver.findElement(By.xpath(conf.subTotal())).getText();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return e.getMessage();
		}
	}

	public String actualTotal() {
		try {
			return (subTotalPrice() + flatRatePrice());
		} catch (Exception e) {
			return e.getMessage();
		}
		
	}

	public void cartCheckout() {
		try {
			WebElement element1= driver.findElement(By.xpath(conf.checkout()));
			Actions actions=new Actions(driver);
			actions.moveToElement(element1).click().perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
