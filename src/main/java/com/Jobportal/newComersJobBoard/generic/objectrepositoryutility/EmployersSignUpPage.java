

package com.Jobportal.newComersJobBoard.generic.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Jobportal.newComersJobBoard.generic.webdriverutility.JavaUtility;
import com.Jobportal.newComersJobBoard.generic.webdriverutility.WebDriverUtility;
 
public class EmployersSignUpPage  extends WebDriverUtility{ 
	WebDriver driver;
	public EmployersSignUpPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//a[@href='/employer/signup'])[1]")
  private	WebElement EmployerSignupBtn;
	
	  @FindBy(xpath="//input[@id='company-name']")
	  private	WebElement CompNameTxt;
	
	  @FindBy(xpath="//input[@id='company-tagline']")
	  private	WebElement ComptagTxt;
	  
	  @FindBy(xpath="//input[@name='contact_name']")
	  private	WebElement ContNameTxt;
     
	  @FindBy(xpath="//input[@id='company-email']")
	  private	WebElement CompEmailTxt;
	
	  @FindBy(xpath="//input[@id='company-password']")
	  private	WebElement CompPasswordTxt;
	    
	  @FindBy(xpath="//input[@id='company-passwordtwo']")
	  private	WebElement CompCFPasswordTxt;

	  @FindBy(xpath="//button[@type='submit']")
	  private	WebElement CreateAccBtn;
	  
	
	  @FindBy(xpath="//button[.='Accept']")
	  private	WebElement AccBtn; 

		public WebElement getSeekerSignupBtn() {
			return EmployerSignupBtn;
		}


		public WebElement getCompNameTxt() {
			return CompNameTxt;
		}
		public WebElement getEmployerSignupBtn() {
			return EmployerSignupBtn;
		}


		public WebElement getComptagTxt() {
			return ComptagTxt;
		}


		public WebElement getContNameTxt() {
			return ContNameTxt;
		}


		public WebElement getCompEmailTxt() {
			return CompEmailTxt;
		}


		public WebElement getCompPasswordTxt() {
			return CompPasswordTxt;
		}


		public WebElement getCompCFPasswordTxt() {
			return CompCFPasswordTxt;
		}


		public WebElement getCreateAccBtn() {
			return CreateAccBtn;
		}

		public WebElement getAccBtn() {
			return AccBtn;
		}

		public void SignToapp(String Compname, String Comptag ,String Contname, String email,String password,String conpassword) {
	        driver.manage().window().maximize();
	        Actions act=new  Actions(driver);
	      
	        act.moveToElement(EmployerSignupBtn).click();
	        CompNameTxt.sendKeys(Compname);
	        ComptagTxt.sendKeys(Comptag);
	        act.scrollByAmount(0, 800);
	        ContNameTxt.sendKeys(Contname);
	        CompEmailTxt.sendKeys(email);
	        CompPasswordTxt.sendKeys(password);
	        CompCFPasswordTxt.sendKeys(conpassword);
	       	CreateAccBtn.click();
	       	AccBtn.click();
	}


		





	
}