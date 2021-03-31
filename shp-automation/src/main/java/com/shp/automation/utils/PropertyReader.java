package com.shp.automation.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {

	
	
	public static String getMyProperty(String key) throws IOException {
	//Step 1 : Create the properties Object
	//there is already class called "Properties" in java we need to use it.
	Properties properties = new Properties();
	
	//Step 2 : Input the file(to read the properties file)
	InputStream inputStream = new FileInputStream("env.properties");
	
	//Step 3 : load the properties object with the input file
	properties.load(inputStream);
	
	//Step 4 : Access the property from the properties file
	//String browserName = properties.getProperty("browser");
	//System.out.println("The Browser Name is :" +browserName);
	
	//String url = properties.getProperty("url");
	//System.out.println("THe url is :"+url);
	
	
	String value  = properties.getProperty(key);
	System.out.println("Value is "+value);
	return value;
	
	
	}
}
