package com.tdit.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
	WebDriver driver;
	public Loginpage(WebDriver driver) {
		this.driver=driver;
	}

	private By name=By.name("username");
	private By password=By.name("password");
	private By login=By.name("login");

	//page Actions
	public String enterUsername(String usn) {
	driver.findElement(name).clear();
		driver.findElement(name).sendKeys(usn);
		return driver.findElement(name).getAttribute("value");
	}
	public String enterPassword(String pass) {
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(pass);
		
		return driver.findElement(password).getAttribute("value");
	}
	public Homepage doLogin(String usn,String pass) {
	
		enterUsername(usn);
		enterPassword(pass);
		driver.findElement(login).click();
		return new Homepage(driver);
	}

}
