package com.qa.Luke.Montgomery.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home {
	
	@FindBy(xpath = "//*[@id=\"s2id_autogen8\"]/a/span[1]")
	private WebElement searchClick;
	
	@FindBy(xpath = "//*[@id=\"select2-drop\"]/div/input")
	private WebElement searchInput;
	
//	@FindBy(xpath = "//*[@id=\"select2-drop\"]/ul/li/ul/li[1]/div")
//	private WebElement resultLondon;
	
	@FindBy(xpath = "//*[@id=\"dpd1\"]/div/input")
	private WebElement checkInInput;
	
	@FindBy(xpath = "//*[@id=\"dpd2\"]/div/input")
	private WebElement checkOutInput;
	
	@FindBy(id = "travellersInput")
	private WebElement clickAmountOfTravellers;
	
	@FindBy(id = "adultPlusBtn")
	private WebElement clickAddAdult;
	
	@FindBy(xpath = "//*[@id=\"hotels\"]/form/div[5]/button")
	private WebElement clickSearch;
	
	
	public void searchLocation( String string, WebDriver driver) throws InterruptedException {
		searchClick.click();
		searchInput.sendKeys(string);
		
		WebElement resultLondon = new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"select2-drop\"]/ul/li/ul/li[1]/div")));
		resultLondon.click();
	}
	
	public void inputDates(String checkInDate, String checkOutDate) {
		checkInInput.sendKeys(checkInDate);
		checkOutInput.sendKeys(checkOutDate);
	}
	
	public void setNumberOfTravellers() {
		clickAmountOfTravellers.click();
		clickAddAdult.click();
	}
	
	public void search() {
		clickSearch.click();
	}
	

}
