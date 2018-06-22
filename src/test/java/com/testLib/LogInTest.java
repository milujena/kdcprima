package com.testLib;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.baseLib.BaseTest;
import com.genericLib.ExtentReport;
import com.pageLib.LogInPage;
import com.relevantcodes.extentreports.LogStatus;




public class LogInTest extends BaseTest {
	Logger log = Logger.getLogger(LogInTest.class);

	String loginPageTitle="Free CRM software in the cloud powers sales and customer service";
	String HomePageTitle="CRMPRO";
	LogInPage lp=new LogInPage(driver);
	@Test
	public void loginTest() 
	{
		log.info("****************************** starting test case *****************************************");
		log.info("****************************** freemCRMLogoTest *****************************************");

		ExtentReport e=new ExtentReport();
		
		     //e.extentTest.log(LogStatus.PASS, "on start of reading");
		

		
	
           lp.verifyTitle(loginPageTitle);
	       lp.user_name("milu123");
	       lp.pass_word("milu123");
	       lp.login_btn();
	       lp.verifyTitle(HomePageTitle);
	       // e.extentTest.log(LogStatus.PASS, "done");
	        log.info("****************************** ending test case *****************************************");
	        log.info("****************************** freeCrmTitleTest *****************************************");

	
	}

}
