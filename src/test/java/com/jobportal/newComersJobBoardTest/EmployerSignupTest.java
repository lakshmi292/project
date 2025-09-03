package com.jobportal.newComersJobBoardTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Jobportal.newComersJobBoard.generic.basetest.BaseClass;
import com.Jobportal.newComersJobBoard.generic.fileUtility.ExcelUtility;
import com.Jobportal.newComersJobBoard.generic.fileUtility.FileUtility;
import com.Jobportal.newComersJobBoard.generic.fileUtility.JsonUtility;
import com.Jobportal.newComersJobBoard.generic.objectrepositoryutility.EmployersSignUpPage;
import com.Jobportal.newComersJobBoard.generic.objectrepositoryutility.HomePage;
import com.Jobportal.newComersJobBoard.generic.objectrepositoryutility.JobSeekerLoginPage;
import com.Jobportal.newComersJobBoard.generic.webdriverutility.JavaUtility;

public class EmployerSignupTest extends BaseClass
{
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
			}


}
