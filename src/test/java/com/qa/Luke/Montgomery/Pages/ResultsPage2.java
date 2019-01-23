package com.qa.Luke.Montgomery.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultsPage2 {

	@FindBy(xpath = "//*[@id=\"body-section\"]/div[5]/div/div[3]/div[1]/div/table/tbody/tr[2]/td/div[2]/div/a")
	private WebElement londonResult;

	public void checkFirstResult(WebDriver driver) throws InterruptedException {

		List<WebElement> elements = driver.findElements(By.id("body-section"));
		WebElement londonElement = null;
		String title = "";
		for (WebElement webElement : elements) {

			title = webElement.findElement(By.xpath("//a[@title=\"London\"]")).getAttribute("title");
			System.out.println(title);
			if (title.equals("London")) {
				londonElement = webElement;
				break;
			}

		}
		if (londonElement != null) {
			londonElement.click();
			Thread.sleep(5000);
		}

	}
}