package com.assignment17.programs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Createuserdemo {
	public static WebDriver u=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		Login();
		Minimize();
		CreateUser();
		deleteuser();
		Logout();
		Close();
	}
	private static void launchBrowser()
	{
		try {
			u=new ChromeDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void navigate()
	{
		try {
			u.get("http://localhost:80/login.do");
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Login()
	{
		try {
			u.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(2000);
			u.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			u.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Minimize()
	{
		try {
			u.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void CreateUser()
	{
		try {
			u.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			u.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			Thread.sleep(2000);
			u.findElement(By.name("firstName")).sendKeys("demo1");
			u.findElement(By.name("lastName")).sendKeys("User1");
			u.findElement(By.name("email")).sendKeys("mani387171@gmail.com");
			u.findElement(By.name("username")).sendKeys("user1");
			u.findElement(By.name("password")).sendKeys("u1234");
			u.findElement(By.name("passwordCopy")).sendKeys("u1234");
			u.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deleteuser()
	{
		try {
			u.findElement(By.className("userNameSpan")).click();
			Thread.sleep(2000);
			u.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);

			Alert y=u.switchTo().alert();
			String r=y.getText();
			Thread.sleep(1000);; 
			System.out.println(r); 
			y.accept();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Logout()
	{
		try {
			u.findElement(By.linkText("Logout")).click();


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Close()
	{
		try {
			u.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
