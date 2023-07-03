package com.sgtesting.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutdemo {
    public static WebDriver obj=null;
	public static void main(String[] args) {
		LaunchBrowser();
		 Navigate();
		 Login();
		 minimize();
		 Logout();
		 close();
	}
	private static void LaunchBrowser()
	{
	   try {
		   obj=new ChromeDriver();
		     
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
	private static void Navigate()
	{
		try {
			obj.get("http://localhost:80/login.do");
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Login()
	{
		try {
			obj.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(2000);
			obj.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			obj.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void minimize()
	{
		try {
			obj.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Logout()
	{
		try {
			obj.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void close()
	{
		try {
			Thread.sleep(2000);
			obj.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
