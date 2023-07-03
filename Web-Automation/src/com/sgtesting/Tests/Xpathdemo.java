package com.sgtesting.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathdemo {
    public static WebDriver i=null;
	public static void main(String[] args) {
		launch();
		navigate();
		//absolutexpath();
		//relativexpathBytagname();
		//relativexpathBytagnamewithIndex();
		//relativexpathUsingTagNamewithAttributeNameValue();
		relativexpathUsingTagNamewithMultipleAttributeNameValue();
	}
	private static void launch()
	{
		try {
			
			i=new ChromeDriver();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try {
			i.get("file:///C:/Users/Admin/AppData/Local/Temp/Rar$EXa15244.17641/Sample.html");
			Thread.sleep(5000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void absolutexpath()
	{
		
			i.findElement(By.xpath("html//body/div/form/input")).sendKeys("Demouser1");		
	}
	/**
	 * case1:Identify element based on tagname alone
	 * syntax://<tagName>
	 */
	private static void relativexpathBytagname()
	{
		i.findElement(By.xpath("//input")).sendKeys("Demouser2");
	}
	/**
	 * case2:Identify element based on tagname with index
	 * syntax://<tagname>[index]
	 */
	private static void relativexpathBytagnamewithIndex()
	{
	  i.findElement(By.xpath("//input[2]")).sendKeys("Demouser3");
	}
	/**
	 * case3:Identify element based on tagname with attributeName and value combination
	 * 	 * syntax://<tagname>[@attribute='attribute']
	 */
	private static void relativexpathUsingTagNamewithAttributeNameValue()
	{
		i.findElement(By.xpath("//input[@name='pass1word1']")).sendKeys("NewPasswordDemo");
	}
	/**
	 * case3:Identify element based on tagname with Multiple attributeName and value combination
	 * using or operator
	 * syntax://<tagname>[@attributeName='attributeValue' or @attributeName='attributeValue']
	 */
	private static void relativexpathUsingTagNamewithMultipleAttributeNameValue()
	{
		i.findElement(By.xpath("//input[@name='pass1word1' or @class='pass1word1']")).sendKeys("TestingUser1");
	}
	
}
