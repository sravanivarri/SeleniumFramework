package com.testCases;

import org.testng.annotations.Test;

import com.pages.HomePage;
import com.relevantcodes.extentreports.LogStatus;

public class TC04_CompareMobiles extends BaseClass{

	@Test (description="Verify the error message while quantity is updated to 1000")
	public void mobilesComparision() throws InterruptedException {
	logger = report.startTest("mobilesComparision", "Verify the error message while quantity is updated to 1000").assignCategory("Functional");
	HomePage hp = new HomePage(driver);
	hp.openURL();
	hp.clickOnMobile();
	logger.log(LogStatus.INFO, "Clicked on Mobile menu");
	mp.xperiaAddToCompare();
	logger.log(LogStatus.PASS, "Succesfully clicked on Add To Compare button corresponding to Sony Experia");
	mp.iphoneAddToCompare();
	logger.log(LogStatus.PASS, "Succesfully clicked on Add To Compare button corresponding to IPhone");
	mp.compareButton();
	logger.log(LogStatus.PASS, "Successfully clicked on COMAPRE button");
	logger.log(LogStatus.INFO, "Popup window opens up");
	logger.log(LogStatus.INFO, "Switching to the new pop-up window...");
	wh.switchToWindow();
	logger.log(LogStatus.PASS, "Switched to new popup window");
	pp.windowHeadingComparison();
	logger.log(LogStatus.PASS, "Popup window heading comparison completed");
	logger.log(LogStatus.INFO, "Verify the screenshots for product verification");
	logger.log(LogStatus.PASS, "Closing the popup window");
	pp.closeWindowBtn();
	logger.log(LogStatus.INFO, "Switching to main window..");
	wh.switchToWindow();
	closeBrowser();
	
}
}
