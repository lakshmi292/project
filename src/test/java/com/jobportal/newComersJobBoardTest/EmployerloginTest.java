package com.jobportal.newComersJobBoardTest;

import org.testng.annotations.Test;

import com.Jobportal.newComersJobBoard.generic.basetest.BaseClass;
import com.Jobportal.newComersJobBoard.generic.fileUtility.ExcelUtility;
import com.Jobportal.newComersJobBoard.generic.objectrepositoryutility.EmplyeerLoginPage;
import com.Jobportal.newComersJobBoard.generic.objectrepositoryutility.HomePage;

public class EmployerloginTest extends BaseClass {
	
@Test
	public void login() throws Throwable
	{
	ExcelUtility exu=new ExcelUtility();
	String CompEmail = exu.getDataFromExcel("EmpLogin", 1, 0);
	String ContPass= exu.getDataFromExcel("EmpLogin",1, 1);
	
		HomePage hp =new HomePage(driver);
		hp.getEmployerImg().click();
		hp.getEmpLoginBtn().click();
		EmplyeerLoginPage elp=new EmplyeerLoginPage(driver);
		elp.getCompEmailTxt().sendKeys(CompEmail);
		elp.getCompPasswordTxt().sendKeys(ContPass);
		elp.getCompLoginBtn().click();
		
}
}