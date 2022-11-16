package com.tdit.basetest;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.tdit.driverFactory.DriverFactory;
import com.tdit.page.BaseLoginpage;
import com.tdit.utility.ConfigReader;
import com.tdit.utility.Screenshot_Utility;

public class BaseTest {
DriverFactory df;
Properties prop;
public WebDriver driver;
public BaseLoginpage baselogin;
@BeforeTest()
public void beforeTest() throws IOException {
	df=new DriverFactory();
	driver=df.int_driver();
	prop=ConfigReader.loadProperties();
	driver.get(prop.getProperty("baseurl"));
	baselogin=new BaseLoginpage(driver);
}
@AfterMethod()
public void afterMethod(ITestResult result) throws IOException {
	if(ITestResult.FAILURE==result.getStatus()) {
		Screenshot_Utility.takesScreenshot(driver, result.getMethod().getMethodName());
	}
}
@AfterTest()
public void afterTest() {
	driver.quit();
}
}
