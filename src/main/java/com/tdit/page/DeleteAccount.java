package com.tdit.page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeleteAccount {
	WebDriver driver;
	public DeleteAccount(WebDriver driver) {
		this.driver=driver;
	}
private By title=By.xpath("//h2[text()='Delete Account']");
private By accNo=By.name("anumber");
private By delete=By.name("delete");


public String getTitle() {
	return driver.findElement(title).getText();
}
public String enterAccNo(String no) {
	driver.findElement(accNo).clear();
	driver.findElement(accNo).sendKeys(no);
	return driver.findElement(accNo).getAttribute("value");
}
public String deleteAcc(String no) {
	enterAccNo(no);
	driver.findElement(delete).click();
	Alert alert=driver.switchTo().alert();
	return alert.getText();
}
}
