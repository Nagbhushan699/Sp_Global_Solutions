package com.tdit.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class BaseLoginpage {
	WebDriver driver;
	public BaseLoginpage(WebDriver driver) {
		this.driver=driver;
	}
	
	private By loginbtn=By.xpath("//a[text()='Login']");
	public Loginpage goToLogin() {
		driver.findElement(loginbtn).click();
		return new Loginpage(driver);
	}

}
