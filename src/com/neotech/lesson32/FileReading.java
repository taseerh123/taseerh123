package com.neotech.lesson32;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileReading {

	public static void main(String[] args) throws IOException {
		
	String fullPath = "C:/Users/tasee/eclipse-workspace/JavaBasic/configs/conf.properties";
	
	//this part of the path: C:/Users/sabah/eclipse-workspace/ does not exist in your pc
	
			//find the user directory
			String userDirectory = System.getProperty("user.dir");
			System.out.println(userDirectory);
			
			
			//find the username
			String userName = System.getProperty("user.name");
			System.out.println(userName);
			
			
			
			//get the os info
			String os = System.getProperty("os.name");
			System.out.println(os);
			
			System.out.println("---------------------");
			

			String dynamicPath = System.getProperty("user.dir") + "/configs/conf.properties";
			System.out.println(dynamicPath);
			
			FileInputStream fis = new FileInputStream(dynamicPath);
			
			Properties prop = new Properties();
			prop.load(fis);
			
			//Now I have read the file and loaded all the data in the prop object
			
			String url = prop.getProperty("url");
			System.out.println(url);
			System.out.println(prop.getProperty("browser"));
			
			
			
	}

}
