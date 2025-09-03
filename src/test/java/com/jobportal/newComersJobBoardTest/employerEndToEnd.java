package com.jobportal.newComersJobBoardTest;

import org.testng.annotations.Test;

import com.Jobportal.newComersJobBoard.generic.basetest.BaseClass;
import com.Jobportal.newComersJobBoard.generic.fileUtility.ExcelUtility;
import com.Jobportal.newComersJobBoard.generic.objectrepositoryutility.EmployersSignUpPage;
import com.Jobportal.newComersJobBoard.generic.objectrepositoryutility.HomePage;
import com.Jobportal.newComersJobBoard.generic.objectrepositoryutility.postjobpage;
import com.Jobportal.newComersJobBoard.generic.webdriverutility.JavaUtility;

public class employerEndToEnd extends BaseClass{
	@Test
	public void signup() throws Throwable
		{
		ExcelUtility exu=new ExcelUtility();
		JavaUtility ju=new JavaUtility();
		int ranInt = ju.getRandomNumber();
		HomePage hp =new HomePage(driver);
		hp.getEmployerImg().click();
		hp.getEmployerSignupBtn().click();
		
		String CompName = exu.getDataFromExcel("EmpSignUp", 2, 0)+ranInt;
		String Comptag= exu.getDataFromExcel("EmpSignUp", 2, 1)+ranInt;
		String ContName = exu.getDataFromExcel("EmpSignUp",2, 2)+ranInt;
		String CompEmail = exu.getDataFromExcel("EmpSignUp", 2, 3)+ranInt+"@gmail.com";
		String ComPass = exu.getDataFromExcel("EmpSignUp", 2, 4);
		String ComCfpass = exu.getDataFromExcel("EmpSignUp", 2, 5);
		
			
			EmployersSignUpPage ep=new EmployersSignUpPage(driver);
			ep.getCompNameTxt().sendKeys(CompName);
			ep.getCompNameTxt().sendKeys(Comptag);
			ep.getContNameTxt().sendKeys(ContName);
			ep.getCompEmailTxt().sendKeys(CompEmail);
			ep.getCompPasswordTxt().sendKeys(ComPass);
			ep.getCompCFPasswordTxt().sendKeys(ComCfpass);
			ep.getCreateAccBtn().click();
			ep.getAccBtn().click();
			
			postjobpage pjp=new postjobpage(driver);
			pjp.getPostJobBtn().click();
			pjp.getFreeBtn().click();
			//pjp.getNewEmpRadio().click();
			//pjp.getNextBtn().click();
			pjp.getImpUrl().click();
			Thread.sleep(2000);
			pjp.getImpUrlTxt().click();
			pjp.getImpUrlTxt().sendKeys("https://www.nnas.ca/");
			pjp.getImpJobBtn().click();
			pjp.NavigateToPOst(driver);
			
			
			
		
				}


}
