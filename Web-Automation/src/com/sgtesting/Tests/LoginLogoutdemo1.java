package com.sgtesting.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutdemo1 {
    public static WebDriver i=null;
	public static void main(String[] args) {
		launch();
		Navigate();
		Login();
		Minimize();
		Logout();
		Close();
	}
	private static void launch()
	{
		try {
			i=new ChromeDriver();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Navigate()
	{
		try {
			i.get("http://localhost:80/login.do");
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Login()
	{
		try {
			i.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(2000);
			i.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			i.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    private static void Minimize()
    {
    	try {
    		i.findElement(By.id("gettingStartedShortcutsPanelId")).click();
    		Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    private static void Logout()
    {
    	try {
    		i.findElement(By.linkText("Logout")).click();
    		Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    private static void Close()
    {
    	try {
    		Thread.sleep(2000);
			i.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
