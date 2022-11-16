package com.tdit.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class Screenshot_Utility {

	public static void takesScreenshot(WebDriver driver,String name) throws IOException {
		String path="\\src\\Screenshots";
		String fullpath=System.getProperty("user.dir")+path+File.separator+name+" .jpg";
		File dest=new File(fullpath);
		TakesScreenshot screenshot =(TakesScreenshot)driver;
		try {
			File src=	screenshot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, dest);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
