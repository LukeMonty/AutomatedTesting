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

public class TestBooking {
	
	WebDriver driver;
	String url = "https://www.phptravels.net/";
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/dev/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
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
		
		page.searchLocation("London",driver);
		
		page.inputDates("01/01/2020", "03/01/2020");
		page.setNumberOfTravellers();
		page.search();
		
		ResultsPage results = PageFactory.initElements(driver, ResultsPage.class);
		results.checkFirstResult(driver);
		
		
		ResultsPage2 results2 = PageFactory.initElements(driver, ResultsPage2.class);
		results2.checkFirstResult(driver);
		
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
