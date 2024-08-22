package com.neotech.lesson26;

public class WebDriverTest {

	public static void main(String[] args) {
		

			ChromeDriver chrome = new ChromeDriver();
			
			chrome.openBrowser();
			chrome.maximizeWindow();
			chrome.findElement();
			chrome.takePicture();
			chrome.closeBrowser();
			
			
			FirefoxDriver firefox = new FirefoxDriver();
			firefox.openBrowser();
			firefox.maximizeWindow();
			firefox.findElement();
			firefox.takePicture();
			firefox.closeBrowser();
			
			
			
			WebDriver driver = new FirefoxDriver();
			
			
			driver.openBrowser();
			driver.maximizeWindow();
			driver.findElement();

			//driver.takePicture(); //this only exists in the Camera interface
			
			//how would I access takePicture();
				//I can cast the object inside the driver to a Camera Type
			
			Camera cam = (Camera) driver;
			
			cam.takePicture();
//			cam.closeBrowser();
			
		//	ChromeDriver cd = (ChromeDriver) driver;
			
			driver.closeBrowser();
		}
	

}
