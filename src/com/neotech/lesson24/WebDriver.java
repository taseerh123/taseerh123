package com.neotech.lesson24;

public class WebDriver {
	
	public void openBrowser()
	{
		System.out.println("Open Browser!");
	}
}

class ChromeDriver extends WebDriver
{
	public void openBrowser()
	{
		System.out.println("Open Chrome Browser!");
	}
}

class FireFoxDriver extends WebDriver
{
	public void openBrowser()
	{
		System.out.println("Open Firefox Browser!");
	}
}

class EdgeBrowser extends WebDriver
{

	@Override
	public void openBrowser() {
		System.out.println("Open Edge Browser!");
	}

}
