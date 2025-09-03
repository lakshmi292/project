package com.jobportal.newComersJobBoardTest;

import org.testng.annotations.Test;

import com.Jobportal.newComersJobBoard.generic.basetest.BaseClass;
import com.Jobportal.newComersJobBoard.generic.fileUtility.ExcelUtility;
import com.Jobportal.newComersJobBoard.generic.objectrepositoryutility.HomePage;
import com.Jobportal.newComersJobBoard.generic.objectrepositoryutility.JobSeekerLoginPage;

public class jobseekerloginTest extends BaseClass{
@Test
	public void login() throws Throwable {
	 ExcelUtility exu=new ExcelUtility();
	HomePage hp =new HomePage(driver);
    hp.getJobseekerImg().click();
    hp.getSeekerLoginBtn().click();
    
   
	String SeekerEmail = exu.getDataFromExcel("seekerlogin", 1, 0);
	String SeekerPass= exu.getDataFromExcel("seekerlogin",1, 1);    
    JobSeekerLoginPage jlp=new JobSeekerLoginPage(driver);
    jlp.loginToapp(SeekerEmail, SeekerPass);
}

}
