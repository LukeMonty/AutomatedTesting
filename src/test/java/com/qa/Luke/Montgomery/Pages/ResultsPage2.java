package com.qa.Luke.Montgomery.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultsPage2 {
	
	@FindBy(xpath = "//*[@id=\"body-section\"]/div[5]/div/div[3]/div[1]/div/table/tbody/tr[2]/td/div[2]/div/a")
	private WebElement londonResult;
	
	public void checkFirstResult(WebDriver driver) {
		
		List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"body-section\"]/div[5]/div/div[3]/div[1]/div/table/tbody/tr[1]/td"));
		WebElement londonElement = null;
		for (WebElement webElement : elements) {
			if (webElement.getAttribute("title") == "London") {
				londonElement = webElement;
			}
				
		}
		if(londonElement != null) {
			londonElement.click();
		}
		

	}
}