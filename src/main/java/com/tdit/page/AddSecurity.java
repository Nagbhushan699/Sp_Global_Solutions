package com.tdit.page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class AddSecurity {
	WebDriver driver;
	public AddSecurity(WebDriver driver) {
		this.driver=driver;
	}
	private By title=By.xpath("//h2[text()='Add Security']");
	private By securityNo=By.id("snumber");
	private By isin=By.id("isin");
	private By sedol=By.id("sedol");
	private By shares=By.id("shares");
	private By launch_date=By.id("launch_date");
	private By eodshare=By.id("value per share");
	private By Register=By.xpath("//button[text()='Register']");
	
	
	public String addSecurity(String secno,String ISIN,String Sedol,String launch_Date,String eod) {
		driver.findElement(securityNo).sendKeys(secno);
		driver.findElement(isin).sendKeys(ISIN);
		driver.findElement(sedol).sendKeys(Sedol);
		driver.findElement(shares).click();
		driver.findElement(launch_date).sendKeys(launch_Date);
		driver.findElement(eodshare).sendKeys(eod);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		driver.findElement(Register).click();
		Alert alert=driver.switchTo().alert();
		return alert.getText();
	}
	
	
	
	public String getTitle() {
		return driver.findElement(title).getText();
	}
}
