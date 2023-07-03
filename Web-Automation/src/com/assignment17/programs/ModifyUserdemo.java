package com.assignment17.programs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModifyUserdemo {
	public static  WebDriver o=null;
	public static void main(String[] args) {
		launch();
		Navigate();
		login();
		minimize();
		createuser();
		Modifyuser();
		deleteuser();
		 Logout();
		 Close();
		 
		
	}
	private static void launch()
	{
		try {
			o=new ChromeDriver();


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Navigate()
	{
		try {
			o.get("http://localhost:80/login.do");
			Thread.sleep(2000);

		} catch (Exception e) {

		}
	}
	private static void login()
	{
		try {
			o.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
			Thread.sleep(2000);
			o.findElement(By.xpath("//*[@id=\"loginFormContainer\"]/tbody/tr[1]/td/table/tbody/tr[2]/td/input")).sendKeys("manager");
			Thread.sleep(2000);
			o.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);

		} catch (Exception e) {

		}
	}
	private static void minimize()
	{
		try {
			o.findElement(By.xpath("//*[@id=\'gettingStartedShortcutsPanelId\']/div[1]")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void createuser()
	{
		try {
			o.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div/div[2]")).click();
			Thread.sleep(2000);
			o.findElement(By.name("firstName")).sendKeys("Demo2");
			Thread.sleep(2000);
			o.findElement(By.name("lastName")).sendKeys("user");
			Thread.sleep(2000);
			o.findElement(By.name("email")).sendKeys("mani7654@gmail.com");
			Thread.sleep(2000);
			o.findElement(By.name("username")).sendKeys("user1");
			Thread.sleep(2000);
			o.findElement(By.name("password")).sendKeys("vgrteg123");
			Thread.sleep(2000);
			o.findElement(By.name("passwordCopy")).sendKeys("vgrteg123");
			Thread.sleep(2000);
			o.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(20000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Modifyuser()
	{
		try {
			o.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			o.findElement(By.name("lastName")).clear();
			Thread.sleep(2000);
			o.findElement(By.name("lastName")).sendKeys("mani");
			Thread.sleep(2000);
			o.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deleteuser()
	{
		try {
			o.findElement(By.xpath("//span[text()='mani, Demo2']")).click();
			Thread.sleep(2000);
			o.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			o.switchTo().alert().accept();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Logout()
	{
		try {
			o.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Close()
	{
		try {
			Thread.sleep(2000);
			o.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}




}
