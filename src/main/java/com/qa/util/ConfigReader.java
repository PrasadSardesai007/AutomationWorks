package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private Properties prop;
	
	/**
	 * This method is used to load the  properties from Config.properties file
	 * @return properties object
	 */

	public Properties init_prop() {

		prop = new Properties();

		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\PRASAD\\practice-rest-assured\\SampleCucumberProject\\src\\test\\resources\\com\\config\\config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		return prop;
	}

}
