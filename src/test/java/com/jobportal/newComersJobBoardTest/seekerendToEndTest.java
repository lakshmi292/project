package com.jobportal.newComersJobBoardTest;

import org.testng.annotations.Test;

import com.Jobportal.newComersJobBoard.generic.basetest.BaseClass;
import com.Jobportal.newComersJobBoard.generic.fileUtility.ExcelUtility;
import com.Jobportal.newComersJobBoard.generic.objectrepositoryutility.HomePage;
import com.Jobportal.newComersJobBoard.generic.objectrepositoryutility.JobSeekerLoginPage;

public class seekerendToEndTest extends BaseClass{
	@Test
	public void login() throws Throwable {
	HomePage hp =new HomePage(driver);
    hp.getJobseekerImg().click();
    hp.getSeekerLoginBtn().click();
    
    ExcelUtility exu=new ExcelUtility();
	String SeekerEmail = exu.getDataFromExcel("seekerlogin", 1, 0);
	String SeekerPass= exu.getDataFromExcel("seekerlogin",1, 1); 
	
    JobSeekerLoginPage jlp=new JobSeekerLoginPage(driver);
    jlp.getEmailTxt().sendKeys(SeekerEmail);
    jlp.getPasswordTxt().sendKeys(SeekerPass);
    jlp.getLoginBtn().click();
    jlp.BillingToApp();
}
}