package com.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class TC02_CompareMobilePrice extends BaseClass {

	@Test(description = "Comparing Mobile value")
	public void compareMobilePrice() throws InterruptedException {

		// System.out.println("driver=" + driver); //to check driver
		logger = report.startTest("CompareMobilePrice", "Comparing MObile value").assignCategory("Functional");
		hp.openURL();
		hp.clickOnMobile();
		String xperiacost = mp.readXperiaCost();
		logger.log(LogStatus.INFO, "Stored the Sony Experia price from Mobile page");
		mp.clickOnExperia();
		Thread.sleep(1000);
		logger.log(LogStatus.INFO, "Clicked on Sony Experia on Mobile page");
		logger.log(LogStatus.INFO, "Navigated to Sony Experia details page");
		String xperiacostDetails = mp.readXperiaCostDetailsScreen();
		Thread.sleep(1000);
		logger.log(LogStatus.INFO, "Stored the Sony Experia price from Sony Experia details page");
		Assert.assertEquals(xperiacost, xperiacostDetails);
		logger.log(LogStatus.PASS, "Price matches !");

	}

}
