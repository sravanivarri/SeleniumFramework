package com.testCases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class TC06_AddtoCartandOrder extends BaseClass {

	@Test(description = "Adding the item to the cart and order")
	public void order() throws InterruptedException {

		logger = report.startTest("order", "Adding the item to the cart and order").assignCategory("Functional");
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
		at.myWishlist();
		logger.log(LogStatus.INFO, "My Wishlist");
		at.addtoCart();
		logger.log(LogStatus.INFO, "Clicked on addtocart");
		at.countrySelect();
		logger.log(LogStatus.INFO, "Entered country");
		at.stateSelect();
		logger.log(LogStatus.INFO, "Entered state");
		at.pincode("542896");
		logger.log(LogStatus.INFO, "Entered pincode");
		at.clickonEstimate();
		logger.log(LogStatus.INFO, "Clicked on Estimate");
		at.flatRate();
		logger.log(LogStatus.INFO, "Shipping cost generated and selected");
		at.updateTotal();
		logger.log(LogStatus.INFO, "Clicked on update total");
		at.actualTotal();
		logger.log(LogStatus.INFO, "Shipping added to Total");
		at.cartCheckout();
		Thread.sleep(1000);
		logger.log(LogStatus.INFO, "Clicked on Checkout");
		bp.addressSelect();
		logger.log(LogStatus.INFO, "Entered address");
		bp.billingAddress("ABC");
		bp.billingCitySelect("New York");
		bp.billingpostcode("542896");
		bp.billingTelephone("12456");
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
