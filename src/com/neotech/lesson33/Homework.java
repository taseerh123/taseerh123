package com.neotech.lesson33;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Homework {
	/*
	 * Create a PROPERTY file to store following configurations: 
	 * browser= 
	 * url=
	 * username= 
	 * password=
	 */

	public static void main(String[] args) throws IOException {

		// create a file path
		// String filePath =
		// "C:\\Users\\msipc\\Documents\\GitHub\\JavaBasic7\\configs\\homework.txt";
		// having the full path hard-coded is NOT a good practice since
		// other people from your team may run the code

		// to avoid this problem; we have to use dynamic location
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);

		String filePath = projectPath + "/configs/homework.txt";
		System.out.println(filePath);

		// Lets create a FileInputStream object to read the file
		FileInputStream fis = new FileInputStream(filePath);

		// Load the data from the stream
		Properties props = new Properties();
		props.load(fis);

		// what do we have in our properties file
		System.out.println(props);

		// Lets get the value of browser (key)
		String browser = props.getProperty("browser");
		System.out.println(browser);

		// Lets get all the values
		Set<Object> keys = props.keySet();

		for (Object key : keys) {
			System.out.println(key + " --> " + props.get(key));
		}

		System.out.println("---- Selenium Steps -----");
		System.out.println("I am opening a browser: " + props.getProperty("browser"));
		System.out.println("I navigate to this url: " + props.getProperty("url"));
		System.out.println("I will enter username: " + props.getProperty("username"));
		System.out.println("I will enter password: " + props.getProperty("password"));

		// how do we add a new key value pair(property) to the file
		// lets create our new property
		props.setProperty("phone_number", "555 345 5554");

		// we need FileOutputStream to write to the file
		FileOutputStream fos = new FileOutputStream(filePath);

		// store the new property into the file
		props.store(fos, "Added phone property");

	}

}
