package com.testCases;

import java.io.File;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class TC07_Printorder extends BaseClass {

	String Filename = "OrderPrintout";

	@Test(description = "view the order and print")
	public void print() throws InterruptedException, IOException {

		logger = report.startTest("print", "view the order and print").assignCategory("Functional");
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
		op.myOrdersClick();
		String s = op.ordernoRecent();
		System.out.println(s);
		op.statusComparision();
		logger.log(LogStatus.INFO, "Status verified");
		op.viewOrder();
		String orderno = op.getorderno();
		String str1 = orderno.replaceAll("[^0-9]", "");
		System.out.println(str1);
		Assert.assertEquals(s, str1);
		logger.log(LogStatus.INFO, "Orderno verified");
		op.printClick();
		Thread.sleep(1000);
		// excuting autoit script to save the printorder
		Runtime rt = Runtime.getRuntime();
		String Path1 = "D://AutoitScripts//PrintandSave1.exe";
		Process proc1 = rt.exec(Path1);
		System.out.println(proc1);
		logger.log(LogStatus.INFO, "Saved the Print Order in system");

		// to check whether the dwlded one is pdf

		String filePath = "C://Users//vijay//Desktop//OrderPrintout.pdf";
		Path path = Paths.get(filePath);
		boolean exists = Files.exists(path);
		boolean notExists = Files.notExists(path);
		if (exists) {
			System.out.println("File exists!!");
		} else if (notExists) {
			System.out.println("File doesn't exist!!");
		} else {
			System.out.println("Program doesn't have access to the file!!");
		}
		File f = new File("C://Users//vijay//Desktop//OrderPrintout.pdf");
		String extension = f.getName().substring(f.getName().indexOf(".") + 1);
		// System.out.println(extension);
		if (extension.equalsIgnoreCase("pdf")) {
			logger.log(LogStatus.INFO, "Output is a PDF file");
		} else
			logger.log(LogStatus.INFO, "Output is not a PDF file");

	}
}
