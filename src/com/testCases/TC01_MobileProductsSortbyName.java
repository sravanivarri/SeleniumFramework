package com.testCases;

import org.testng.annotations.Test;


import com.relevantcodes.extentreports.LogStatus;
import com.testCases.TC01_MobileProductsSortbyName;

public class TC01_MobileProductsSortbyName extends BaseClass {

	

	@Test(description = "validate the sorting of the mobiles by name ")
	public void SortbyName() throws InterruptedException {

		logger = report.startTest("SortbyName", "Verify the mobile sorting").assignCategory("Functional");
		hp.openURL();
		logger.log(LogStatus.INFO, "URL Opens");
		hp.homePageTitleVerification();
		logger.log(LogStatus.INFO, "Home Page Title verified");
		hp.clickOnMobile();
		Thread.sleep(1000);
		logger.log(LogStatus.INFO, "Succefully clicked on Mobile");
		mp.mobilePageTitle();
		logger.log(LogStatus.INFO, "Mobile page title verified");
		mp.sortByOption();
		logger.log(LogStatus.PASS, "Products are sorted by name");
		

	}
}
