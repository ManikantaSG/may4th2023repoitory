package com.sgtesting.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpathaxisdemo {
	public static WebDriver j=null;

	public static void main(String[] args) {
		launch();
		navigate();
		enterSalaryForSachinTendulkar();
		 entersalaryrecordwhichisnexttosachin();
		makeastatusasActiveForIndianFreedomFighter();
		makeasstatusAsActiveForRecordWhichIsPreviousToRahulDravid();
		basedonTableDetailsSalaryFor5thRecord();
		childelementtoparentelement();
	}
	private static void launch()
	{
		try {
			 
			j=new ChromeDriver();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try {
			j.get("file:///C:/Users/Admin/AppData/Local/Temp/Rar$EXa19340.18561/WebTableHTML.html");
            Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * case1:following-sibling
	 * Enter the salary for person SachinTendulkar 
	 */
	private static void enterSalaryForSachinTendulkar()
	{
		j.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td[4]/input")).sendKeys("26000");
		
	}
	/**
	 * case2:following
	 * Enter the salary for the record which is next to sachin tendulkar
	 */
	private static void entersalaryrecordwhichisnexttosachin()
	{
		j.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following::tr[1]/td[6]/input")).sendKeys("22000");
	}
	/**
	 * case3:prceeding-sibling
	 * Make the status as active for Designation Indian Freedom Fighter
	 */
	private static void makeastatusasActiveForIndianFreedomFighter()
	{
		j.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/preceding-sibling::td[1]/preceding-sibling::td[1]/input")).click();
	}
	/**
	 * case4:prceeding
	 * Make the status as active for Record which is previous to Rahul Dravid
	 */
	private static void makeasstatusAsActiveForRecordWhichIsPreviousToRahulDravid()
	{
		j.findElement(By.xpath("//td[text()='Rahul Dravid']/preceding::tr[1]/td[1]/input")).click();
	}
	/**
	 * case5:descendant
	 * Based on table details enter salary from 5th record
	 */
	private static void basedonTableDetailsSalaryFor5thRecord()
	{
		j.findElement(By.xpath("//table[@id='tbl1']/descendant::tr[5]/td[6]/input")).sendKeys("26000");
	}
	/**
	 * case5:ancester
	 * Based on salary Text field details for 5th record,get table attribute details
	 */
	private static void childelementtoparentelement()
	{
		WebElement OEle=j.findElement(By.xpath("//input[@id='edit4']/ancestor::tr[1]/ancestor::table"));
	    System.out.println(OEle.getAttribute("id"));
	}
	
}
