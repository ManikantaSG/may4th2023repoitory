package com.sgtesting.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mainfirefoxdemo {
    public static WebDriver Object=null;
	public static void main(String[] args) {
		LaunchApp();
		Navigate();
		CloseA();
	}
	private static void LaunchApp()
	{
		try {
			 Object=new FirefoxDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void Navigate()
	{
		try {
			Object.get("https://www.youtube.com/");
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void CloseA()
	{
		try {
			Object.close();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
    
}
