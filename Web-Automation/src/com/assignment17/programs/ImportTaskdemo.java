package com.assignment17.programs;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImportTaskdemo {
	public static WebDriver o=null;
	public static void main(String[] args) {
		LaunchBrowser();
		Navigate();
		Login();
		minimize();
		importTasks();
	}
	private static void LaunchBrowser()
	{
		try {
			o=new ChromeDriver();

		} catch (Exception e) {

		}
	}
	private static void Navigate()
	{
		try {
			o.get("http://localhost:80/login.do");
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Login()
	{
		try {
			o.findElement(By.name("username")).sendKeys("admin");
			Thread.sleep(2000);
			o.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			o.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void minimize()
	{
		try {
			o.findElement(By.xpath("//*[@id=\"gettingStartedShortcutsPanelId\"]/div[1]")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    private static void importTasks()
    {
    	try {
    		  o.findElement(By.xpath("//div[text()='TASKS']")).click();
    		  Thread.sleep(2000);
    		  o.findElement(By.xpath("//div[text()='Add New Task']")).click();
    		  Thread.sleep(2000);
    		  o.findElement(By.xpath("/html/body/div[13]/div[2]")).click();
    		  Thread.sleep(2000);
    		  o.findElement(By.id("sampleCSVFileLink")).click();
    		  Thread.sleep(2000);
    		  o.findElement(By.id("dropzoneClickableArea")).click();
    		  Thread.sleep(2000);
    		  String Filename="D:\\Demo\\Test\\Sample (1).csv";
    		  CopyFile(Filename);
    		  Thread.sleep(2000);
    		  Robot robot=new Robot();
    		  robot.keyPress(KeyEvent.VK_CONTROL);
    		  robot.keyPress(KeyEvent.VK_V);
    		  robot.keyRelease(KeyEvent.VK_CONTROL);
    		  robot.keyRelease(KeyEvent.VK_V);
    		  Thread.sleep(2000);
    		  robot.keyPress(KeyEvent.VK_ENTER);
    		  robot.keyRelease(KeyEvent.VK_ENTER);
    		  Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
	private static void CopyFile(String filename) {
	StringSelection strSelection=new StringSelection(filename);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
	}
}
