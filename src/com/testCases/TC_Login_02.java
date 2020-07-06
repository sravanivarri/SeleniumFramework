/*package com.testCases;

import java.io.File;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

//DataDriven Testcase
public class TC_Login_02 extends BaseClass {

	@Test(dataProvider = "Logindata")
	public void loginDDT(String Username, String Password) throws InterruptedException {

		logger = report.startTest("loginDDT", "Login with exceldata").assignCategory("Functional");
		lp.openLoginURL(); // another url --login url
		lp.setUsername(Username);
		logger.log(LogStatus.INFO, "Username entered");
		Thread.sleep(1000);
		lp.setPassword(Password);
		logger.log(LogStatus.INFO, "Password entered");
		lp.login();
		Thread.sleep(1000);
		if (isAlertPresent() == true) // alert is present that means testcase(login) failed
		{
			driver.switchTo().alert().accept();
			Thread.sleep(1000);
			driver.switchTo().defaultContent();
			Assert.assertTrue(false); // failed case so false
			logger.log(LogStatus.WARNING, "Login failed");
		} else {
			Assert.assertTrue(true);
			logger.log(LogStatus.INFO, "Login Success");
			lp.logout();
			Thread.sleep(1000);
			driver.switchTo().alert().accept();
			Thread.sleep(1000);
			driver.switchTo().defaultContent();
			Thread.sleep(1000);

		}
	}

//to check whether alert is present on page or not 

	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	@DataProvider(name = "Logindata")
	public static Object[][] getCredentials() throws Exception, IOException {
		File f = new File("./src\\com\\testData\\LoginData.xls");
		Workbook wb = Workbook.getWorkbook(f); // get the workbook of that file
		Sheet sh = wb.getSheet(0); // get the sheet of the workbook(we can give name also
		int rows = sh.getRows(); // get the rows of particular sheet
		int columns = sh.getColumns(); // get the cols of that particular sheet
		String[][] inputdata = new String[rows][columns]; // create an array to store the excel values
		for (int i=0; i < rows-1; i++) {
			for (int j = 0; j < columns; j++) { // as we are not displaying headers,reduced count by 1(headers are
												// in 1st column)
				Cell c = sh.getCell(j,i+1); // it will specify the particular cell and skip the first column so J+1
				inputdata[i][j] = c.getContents(); // get the contents of the cell

			}
		}

		return inputdata;
	}
}
//}
*/