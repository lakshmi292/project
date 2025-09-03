package com.jobportal.newComersJobBoardTest;

import java.awt.datatransfer.StringSelection;

import org.testng.annotations.Test;

import com.Jobportal.newComersJobBoard.generic.basetest.BaseClass;
import com.Jobportal.newComersJobBoard.generic.fileUtility.ExcelUtility;
import com.Jobportal.newComersJobBoard.generic.objectrepositoryutility.HomePage;
import com.Jobportal.newComersJobBoard.generic.objectrepositoryutility.JobSeekerSignUpPage;
import com.Jobportal.newComersJobBoard.generic.webdriverutility.JavaUtility;

public class seekersignup extends BaseClass{
	@Test
	public void signup() throws Throwable
		{
		ExcelUtility exu=new ExcelUtility();
		JavaUtility ju=new JavaUtility();
		
		int ranInt = ju.getRandomNumber();
		HomePage hp =new HomePage(driver);
		hp.getJobseekerImg().click();
		hp.getSeekerSignupBtn().click();
	
	   String FirstName = exu.getDataFromExcel("seekersignup",1, 0)+ranInt;
	   String LastName = exu.getDataFromExcel("seekersignup", 1, 1)+ranInt;
	   String city = exu.getDataFromExcel("seekersignup", 1, 2);
	    String title = exu.getDataFromExcel("seekersignup", 1,3 );
	    String companyName = exu.getDataFromExcel("seekersignup", 1, 4);
	    String emaiul = exu.getDataFromExcel("seekersignup", 1, 5)+ranInt+"gmail.com";
	    String pass = exu.getDataFromExcel("seekersignup", 1, 6);
	    String comformpass = exu.getDataFromExcel("seekersignup", 1, 7);
	   
	    
	   JobSeekerSignUpPage js=new JobSeekerSignUpPage(driver);
	   js.getFNTxt().sendKeys(FirstName);
	   js.getLNTxt().sendKeys( LastName );
	   js.SignToResume();
	    js.getAddTxt().sendKeys(city);
	   js.getTitleTxt().sendKeys(title);
	   js.getCompanyTxt().sendKeys(companyName);
	   js.getRoleCheckBox().click();
	   js.getEmailTxt().sendKeys(emaiul);
	   js.getPasswordTxt().sendKeys(pass);
	   js.getComPassTxt().sendKeys(comformpass);
	   js.getCreatAccBtn().click();
	   js.getAccBtn().click();
	   
	   
}
}

