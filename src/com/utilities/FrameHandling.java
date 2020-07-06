package com.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FrameHandling {
	WebDriver driver;

	public FrameHandling(WebDriver ldriver) {
		this.driver = ldriver;
	}
	
	public void switchToFrame()
	{
		try {
			//Finding all iframe tags on a web page
			/*List<WebElement> elements = driver.findElements(By.tagName("iframe"));
			int numberOfTags = elements.size();
			System.out.println("No. of Iframes on this Web Page are: " +numberOfTags);*/
		//switching to frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='flow_close_btn_iframe']")));
	    driver.findElement(By.id("flow_close_btn_iframe")).click();
	    //go to main page again
	    driver.switchTo().defaultContent();
	    }catch(Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}	

}
