package com.neotech.lesson32;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileReading {

	public static void main(String[] args) throws IOException {

		//locating the file
				
		//1. Location -- this is where the file is located
		
		String filePath = "C:/Users/tasee/eclipse-workspace/JavaBasic/configs/example.properties";
		
		//2. Am I reading or writing -- FileInputStream
				FileInputStream fis = new FileInputStream(filePath);
				
				//these next steps are specific to .properties file type
				
				//3. create a properties object
				
				Properties prop = new Properties();
				
				//4. load the data in the properties object
				prop.load(fis);
				
				
				//lets read the data
				
				String name = prop.getProperty("name");
				System.out.println("name -> " + name);
				
				//keys are case sensitive, it will not get the values
				String lastName = prop.getProperty("lastname");
				System.out.println("lastName -> " + lastName);
				
				System.out.println("-------");
				
				Set<Object> keys = prop.keySet();
				Collection<Object> values =  prop.values();
				
				System.out.println(keys);
				System.out.println(values);
				
				
				for (Object key : keys)
				{
					System.out.println(key);
				}
				
				for (Object value : values)
				{
					System.out.println(value);
				}

	}

}
