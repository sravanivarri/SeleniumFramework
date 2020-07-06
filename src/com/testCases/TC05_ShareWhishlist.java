package com.testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class TC05_ShareWhishlist extends BaseClass{
	
	
	@Test(description="Verify registration  and send the TV whishlist through email")
	public void WishList() throws InterruptedException {
		
		logger = report.startTest("WishList", "Verify registration  and send the TV whishlist through email").assignCategory("Functional");
		hp.openURL();
		rp.Accountclick();
		logger.log(LogStatus.INFO,"Clicked on Account");
		rp.Myaccountclick();
		logger.log(LogStatus.INFO,"Clicked on MyAccount");
		//fh.switchToFrame();
		rp.Createaccountclick();
		logger.log(LogStatus.INFO,"Clicked on Create Account");
		rp.FirstnameEnter("Manvi");
		logger.log(LogStatus.INFO,"Entered Firstname");
		rp.LastnameEnter("lalam");
		logger.log(LogStatus.INFO,"Entered Lastname");
		String email=randomString()+"@gmail.com";
	  //String email="vijaysankar117@gmail.com";
		rp.emailidenter(email);
	    Thread.sleep(1000);
	    logger.log(LogStatus.INFO,"Entered Email");
	    rp.PasswordEnter("Sravani@1");
	    logger.log(LogStatus.INFO,"Entered Password");
	    rp.ConfirmpwdEnter("Sravani@1");
	    logger.log(LogStatus.INFO,"Confirm Password");
	    rp.Registerclick();
	    logger.log(LogStatus.INFO,"Clicked on Register");
	    rp.RegisterationVerify();
	    logger.log(LogStatus.PASS,"Registration Succesfull");
	    Thread.sleep(1000);
	    tp.TVClick();
		logger.log(LogStatus.INFO,"Clicked on TV");
		tp.AddtoWishlistclick();
		logger.log(LogStatus.INFO,"Clicked on ADD to WishList");
		tp.shareWhishlist();
		logger.log(LogStatus.INFO,"clicked on share");
		String tvemail=randomString()+"@gmail.com";
		tp.emailid(tvemail);
		logger.log(LogStatus.INFO,"Entered Email");
		Thread.sleep(1000);
		tp.finalshareWhishlist();
		logger.log(LogStatus.INFO,"Clicked on final WishList");
		//another method to verify the msg
		tp.wishlistSuccessshare();
		logger.log(LogStatus.PASS,"Shared Wishlist Succesfully");
		//fh.switchToFrame();
		Thread.sleep(3000);
		System.out.println(email);
	}
	
	
	public String randomString() {
	
	String Generatedstring=RandomStringUtils.randomAlphabetic(8);
	return Generatedstring;
	}
	
	public String randomNum() {
		
		String Generatednumber=RandomStringUtils.randomNumeric(4);
		return Generatednumber;
		}
	
}
