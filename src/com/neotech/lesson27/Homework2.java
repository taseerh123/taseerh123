package com.neotech.lesson27;

interface WebDriver {

	// by default they are public abstract
	void open();

	void close();

	String getTitle();
}

interface TakesScreenshot {
	void getScreenshot();
}

interface RemoteWebDriver extends WebDriver, TakesScreenshot {
	void navigate();
}

class ChromeDriver implements RemoteWebDriver {

	@Override
	public void open() {
		System.out.println("Chrome driver opened!");
	}

	@Override
	public void close() {
		System.out.println("Chrome driver closed!");
	}

	@Override
	public String getTitle() {
		return "Neotech";
	}

	@Override
	public void getScreenshot() {
		System.out.println("Take screenshot with chrome driver!");
	}

	@Override
	public void navigate() {
		System.out.println("Navigate on chrome!");
	}

}

class FirefoxDriver implements RemoteWebDriver {

	@Override
	public void open() {
		System.out.println("Firefox driver opened!");

	}

	@Override
	public void close() {
		System.out.println("Firefox driver closed!");
	}

	@Override
	public String getTitle() {
		return "Neotech";
	}

	@Override
	public void getScreenshot() {
		System.out.println("Take screenshot with Firefox driver!");
	}

	@Override
	public void navigate() {
		System.out.println("Navigate on Firefox");
	}

}

class SafariDriver implements RemoteWebDriver {

	@Override
	public void open() {
		System.out.println("Safari driver opened!");

	}

	@Override
	public void close() {
		System.out.println("Safari driver closed!");
	}

	@Override
	public String getTitle() {
		return "Neotech";
	}

	@Override
	public void getScreenshot() {
		System.out.println("Take screenshot with Safari driver");
	}

	@Override
	public void navigate() {
		System.out.println("Navigate on safari!");
	}

}

public class Homework2 {
	public static void main(String[] args) {

		//we cannot instantiate an interface --- we cannot create an object of
		//RemoteWebDriver rwd = new RemoteWebDriver();
		
		//allowed
		RemoteWebDriver rwd = new ChromeDriver(); //upcasting
		WebDriver wd = new ChromeDriver();		//upcasting
		
		
		ChromeDriver cd = new ChromeDriver();
		FirefoxDriver fd = new FirefoxDriver();
		SafariDriver sd = new SafariDriver();
		
		//we are not creating an object here. we are creating and array that contains 
		//objects of RemoteWebDriver type
		RemoteWebDriver[] remoteArray = new RemoteWebDriver[3];
		remoteArray[0] = cd;	
		remoteArray[1] = fd;
		remoteArray[2] = sd;
		
		for(RemoteWebDriver driver : remoteArray)
		{
			driver.open();
			driver.getScreenshot();
			System.out.println(driver.getTitle());
			driver.navigate();
			driver.close();
		}
		
		
		
		//break until: 8:20
		
		
	}

}
