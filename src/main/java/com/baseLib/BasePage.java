package com.baseLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage {
public  WebDriver driver;
	
     public BasePage(WebDriver driver)
     {
	this.driver = driver;
     }

	
	//to verify the page
	public void verifyTitle(String eTitle)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try
		{
			wait.until(ExpectedConditions.titleIs(eTitle));
			Reporter.log("Title is matching", true);
		}
		catch(Exception e)
		{
			Reporter.log("Title is not matching", true);
			Assert.fail();;	
		}
	}
		
		//To verify the Element
	public void verifyElement(WebElement element)
	{
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		try
		{
			wait1.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("element displayed", true);
		}
		catch(Exception e)
		{
			Reporter.log("Element not found", true);
		}
	}



}
