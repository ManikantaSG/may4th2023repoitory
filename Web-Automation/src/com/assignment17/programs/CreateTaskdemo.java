package com.assignment17.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateTaskdemo {
    public static WebDriver j=null;
	public static void main(String[] args) {
		LaunchBrowser();
		Navigate();
		Login();
		minimize();
		Createcustomer();
		CreateProject();
		Createtask();
		deletetask();
		Deleteproject();
		Deletecustomer();
	    Logout();
		Close();
		
	}
     private static void LaunchBrowser()
     {
    	 try {
    		 j=new ChromeDriver();
			
		} catch (Exception e) {
			
		}
	}
     private static void Navigate()
     {
    	 try {
    		 j.get("http://localhost:80/login.do");
    		 Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
     }
     private static void Login()
     {
    	 try {
    		   j.findElement(By.name("username")).sendKeys("admin");
    		   Thread.sleep(2000);
			   j.findElement(By.name("pwd")).sendKeys("manager");
			   Thread.sleep(2000);
			   j.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			   Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
     }
     private static void minimize()
 	{
 		try {
 			j.findElement(By.xpath("//*[@id=\"gettingStartedShortcutsPanelId\"]/div[1]")).click();
 			Thread.sleep(2000);
 			
 		} catch (Exception e) {
 			e.printStackTrace();
 		}
 	}
 	private static void Createcustomer()
 	{
 		try {
 			j.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a/div[1]")).click();
 			Thread.sleep(2000);
 			j.findElement(By.xpath("//div[text()='Add New']")).click();
 			Thread.sleep(2000);
 			j.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
 			Thread.sleep(2000);
 			j.findElement(By.id("customerLightBox_nameField")).sendKeys("Suman");
 			Thread.sleep(2000);
 			j.findElement(By.xpath("//*[@id=\"customerLightBox_descriptionField\"]")).sendKeys("mnahhshgrgrgvgv");
 			Thread.sleep(2000);
 			j.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/table/tbody/tr/td[2]/div[1]/div/span")).click();
 			Thread.sleep(2000);
 			
 		} catch (Exception e) {
 			e.printStackTrace();
 		}
 	}
 	private static void CreateProject()
 	{
 		try {
 			j.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")).click();
 			Thread.sleep(2000);
 			j.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
 			Thread.sleep(2000);
 			j.findElement(By.id("projectPopup_projectNameField")).sendKeys("Chikkaballapura Project");
 			Thread.sleep(2000);
 			j.findElement(By.name("projectDescriptionField")).sendKeys("Isha Foundation Project");
 			Thread.sleep(2000);
 			j.findElement(By.xpath("//*[@id=\"projectPopup_commitBtn\"]/div/span")).click();
 			Thread.sleep(2000);
 		} catch (Exception e) {
 			e.printStackTrace();
 		}
 	}
	private static void Createtask()
	{
		try
		{
			
			j.findElement(By.xpath("//div[text()='Add New Task']")).click();
			Thread.sleep(2000);
			j.findElement(By.xpath("/html/body/div[13]/div[1]")).click();
			Thread.sleep(2000);
			j.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")).sendKeys("123");
			Thread.sleep(2000);
			j.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[2]/td[1]/input")).sendKeys("xyz");
			Thread.sleep(2000);
			j.findElement(By.xpath("//span[text()='Create Tasks']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		private static void deletetask()
		{
			try
			{
				j.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[2]/div[1]/table[1]/tbody/tr[1]/td[2]/div/div[2]")).click();
				Thread.sleep(2000);
				j.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[3]/div[1]/div[2]/div[3]/div/div")).click();
				Thread.sleep(2000);
				j.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[3]/div[4]/div/div[3]/div")).click();
				Thread.sleep(2000);
                j.findElement(By.xpath("//*[@id=\"taskPanel_deleteConfirm_submitBtn\"]/div")).click();
                Thread.sleep(2000);
                j.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]")).click();
                Thread.sleep(2000);
                j.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[3]/div[1]/div[2]/div[3]/div/div")).click();
                Thread.sleep(2000);
                j.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[3]/div[4]/div/div[3]/div")).click();
                Thread.sleep(2000);
                j.findElement(By.xpath("//*[@id=\"taskPanel_deleteConfirm_submitBtn\"]/div")).click();
                Thread.sleep(2000);
                
		}catch(Exception e)
			{
			e.printStackTrace();
			}
		
	}
 	
 	private static void Deleteproject()
	{
		try {
			j.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(2000);
			j.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(2000);
			j.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			j.findElement(By.id("projectPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Deletecustomer()
	{
		try {
			j.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(1000);
			j.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div/div[2]")).click();
			Thread.sleep(1000);
			j.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(1000);
			j.findElement(By.xpath("//*[@id=\"customerPanel_deleteConfirm_submitTitle\"]")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Logout()
	{
		try {
			j.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Close()
	{
		try {
			Thread.sleep(2000);
			j.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}


}
