package com.testCases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

//import com.relevantcodes.extentreports.LogStatus;

public class TC_Login_01 extends BaseClass {

         @Test(description="login with username and Password")
           public void login() throws InterruptedException{
           logger = report.startTest("login", "Login with usename and passowrd").assignCategory("Functional");
       		lp.openLoginURL();
       		lp.setUsername(Username);
	        logger.log(LogStatus.INFO, "Username entered");
       		lp.setPassword(Password);
       		logger.log(LogStatus.INFO, "Password entered");
       		lp.login();
       		Thread.sleep(1000);
       		//logger.log(LogStatus.PASS, "Login Successfull");
       		Thread.sleep(1000);
         }




}
