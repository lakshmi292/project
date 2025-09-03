package com.jobportal.newComersJobBoardTest;

import java.awt.image.BaseMultiResolutionImage;

import org.testng.annotations.Test;

import com.Jobportal.newComersJobBoard.generic.basetest.BaseClass;
import com.Jobportal.newComersJobBoard.generic.fileUtility.ExcelUtility;
import com.Jobportal.newComersJobBoard.generic.objectrepositoryutility.HomePage;
import com.Jobportal.newComersJobBoard.generic.objectrepositoryutility.JobSeekerLoginPage;
import com.Jobportal.newComersJobBoard.generic.objectrepositoryutility.SearchPage;

public class integrationjobseekerTest extends BaseClass{
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
    jlp.getSaveBtn().click();
    jlp.getViewBtn().click();
    jlp.getSeekerimg().click();
    jlp.getProfileImg().click();
    jlp.getBillingBtn().click();
    
	}
	
	@Test
	public void search() throws Throwable {

   SearchPage sp=new SearchPage(driver);
   //sp.getKeyTxt().sendKeys("vermax");
  
	
	}
}
