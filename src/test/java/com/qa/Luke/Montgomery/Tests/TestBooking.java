package com.qa.Luke.Montgomery.Tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.qa.Luke.Montgomery.Pages.Home;
import com.qa.Luke.Montgomery.Pages.ResultsPage;
import com.qa.Luke.Montgomery.Pages.ResultsPage2;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestBooking {

	WebDriver driver;
	String url = "https://www.phptravels.net/";

	ExtentReports reports = new ExtentReports(
			"C://Users//Admin//eclipse-workspace//PHPTravelsTests//testReport//report.html", true);

	ExtentTest test;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/dev/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		test = reports.startTest("Start of test");
	}

//	@Test
//	public void testBooking() throws InterruptedException {
//		driver.get(url);
//		driver.manage().window().maximize();
//		Home page = PageFactory.initElements(driver, Home.class);
//		
//		page.searchLocation("London");
//		page.inputDates("01/01/2020", "03/01/2020");
//		page.setNumberOfTravellers();
//		page.search();
//		
//		ResultsPage results = PageFactory.initElements(driver, ResultsPage.class);
//		results.checkFirstResult();
//		
//		assertEquals("London", results.checkFirstResult());
//		
//	}
	@Test
	public void testCorrectBooking() throws InterruptedException {

		Home page = PageFactory.initElements(driver, Home.class);
		test.log(LogStatus.INFO, "Goes to url");
		page.searchLocation("London", driver);
		test.log(LogStatus.INFO, "Searches for London");
		page.inputDates("01/01/2020", "03/01/2020");
		test.log(LogStatus.INFO, "Inputs dates");
		page.setNumberOfTravellers();
		page.search();

		ResultsPage results = PageFactory.initElements(driver, ResultsPage.class);
		results.checkFirstResult(driver);

		ResultsPage2 results2 = PageFactory.initElements(driver, ResultsPage2.class);
		results2.checkFirstResult(driver);
		test.log(LogStatus.INFO, "Gets to the correct result");
		if (true) {
			test.log(LogStatus.PASS, "Test has passed");
		} else {

		}
	}

	@After
	public void tearDown() {
		driver.quit();
		reports.flush();
	}

}
