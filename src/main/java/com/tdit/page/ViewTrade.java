package com.tdit.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ViewTrade {
	WebDriver driver;
	public ViewTrade(WebDriver driver) {
		this.driver=driver;
	}
	private By title=By.xpath("//h2[text()='View Trades']");
	private By accNo=By.name("snumber");
	private String chart="//a[text()='12345']";
	private By download=By.id("download");
	public String getAccno(String no) {
		driver.findElement(accNo).clear();
		driver.findElement(accNo).sendKeys(no);
		String chart="//a[text()='"+no+"']";
		driver.findElement(By.xpath(chart));
		return driver.findElement(By.xpath(chart)).getText();
	}
	public boolean downloadCsv(String no) throws InterruptedException {
		driver.findElement(accNo).clear();
		driver.findElement(accNo).sendKeys(no);
		driver.findElement(download).click();
		Thread.sleep(3000);
		return driver.findElement(download).isSelected();
	}
	public String getTitle() {
		return driver.findElement(title).getText();
	}
}
