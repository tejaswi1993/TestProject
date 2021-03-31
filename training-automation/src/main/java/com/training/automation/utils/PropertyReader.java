package com.training.automation.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {

	public static String getMyProperty(String key) throws IOException {
		
		//create object for property
		Properties properties = new Properties();
		
		//create inputstream
		InputStream inputstream = new FileInputStream("env.properties");
		
		//load the properties to inputstream
		
		properties.load(inputstream);
		
		String value = properties.getProperty(key);
		System.out.println("The values is :" +value);
		return value;
	}
}
