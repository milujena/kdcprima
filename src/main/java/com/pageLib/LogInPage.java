package com.pageLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseLib.BasePage;
import com.baseLib.BaseTest;

public class LogInPage extends BasePage {
	@FindBy(name="username")
	private WebElement userName;
	
	@FindBy(name="password")
	private WebElement passWord;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement loginBtn;
	
	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	private WebElement signupBtn;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	private WebElement crmLogo;  
	
	//intilazing the page object
	public LogInPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void user_name(String un)
	{
		userName.sendKeys(un);
	}
	public void pass_word(String pwd)
	{
		passWord.sendKeys(pwd);
	}
	public void login_btn()
	{
		loginBtn.click();
	}
	//Actions
	/*public String validationLoginPageTitel()
	{
		return driver.getTitle();
	}
	
	public boolean validateCrmImage()
	{
		return crmLogo.isDisplayed();
	}
	 
	public void login(String un,String pwd)
	{
		userName.sendKeys(un);
		passWord.sendKeys(pwd);
		loginBtn.clear();
		
	}
*/

	

	

}
