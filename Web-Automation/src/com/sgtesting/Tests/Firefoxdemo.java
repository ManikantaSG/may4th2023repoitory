package com.sgtesting.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxdemo {
    public static WebDriver obroweser=null;
	public static void main(String[] args) {
		Launchbrowser();
		navigate();
		Closeapplication();
	}

	private static void Launchbrowser()
	{
		try {
			obroweser=new FirefoxDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
   private static void navigate()
   {
	   try {
		   obroweser.get("http://localhost:81/login.do");
		   Thread.sleep(1000);
	} catch (Exception e) {
		e.printStackTrace();
	}
	  
   }
   private static void Closeapplication()
   {
	   try {
		   obroweser.close();
		   Thread.sleep(1000);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
   }
}
