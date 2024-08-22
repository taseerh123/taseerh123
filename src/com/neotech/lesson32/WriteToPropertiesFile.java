package com.neotech.lesson32;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToPropertiesFile {

	public static void main(String[] args) throws IOException {

	//1. Location: this is where the file is located:
	String filePath = "C:/Users/tasee/eclipse-workspace/JavaBasic/configs/example.properties";
			
	
	//if I start writing directly on the file, then I overwrite
	//So, I will read, then add new properties, then write
	
	
	//2. create a FileInputStream
	FileInputStream fis = new FileInputStream(filePath);
	
	
	
	//3. create a Properties object
	Properties prop = new Properties();
	
	
	//4. load the data from the .properties file
	prop.load(fis);
	
	//lets change some data
	prop.setProperty("state", "NY");
	
	//lets add a new pair
	prop.setProperty("city", "NYC");
	
	
	//now that I changed it, I can write 
	
	//to write these into the file I need a FileOutputStream
	FileOutputStream fos = new FileOutputStream(filePath);
	
	//writes the changes to the file
	prop.store(fos, "we just updated the file");
	
	

	}

}
