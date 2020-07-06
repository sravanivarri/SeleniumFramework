package com.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class TC03_VerifyEmptyCart  extends BaseClass{
	
	
	
	@Test (description="Verify the pop-up window with the desired products reflected on it on clickin on COMPARE butto")
	public void verifyQtyUpdate() throws InterruptedException {
	logger = report.startTest("verifyQtyUpdate", "Verify the pop-up window with the desired products reflected on it on clickin on COMPARE butto").assignCategory("Functional");
	hp.openURL();
	hp.clickOnMobile();
	Thread.sleep(1000);
	logger.log(LogStatus.INFO, "Clicked on Mobile menu");
	mp.addToCart();
	//fh.switchToFrame();
	logger.log(LogStatus.INFO, "Clicked on ADD TO CART corresponding to Sony Experia");
	sp.provideQty();
	Thread.sleep(1000);
	logger.log(LogStatus.INFO, "required quantity providede");
	sp.clickOnUpdate();
	Thread.sleep(1000);
	logger.log(LogStatus.INFO, "Clicked on UPDATE");
	Assert.assertEquals(sp.actualErrMsg(), sp.expctdErrMsg());
	logger.log(LogStatus.PASS, "Update Message verified");
	sp.clickOnEmptyCart();
	logger.log(LogStatus.INFO, "Clicked on Empty Cart link");
	Assert.assertEquals(sp.actualEmptyCartMsg(), sp.expctdEmptyCartMsg());
	logger.log(LogStatus.PASS, "EmptyCart Message verified");

	
	
	}
}