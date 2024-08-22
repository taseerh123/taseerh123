package com.neotech.review11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {

		// The path of this project (in my computer)
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);

		// I have created the full path to the file
		String filePath = projectPath + "/extra/demo.properties";
		System.out.println(filePath);

		// fileIS will help me read the file
		FileInputStream fileIS = new FileInputStream(filePath);

		// proper is a Map (key-value pairs)
		Properties proper = new Properties();

		// load() method will help me read from the file to the proper-map
		proper.load(fileIS);
		System.out.println(proper);

		// 1st way
		Object firstName = proper.get("FirstName");
		System.out.println(firstName);

		// 2nd way, the correct way
		String school = proper.getProperty("School");
		System.out.println(school);

		// I will get the Age as a String because of getProperty()
		String age = proper.getProperty("Age");
		System.out.println(age);

		// Add more key-value pairs
		proper.setProperty("SSN", "891-35-7240");
		System.out.println(proper);

		// Re-assign the Age
		proper.setProperty("Age", "50");
		System.out.println(proper);

		// Now let us save into a New File

		// The path to the new file
		String newPath = projectPath + "/extra/NewFile.txt";
		FileOutputStream fileOS = new FileOutputStream(newPath);

		proper.store(fileOS, "Raul is very smart!!!");

	}

}
