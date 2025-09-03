package com.jobportal.newComersJobBoardTest;

import org.testng.annotations.Test;

import com.Jobportal.newComersJobBoard.generic.basetest.BaseClass;
import com.Jobportal.newComersJobBoard.generic.fileUtility.ExcelUtility;
import com.Jobportal.newComersJobBoard.generic.objectrepositoryutility.HomePage;
import com.Jobportal.newComersJobBoard.generic.objectrepositoryutility.JobSeekerLoginPage;
import com.Jobportal.newComersJobBoard.generic.objectrepositoryutility.SearchPage;
import com.Jobportal.newComersJobBoard.generic.webdriverutility.JavaUtility;

public class jobsearchTest extends BaseClass{
	@Test
	public void login() throws Throwable {
		ExcelUtility exu=new ExcelUtility();
		JavaUtility ju=new JavaUtility();
		int ranInt = ju.getRandomNumber();
		
		HomePage hp =new HomePage(driver);
	    hp.getJobseekerImg().click();
	    hp.getSeekerLoginBtn().click();
	    
	   
		String SeekerEmail = exu.getDataFromExcel("seekerlogin", 2, 0);
		String SeekerPass= exu.getDataFromExcel("seekerlogin",2, 1);    
	    JobSeekerLoginPage jlp=new JobSeekerLoginPage(driver);
	    jlp.loginToapp(SeekerEmail, SeekerPass);

		
		String keyword = exu.getDataFromExcel("search", 1, 0);
		String loc = exu.getDataFromExcel("search", 1, 1);
		String jobcat = exu.getDataFromExcel("search", 1, 1);
		String jobtype = exu.getDataFromExcel("search", 1, 1);
		//String min = exu.getDataFromExcel("search", 1, 2)+ranInt;
		//String max = exu.getDataFromExcel("search", 1, 3)+ranInt;

	hp.getKeywordTxt().sendKeys(keyword);
	
   SearchPage sp =new SearchPage(driver);
	Thread.sleep(5000);
   sp.getJobs().click();
  
//   sp.LocToCountry(loc);
  
   
   
   
}
}