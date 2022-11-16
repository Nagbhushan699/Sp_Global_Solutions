package com.tdit.utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	public static Properties loadProperties() throws IOException {
		String path="\\src\\main\\resources\\com\\tdit\\properties\\Properties.properties";
		String fullpath=System.getProperty("user.dir")+path;
		FileReader file=new FileReader(fullpath);
		Properties prop=new Properties();
		prop.load(file);
		return prop;
	}

}
