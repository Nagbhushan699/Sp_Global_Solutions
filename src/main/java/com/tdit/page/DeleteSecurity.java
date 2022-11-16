package com.tdit.page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeleteSecurity {
	WebDriver driver;
	public DeleteSecurity(WebDriver driver) {
		this.driver=driver;
	}
private By title=By.xpath("//h2[text()='Delete Security']");
private By secNo=By.name("snumber");
private By delete=By.xpath("//button[text()='delete security']");


public String getTitle() {
	return driver.findElement(title).getText();
}
public String enterSecurityNo(String no) {
	driver.findElement(secNo).clear();
	driver.findElement(secNo).sendKeys(no);
	return driver.findElement(secNo).getAttribute("value");
}
public String deleteAcc(String no) {
	enterSecurityNo(no);
	driver.findElement(delete).click();
	Alert alert=driver.switchTo().alert();
	return alert.getText();
}
}
