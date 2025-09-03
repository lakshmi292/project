

package com.Jobportal.newComersJobBoard.generic.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Jobportal.newComersJobBoard.generic.webdriverutility.WebDriverUtility;
 
public class EmplyeerLoginPage  extends WebDriverUtility{ 
	WebDriver driver;
	public EmplyeerLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@href='/employer/login']/ancestor::ul[@class='user-menu employers-menu active']/descendant::a[.='Log in']")
  private	WebElement EmpLoginBtn;
	
	 @FindBy(xpath="//input[@id='company-email']")
	  private	WebElement CompEmailTxt;
	  
	  @FindBy(xpath="//input[@id='company-password']")
	  private	WebElement CompPasswordTxt;
	  
	  @FindBy(xpath="//button[@type='submit']")
	  private	WebElement CompLoginBtn;
	  
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getEmpLoginBtn() {
		return EmpLoginBtn;
	}
	public WebElement getCompEmailTxt() {
		return CompEmailTxt;
	}
	public WebElement getCompPasswordTxt() {
		return CompPasswordTxt;
	}
	public WebElement getCompLoginBtn() {
		return CompLoginBtn;
	}


public void loginToapp(String email, String password) {
    driver.manage().window().maximize();
   Actions act=new  Actions(driver);
   act.moveToElement(CompEmailTxt).sendKeys("shadow@gmail.com");
   CompPasswordTxt.sendKeys("Shadow@123");
    CompLoginBtn.click();


}

}
