package com.qa.Luke.Montgomery.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultsPage {

	@FindBy(xpath = "//*[@id=\"body-section\"]/div[5]/div/div[3]/div[1]/div/table/tbody/tr[1]/td/div[2]/div/a")
	private WebElement firstResult;

	@FindBy(xpath = "//*[@id=\"body-section\"]/div[5]/div/div[3]/div[2]/ul/li[4]/a")
	private WebElement nextPage;

	public void checkFirstResult(WebDriver driver) {

		List<WebElement> elements = driver.findElements(By.id("body-section"));
		WebElement londonElement = null;
		String title = "";
		for (WebElement webElement : elements) {

			//title = webElement.findElement(By.xpath("//a[@title=\"London\"]")).getAttribute("title");
			System.out.println(title);
			if (title.equals("London")) {
				londonElement = webElement;
				break;
			}

		}
		if (londonElement != null) {
			londonElement.click();
		} else {
			nextPage.click();
		}

	}

}
