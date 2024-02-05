package com.cogni.genc.CommomMethods;

import com.cogni.genc.global.PropertyFileAction;
import com.cogni.genc.global.OpenCartConstants;

public class ConfigurationAction {
	
	public static String getEnvironmentToRun() {
		return PropertyFileAction.getPropertyValue("EnvironmentToRunOn", System.getProperty("user.dir") + "\\ConfigurationProperties.properties");
	}

}
