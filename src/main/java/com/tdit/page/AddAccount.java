package com.tdit.page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddAccount {
	WebDriver driver;
	public AddAccount(WebDriver driver) {
		this.driver=driver;
	}
	private By title=By.xpath("//h2[text()='Add Account']");
	private By acc_Name=By.name("aname");
	private By acc_No=By.name("anumber");
	private By acc_Fund=By.name("afund");
	private By addAccBtn=By.name("register");
	private By homeBtn=By.tagName("a");

	//page Actions
	public String getTitle() {
		return driver.findElement(title).getText();
	}
	
	public String enterAccName(String name) {
		driver.findElement(acc_Name).clear();
		driver.findElement(acc_Name).sendKeys(name);
		return driver.findElement(acc_Name).getAttribute("value");
	}
	public String enterAccNo(String no) {
		driver.findElement(acc_No).clear();
		driver.findElement(acc_No).sendKeys(no);
		return driver.findElement(acc_No).getAttribute("value");
	}
	public String enterAccFund(String fund) {
		driver.findElement(acc_Fund).clear();
		driver.findElement(acc_Fund).sendKeys(fund);
		return driver.findElement(acc_Fund).getAttribute("value");
	}
	public String addAccountWithValidInputs(String name,String no,String fund) throws InterruptedException {
		enterAccName(name);
		enterAccNo(no);
		enterAccFund(fund);
		Thread.sleep(3000);
		driver.findElement(addAccBtn).click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		String txt=alert.getText();
		return txt;
	}
	public String addAccountWithInValidInputs(String name,String no,String fund) {
		enterAccName(name);
		enterAccNo(no);
		enterAccFund(fund);
		driver.findElement(addAccBtn).click();
		Alert alert=driver.switchTo().alert();
		String txt=alert.getText();
		return txt;
	}
	public String clickOnHomeBtn() {
		driver.findElement(homeBtn).click();
		Homepage home=new Homepage(driver);
		return home.getTitle();
	}
}
