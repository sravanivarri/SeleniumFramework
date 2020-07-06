package com.testCases;

import java.io.File;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.pages.AddtoCartEstimateTotal;
import com.pages.BillingPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.MobilePage;
import com.pages.MyOrdersPage;
import com.pages.ProductComparePage;
import com.pages.Registration;
import com.pages.Reorder;
import com.pages.ShoppingCart;
import com.pages.TVPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.utilities.ConfigReader;
import com.utilities.FrameHandling;
import com.utilities.Utility;
import com.utilities.WindowHandle;

public class BaseClass {

	public static WebDriver driver;
	public static ExtentReports report;
	public static ExtentTest logger;

	ConfigReader conf = new ConfigReader();

	String Username = conf.usernameText();
	String Password = conf.passwordText();
	HomePage hp;
	MobilePage mp;
	LoginPage lp;
	ShoppingCart sp;
	ProductComparePage pp;
	WindowHandle wh;
	Registration rp;
	TVPage tp;
	FrameHandling fh;
	AddtoCartEstimateTotal at;
	BillingPage bp;
	MyOrdersPage op;
	Reorder ro;
	
	
	@Parameters("Browser")
	@BeforeClass
	public void Setup(String br) {
		// ProfilesIni ini = new ProfilesIni();
		// FirefoxProfile fp = ini.getProfile("default");
		// driver = new FirefoxDriver(fp);
		if (br.equals("chrome")) {
			System.setProperty(conf.chromegetDrivervalue(), conf.chromegetDriverPath());
			driver = new ChromeDriver();
		} else if (br.equals("ie")) {
			System.setProperty(conf.iegetDrivervalue(), conf.iegetDriverPath());
			driver = new InternetExplorerDriver();
		} else if (br.equals("firefox")) {
			//ProfilesIni ini = new ProfilesIni();
			// FirefoxProfile fp = ini.getProfile("default");
			System.setProperty("webdriver.gecko.driver", "./Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		hp = new HomePage(driver);
		mp = new MobilePage(driver);
		lp = new LoginPage(driver);
		sp = new ShoppingCart(driver);
		pp = new ProductComparePage(driver);
		wh = new WindowHandle(driver);
		rp = new Registration(driver);
		tp= new TVPage(driver);
		fh= new FrameHandling(driver);
		at=new AddtoCartEstimateTotal(driver);
		bp=new BillingPage(driver);
		op=new MyOrdersPage(driver);
		ro=new Reorder(driver);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

	}

	@BeforeSuite
	public void reportInitiation() {
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd-HH.mm.ss").format(new Date());
		String repName = "Test_Report-" + timeStamp + ".html";

		report = new ExtentReports("./test-output/" + repName, true);
		File f = new File("./src/com/testCases/resources/extent-config.xml");
		report.loadConfig(f);
		// report.loadConfig(BaseClass.class, "resources", "extent-config.xml");
	}

	@AfterMethod
	public void tearDown(ITestResult result) {
		if (result.getStatus() == ITestResult.SUCCESS) {
			logger = report.startTest(result.getName());
			Utility.captureScrenshot(driver, result.getName());
			// for adding screenshot
			// logger.log(LogStatus.INFO, "Snapshot below: " +
			logger.addScreenCapture("./Screenshots\\"+result.getName()+".png");
	
			// String Screenshotpath=System.getProperty("user.dir") + File.separator +
			// "/Screenshots/"+result.getName()+".jpeg";
			// logger.log(LogStatus.INFO, "Snapshot below: "+
			// logger.addScreenCapture(Screenshotpath));
			// logger.log(LogStatus.INFO, "Snapshot below: " + logger);
		} else {
			logger = report.startTest(result.getName());
			logger.log(LogStatus.ERROR, "Dependant test caese(s) will be skipped if any..! ");
			logger.log(LogStatus.FAIL, result.getThrowable());
			Utility.captureScrenshot(driver, result.getName() + "_failed");
		}

		report.endTest(logger);
		// report.flush();
	}

	@AfterSuite
	public void closeReport() {
		report.flush();
		//report.close();

	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
		
	}
}