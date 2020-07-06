package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class TC08_Reorder extends BaseClass {

	@Test(description = "reorder the first order in the List")
	public void reorder() throws InterruptedException, IOException {

		logger = report.startTest("reorder", "reorder the first order in the List").assignCategory("Functional");
		hp.openURL();
		rp.Accountclick();
		logger.log(LogStatus.INFO, "Clicked on Account");
		rp.Myaccountclick();
		logger.log(LogStatus.INFO, "Clicked on MyAccount");
		at.mainEmail("sravanivarri@gmail.com");
		logger.log(LogStatus.INFO, "Entered email");
		at.mainPassword("Sravzcute@61");
		logger.log(LogStatus.INFO, "Entered Password");
		at.actualLogin();
		logger.log(LogStatus.INFO, "login Successfull");
		ro.reorderclick();
		ro.enterqty("4");
		String beforetotal = ro.beforegrandTotal();
		ro.reorderupdate();
		String Aftertotal = ro.aftergrandTotal();
		if (beforetotal.equals(Aftertotal)) {
			logger.log(LogStatus.INFO, "Grandtotal has not changed");
		} else
			logger.log(LogStatus.INFO, "Grandtotal has changed");
		at.cartCheckout();
		Thread.sleep(1000);
		logger.log(LogStatus.INFO, "Clicked on Checkout");
		bp.billingContinue();
		Thread.sleep(1000);
		logger.log(LogStatus.INFO, "Clicked on Comtinue");
		bp.shippingContinue();
		logger.log(LogStatus.INFO, "Clicked on shippingcontinue");
		bp.paybyMoney();
		logger.log(LogStatus.INFO, "Clicked on PAy thru money");
		bp.paymentContinue();
		logger.log(LogStatus.INFO, "Clicked on PAyment");
		bp.placeOrderClick();
		logger.log(LogStatus.INFO, "Clicked on PLace order");
		bp.oderGenerated();
		String orderno = bp.oderNumber();
		System.out.println(orderno);
		logger.log(LogStatus.PASS, "Order no Noted");

	}
}
