package com.Jobportal.newComersJobBoard.generic.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
      
	
	@FindBy(xpath="//span[@data-onhovertext='Job Seekers']")
	private WebElement JobseekerImg;
   
	@FindBy(xpath="//a[@href='/seeker/login']/ancestor::ul[@class='user-menu applicants-menu active']/descendant::a[.='Log in']")
	  private	WebElement SeekerLoginBtn; 
	
	@FindBy(xpath="//a[@href='/seeker/signup']/ancestor::ul[@class='user-menu applicants-menu active']/descendant::a[.='Sign up']")
	  private	WebElement SeekerSignupBtn;

	@FindBy(xpath="	//span[@data-onhovertext='Employers']")
	private WebElement EmployerImg;
   
	@FindBy(xpath="//a[@href='/employer/login']/ancestor::ul[@class='user-menu employers-menu active']/descendant::a[.='Log in']")
	  private	WebElement EmpLoginBtn;
    
	@FindBy(xpath="(//a[@href='/employer/signup'])[1]")
	  private	WebElement EmployerSignupBtn;

	@FindBy(xpath="//a[@class='btn medium']/ancestor::li[@class='post-button low-margin']")
	private WebElement PostjobBtn;

	@FindBy(xpath="//a[@class='btn medium']/ancestor::p[@class='action-btns']")
	private WebElement PostjobBtn1;

	@FindBy(xpath="//a[@href='/employer/signup']/ancestor::p[@class='action-btns']/descendant::a[@class='btn medium outline']")
	private WebElement EmpSignUpBtn;
	
	@FindBy(xpath="//a[@href='/seeker/signup']/ancestor::p[@class='action-btns']/descendant::a[@class='btn medium outline']")
	private WebElement SeekerResumeBtn;

	@FindBy(xpath="	//a[@class='btn medium outline goto-jobs']")
	private WebElement SeekerJobBtn;

	@FindBy(xpath="	(//input[@class='search'])[1]")
	private WebElement KeywordTxt;
    
	@FindBy(xpath="//div[@class='location-filter subcomponent filter-box']")
	private WebElement LocationTxt;

	@FindBy(xpath="//p[.='Job Category']/ancestor::div[@class='component']")
	private WebElement JobCatDropdown;
	
	@FindBy(xpath="//p[.='Job Type']/ancestor::div[@class='component']")
	private WebElement JobTypDropdown;
    
	@FindBy(xpath="	//input[@class='salary min']")
	private WebElement SalaryMinDrop;
	
	@FindBy(xpath="	//select[@id='salary_timeframe']")
	private WebElement SelectTimeDrop;

	@FindBy(xpath="//button[.='Accept']")
	  private	WebElement AccBtn; 
	
	public WebElement getJobseekerImg() {
		return JobseekerImg;
	}
	public WebElement getEmployerImg() {
		return EmployerImg;
	}
	public WebElement getPostjobBtn() {
		return PostjobBtn;
	}
	public WebElement getPostjobBtn1() {
		return PostjobBtn1;
	}
	public WebElement getEmpSignUpBtn() {
		return EmpSignUpBtn;
	}
	public WebElement getSeekerResumeBtn() {
		return SeekerResumeBtn;
	}
	public WebElement getSeekerJobBtn() {
		return SeekerJobBtn;
	}
	public WebElement getKeywordTxt() {
		return KeywordTxt;
	}
	public WebElement getLocationTxt() {
		return LocationTxt;
	}
	public WebElement getJobCatDropdown() {
		return JobCatDropdown;
	}
	public WebElement getJobTypDropdown() {
		return JobTypDropdown;
	}
	public WebElement getSalaryMinDrop() {
		return SalaryMinDrop;
	}

	public WebElement getSelectTimeDrop() {
		return SelectTimeDrop;
	}
	public WebElement getSeekerLoginBtn() {
		return SeekerLoginBtn;
	}
	public WebElement getSeekerSignupBtn() {
		return SeekerSignupBtn;
	}
	public WebElement getEmpLoginBtn() {
		return EmpLoginBtn;
	}
	public WebElement getEmployerSignupBtn() {
		return EmployerSignupBtn;
	}

public void navigtateToJobseekerpage()
{
	Actions act=new Actions(driver);
	act.moveToElement(JobseekerImg).click();
	SeekerSignupBtn.click();
	SeekerLoginBtn.click();
}
public void navigateToEmployeerpage()
{
	Actions act=new Actions(driver);
	act.moveToElement(EmployerImg).click();
	EmployerSignupBtn.click();
	EmpLoginBtn.click();
}
public WebDriver getDriver() {
	return driver;
}
public WebElement getAccBtn() {
	return AccBtn;
}
	}