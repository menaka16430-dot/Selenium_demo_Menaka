package com.DemowebShop_GenericUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.DemoWebShop_POM.Home_page;
import com.DemoWebShop_POM.Login_page;
import com.DemoWebShop_POM.Welcome_Page;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseTest {
   public static WebDriver sDriver;
   public WebdriverUtility wedriverutilit=new WebdriverUtility();
	
	
	
	public WebDriver driver;
	public ExtentSparkReporter spark;
	public ExtentReports report;
	public ExtentTest test ;
	public FileUtility fileutility;
	public Home_page home=new Home_page(driver);
	public WebDriverWait wait;
	
	
	@BeforeSuite
	public void suite() {
		System.out.println("Before Suite....");
	}
	@BeforeTest
	public void test() {
		System.out.println("Before test....");
		spark=new ExtentSparkReporter(JavaAllPath.extentreports);
		report=new ExtentReports();
		report.attachReporter(spark);
		test = report.createTest("Demo address page");
		
	}
	@BeforeClass
	public void browseropen() throws IOException {
		System.out.println("Before Browser....");
		fileutility=new FileUtility();
		
		String browser=fileutility.dataFromeProperies("browser");
		String url=fileutility.dataFromeProperies("url");
		
		//String browser = System.getProperty("browser");
		//String url = System.getProperty("url");
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("Chrome launching");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			System.out.println("edge launching");
			driver=new EdgeDriver();
			
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.out.println("firefox launching");
			driver=new FirefoxDriver();
		}
		else {
			System.out.println("Invalid Browser");
			Assert.fail();
		}
		wait=new WebDriverWait(driver,Duration.ofSeconds(14));
		sDriver=driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(14));
		driver.get(url);
	}
	@BeforeMethod
	public void login() throws IOException
	{
		System.out.println("Before Methos");
		Welcome_Page welcome=new Welcome_Page(driver);//we can create glopal also
		welcome.getLoginlink().click();
		
		Login_page log=new Login_page(driver);//we can create glopal also
		log.getEmailTextField().sendKeys(fileutility.dataFromeProperies("username"));
		log.getPasswordTextField().sendKeys(fileutility.dataFromeProperies("password"));
		log.getLoginbutton().click();
		
		home=new Home_page(driver);
	}
	@AfterMethod
	public void logout() throws InterruptedException {
		System.out.println("After Methos");
		Thread.sleep(2000);
		home.getLogoutbutton().click();
	}
	@AfterClass
	public void browserclose() throws InterruptedException {
		System.out.println("After test....");
		Thread.sleep(2000);
		driver.quit();
	}
	@AfterTest
	public void test1() {
		System.out.println("After Test");
		report.flush();
	}
	@AfterSuite
	public void suiteClose() {
		System.out.println("After Suite");
	}

}
