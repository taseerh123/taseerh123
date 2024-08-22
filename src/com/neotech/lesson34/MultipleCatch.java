package com.neotech.lesson34;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MultipleCatch {

	public static void main(String[] args) {

		String filePath = System.getProperty("user.dir") + "/configs/example.properties";

		try {

			FileInputStream fis = new FileInputStream(filePath);

			//intentionally closing the fis to cause the IOException
	//		fis.close();
			
			Properties prop = new Properties();
			prop.load(fis);

			System.out.println(prop);

		} 
		catch(FileNotFoundException fnfe)
		{
			System.out.println(fnfe.getMessage());
			System.out.println("Check your example.properties file location!");
		}
		catch(IOException ioe)
		{
			System.out.println(ioe.getMessage());
			System.out.println("Could not load the properties file!!!");
			ioe.printStackTrace();
			System.out.println(ioe);
		}
	
		
		//one simple approach
//		catch (Exception e) {
//			System.out.println(e);
//		}

		
		
		
		System.out.println("End of code!");


	}

}
