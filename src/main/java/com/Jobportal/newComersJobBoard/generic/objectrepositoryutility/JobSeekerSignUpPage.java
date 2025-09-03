

package com.Jobportal.newComersJobBoard.generic.objectrepositoryutility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Jobportal.newComersJobBoard.generic.webdriverutility.WebDriverUtility;
 
public class JobSeekerSignUpPage  extends WebDriverUtility{ 
	WebDriver driver;
	public JobSeekerSignUpPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@href='/seeker/signup']/ancestor::ul[@class='user-menu applicants-menu active']/descendant::a[.='Sign up']")
  private	WebElement SeekerSignupBtn;
	
	  @FindBy(xpath="//input[@id='firstname']")
	  private	WebElement FNTxt;

	  @FindBy(xpath="//input[@id='lastname']")
	  private	WebElement LNTxt;
     
	  @FindBy(xpath="//input[@id='resume']/ancestor::div[@class='dropzone']")
	  private	WebElement Resume;
	
	  @FindBy(xpath="//div[@id='logo-preview']")
	  private	WebElement Photo;
	    
	  @FindBy(xpath="//input[@id='full_address']")
	  private	WebElement AddTxt;

	  @FindBy(xpath="(//input[@type='text'])[7]")
	  private	WebElement TitleTxt;
	  
	  @FindBy(xpath="(//input[@type='text'])[8]")
	  private	WebElement CompanyTxt;
	  
	  @FindBy(xpath="//input[@name='is_current_role']/ancestor::div[@class='row close']")
	  private	WebElement RoleCheckBox;
	  
	  @FindBy(xpath="//input[@id='email']")
	  private	WebElement EmailTxt;
	  
	  @FindBy(xpath="//input[@id='password']")
	  private	WebElement PasswordTxt;
	 
	  @FindBy(xpath="//input[@id='passwordtwo']")
	  private	WebElement ComPassTxt;
	  
	  @FindBy(xpath="//button[@type='submit']")
	  private	WebElement CreatAccBtn;
	  
	  @FindBy(xpath="//button[.='Accept']")
	  private	WebElement AccBtn; 

	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getSeekerSignupBtn() {
		return SeekerSignupBtn;
	}


	public WebElement getFNTxt() {
		return FNTxt;
	}


	public WebElement getLNTxt() {
		return LNTxt;
	}


	public WebElement getResume() {
		return Resume;
	}


	public WebElement getPhoto() {
		return Photo;
	}


	public WebElement getAddTxt() {
		return AddTxt;
	}


	public WebElement getTitleTxt() {
		return TitleTxt;
	}


	public WebElement getCompanyTxt() {
		return CompanyTxt;
	}


	public WebElement getRoleCheckBox() {
		return RoleCheckBox;
	}


	public WebElement getEmailTxt() {
		return EmailTxt;
	}


	public WebElement getPasswordTxt() {
		return PasswordTxt;
	}


	public WebElement getComPassTxt() {
		return ComPassTxt;
	}


	public WebElement getCreatAccBtn() {
		return CreatAccBtn;
	}
	public WebElement getAccBtn() {
		return AccBtn;
	}
	public void SignToResume() throws Throwable {
        driver.manage().window().maximize();
       
        Resume.click();
        Resume.sendKeys("/Users/yourusername/Desktop/resume.pdf");
       // WebElement uploadElement = getResume();
       // String filePath = ".\\Users\\mac2\\Desktop\\Resume.pdf";
       // uploadElement.sendKeys(filePath);
       // driver.findElement(By.cssSelector("button[type='submit']")).click();
        
        
        
        
        
       
        
			}
	
}
