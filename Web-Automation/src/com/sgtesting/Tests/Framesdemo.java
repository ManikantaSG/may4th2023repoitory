package com.sgtesting.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framesdemo {
    public static WebDriver k=null;
	public static void main(String[] args) {
		LaunchBrowser();
		navigate();
		HandleFrame();
	}
    private static void LaunchBrowser()
    {
    	try {
    		k=new ChromeDriver();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    private static void navigate()
    {
    	try {
    		k.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    private static void HandleFrame()
    {
    	try {
			k.switchTo().frame(0);
			k.findElement(By.linkText("org.openqa.selenium")).click();
			Thread.sleep(2000);
			k.switchTo().defaultContent();
			k.switchTo().frame(1);
			k.findElement(By.xpath("packageFrame")).click();
			k.switchTo().defaultContent();
			WebElement OEle=k.findElement(By.xpath("//iframe[@title='Package, class and interface descriptions']"));
			Thread.sleep(2000);
			k.switchTo().defaultContent();
			String content=k.findElement(By.xpath("/html/body/main/div[2]")).getText();
			System.out.println(content);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
