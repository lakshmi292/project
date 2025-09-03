

package com.Jobportal.newComersJobBoard.generic.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Jobportal.newComersJobBoard.generic.webdriverutility.WebDriverUtility;
 
public class JobSeekerLoginPage  extends WebDriverUtility{ 
	WebDriver driver;
	public JobSeekerLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@href='/seeker/login']/ancestor::ul[@class='user-menu applicants-menu active']/descendant::a[.='Log in']")
  private	WebElement SeekerLoginBtn;
	
	 @FindBy(xpath="//label[.='Email']/ancestor::p[@class='row']")
	  private	WebElement EmailTxt;
	  
	  @FindBy(xpath="//input[@id='password']")
	  private	WebElement PasswordTxt;
	  
	  @FindBy(xpath="//button[@type='submit']")
	  private	WebElement LoginBtn;

	  @FindBy(xpath="	//a[.='Saved jobs']")
	  private	WebElement SaveBtn; 
	
	  @FindBy(xpath="//button[.='Accept']")
	  private	WebElement AccBtn; 
	  
	  @FindBy(xpath="//a[.='View job']")
	  private	WebElement ViewBtn; 
	
	  @FindBy(xpath="(//button[.='Share this job'])[1]")
	  private	WebElement ShareBtn; 
	  
	  
	  @FindBy(xpath="//span[@data-onhovertext='Job Seekers']")
	  private	WebElement seekerimg; 
	  
	  @FindBy(xpath="//a[.='Profile']")
	  private	WebElement ProfileImg; 
	  
	  @FindBy(xpath="//a[.='Billing']")
	  private	WebElement BillingBtn; 
	
	  @FindBy(xpath="//input[@id='company-address']")
	  private	WebElement AddTxt; 
	
	  @FindBy(xpath="//input[@id='company-city']")
	  private	WebElement CityTxt; 
	
	  @FindBy(xpath="//input[@id='company-state']")
	  private	WebElement StateTxt; 
	
	  @FindBy(xpath="//input[@id='company-zip']")
	  private	WebElement ZipTxt; 
	
	  @FindBy(xpath="//select[@id='company-country']")
	  private	WebElement CountryDrop; 
	  
	  @FindBy(xpath="//option[@value='AU']")
	  private	WebElement CountrySelect; 
	
	  @FindBy(xpath="//span[.='Save']")
	  private	WebElement SaveBillingBtn; 
	
	
	public WebElement getSeekerLoginBtn() {
		return SeekerLoginBtn;
	}


	public WebElement getEmailTxt() {
		return EmailTxt;
	}


	public WebElement getPasswordTxt() {
		return PasswordTxt;
	}


	public WebElement getLoginBtn() {
		return LoginBtn;
	}

	public WebElement getAccBtn() {
		return AccBtn;
	}


	public WebElement getSaveBtn() {
		return SaveBtn;
	}
	public WebElement getViewBtn() {
		return ViewBtn;
	}

	public WebElement getShareBtn() {
		return ShareBtn;
	}


	public WebElement getSeekerimg() {
		return seekerimg;
	}


	public WebElement getProfileImg() {
		return ProfileImg;
	}


	public WebElement getBillingBtn() {
		return BillingBtn;
	}
	
	public WebElement getAddTxt() {
		return AddTxt;
	}


	public WebElement getCityTxt() {
		return CityTxt;
	}


	public WebElement getStateTxt() {
		return StateTxt;
	}


	public WebElement getZipTxt() {
		return ZipTxt;
	}


	public WebElement getCountryDrop() {
		return CountryDrop;
	}


	public WebElement getCountrySelect() {
		return CountrySelect;
	}


	public WebElement getSaveBillingBtn() {
		return SaveBillingBtn;
	}
	public void loginToapp(String email, String password) {
		driver.manage().window().maximize();
        Actions act=new  Actions(driver);
        act.moveToElement(EmailTxt).sendKeys(email);
        PasswordTxt.sendKeys(password);
        LoginBtn.click();
        AccBtn.click();
        act.moveToElement(SaveBtn).click();
        act.moveToElement(seekerimg).click();
}
	public void BillingToApp()
	{
		BillingBtn.click();
		AddTxt.sendKeys("canada");
		CityTxt.sendKeys("canada");
		StateTxt.sendKeys("canada");
		ZipTxt.sendKeys("canada");
		Select s=new Select(CountryDrop);
		s.selectByValue("AU");
		SaveBillingBtn.click();
	}
}