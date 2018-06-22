package com.testLib;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.baseLib.BaseTest;

public class LogInpageTitleTest extends BaseTest{
	//Logger log = Logger.getLogger(LogInpageTitleTest.class);
	String title="Free CRM software in the cloud powers sales and customer service";
	//ExtentReport e=new ExtentReport();
	@Test
	public void loginPageTitleTest()
	{
		//log.info("****************************** starting test case *****************************************");
		//e.extentTest.log(LogStatus.PASS, "in login page");
		String actual=driver.getTitle();
		Assert.assertEquals(actual, title,"title is not maching so fail");
		
		//e.extentTest.log(LogStatus.FAIL, "fail due to title is not matching");
		// log.info("*************************end test*******************************");
		
	}

}
