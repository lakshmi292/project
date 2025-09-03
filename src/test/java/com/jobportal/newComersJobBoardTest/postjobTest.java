package com.jobportal.newComersJobBoardTest;

import org.testng.annotations.Test;

import com.Jobportal.newComersJobBoard.generic.basetest.BaseClass;
import com.Jobportal.newComersJobBoard.generic.fileUtility.ExcelUtility;
import com.Jobportal.newComersJobBoard.generic.objectrepositoryutility.EmployersSignUpPage;
import com.Jobportal.newComersJobBoard.generic.objectrepositoryutility.HomePage;
import com.Jobportal.newComersJobBoard.generic.objectrepositoryutility.postjobpage;
import com.Jobportal.newComersJobBoard.generic.webdriverutility.JavaUtility;

public class postjobTest extends BaseClass{
	@Test
	public void postjob() throws Throwable {
		ExcelUtility exu=new ExcelUtility();
		JavaUtility ju=new JavaUtility();
		int ranInt = ju.getRandomNumber();
		HomePage hp =new HomePage(driver);
		
        hp.getAccBtn().click();
		hp.getPostjobBtn().click();
postjobpage pjp=new postjobpage(driver);
		pjp.getFreeBtn().click();
		pjp.getNewEmpRadio().click();
		pjp.getNextBtn().click();
		
		String CompName = exu.getDataFromExcel("postjob", 1, 0)+ranInt;
		String Comptag= exu.getDataFromExcel("postjob", 1, 1)+ranInt;
		String ContName = exu.getDataFromExcel("postjob",1, 2)+ranInt;
		String CompEmail = exu.getDataFromExcel("postjob", 1, 3)+ranInt+"@gmail.com";
		String ComPass = exu.getDataFromExcel("postjob", 1, 4);
		String ComCfpass = exu.getDataFromExcel("postjob", 1, 5);
		String ImpURI = exu.getDataFromExcel("postjob", 1, 6);
		String Loc = exu.getDataFromExcel("postjob", 1, 7);
		//String Minsal = exu.getDataFromExcel("postjob", 1, 8);
		//String Maxsal = exu.getDataFromExcel("postjob", 1, 9);
		
		

	
	pjp.getCompNamTxt().sendKeys(CompName);
	pjp.getCompTagTxt().sendKeys(Comptag);
	pjp.getCompContTxt().sendKeys(ContName);
	pjp.getCompEmailTxt().sendKeys(CompEmail);
	pjp.getCompPassTxt().sendKeys( ComPass );
	pjp.getCompConPassTxt().sendKeys(ComCfpass);
	pjp.getNextBtn().click();
		
		
		//EmployersSignUpPage ep=new EmployersSignUpPage(driver);
		//ep.getCompNameTxt().sendKeys(CompName);
		//ep.getComptagTxt().sendKeys(Comptag);
		//ep.getContNameTxt().sendKeys(Comptag);
		//ep.getCompEmailTxt().sendKeys(CompEmail);
		//ep.getCompPasswordTxt().sendKeys(ComPass);
		//ep.getCompCFPasswordTxt().sendKeys(ComCfpass);

		
	
	//Thread.sleep(2000);
	//pp.getImpUrl().sendKeys(ImpURI );
	//pp.getJobLocTxt().sendKeys(Loc);
	//pp.getMinSalTxt().sendKeys(Minsal );
	//pp.getMaxSalTxt().sendKeys( Maxsal);
	//pp.getPrevListingBtn().click();
	
	
		
}
}