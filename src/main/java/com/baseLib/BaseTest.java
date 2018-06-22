package com.baseLib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.genericLib.TestUtils;


public class BaseTest  {
	public static WebDriver driver;
	public static Properties prop;
	Logger log = Logger.getLogger(BaseTest.class);
	

	
	
	@BeforeTest
	public void precondition() throws IOException
	{
		log.info("****************************** Starting test cases execution  *****************************************");

	
		Properties prop=new Properties();
	FileInputStream ip=new FileInputStream("D:\\Project Management\\com.qa.kdcprima.test\\src\\main\\java\\com\\configurationFileLib\\config.properties");
	prop.load(ip);
		
		
	String browserName=prop.getProperty("browser");
	System.out.println(browserName);
	if(browserName.equals("chrome"))
	{
	System.setProperty("webdriver.chrome.driver","D:\\Project Management\\com.qa.kdcprima.test\\driver\\chromedriver.exe" );
	    driver=new ChromeDriver();
	} 
	else if(browserName.equals("ff"))
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Project Management\\com.qa.kdcprima.test\\driver\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	    
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICITY_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		log.info("entering application URL");
		
	}
	@AfterTest
	public void postconditon() 
	{
		
		driver.close();
		log.info("****************************** Browser is closed *****************************************");

	

    }
}
