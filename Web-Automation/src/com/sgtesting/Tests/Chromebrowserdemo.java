package com.sgtesting.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromebrowserdemo {
	public static WebDriver obroweser=null;
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		closeApplication();
	}
	public static void launchbrowser()   //public or private
	{
		try {
			obroweser=new ChromeDriver();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
  public static void navigate()
{
	try {
		obroweser.get("http://localhost:81/login.do");
		Thread.sleep(1000);
	} catch (Exception e) {
		e.printStackTrace();
	}
}
  public static void closeApplication()
  {
	  try {
		  obroweser.close();
		  Thread.sleep(1000);
		  
	} catch (Exception e) {
		e.printStackTrace();
	}
  }
}
   