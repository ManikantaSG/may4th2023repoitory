package com.sgtesting.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maindemochrome {
    public static WebDriver Obrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		 navigate();
		 ApplClose();
	}
	  private static void launchBrowser()
	  {
		 try {
			 Obrowser=new ChromeDriver();
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	  private static void navigate()
	  {
		  try {
			  Obrowser.get("https://www.youtube.com/");
			  Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	  }
	  private static void ApplClose()
	  {
		  try {
			  Obrowser.close();
	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	  }

}
