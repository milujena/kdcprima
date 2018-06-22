package com.pageLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseLib.BasePage;

public class HomePage extends BasePage{
	public HomePage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[.='Calendar']")
	private WebElement claender;
	
	public void clender_module()
	{
		claender.clear();
	}

}
