package com.cogni.genc.global;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileAction {
	
	/**
	 * THIS METHOD RETURNS THE VALUE OF PROVIDED PROPERTY
	 * 
	 * @param property
	 * @param propertyFilePath
	 * @return
	 */
	public static String getPropertyValue(String property, String propertyFilePath) {
		Properties prop = new Properties();
		File file = null;
		FileInputStream input = null;
		String result = null;
		try {
			file = new File(propertyFilePath);
			input = new FileInputStream(file);
			prop.load(input);
			input.close();
			result = prop.getProperty(property);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

}
