package com.Jobportal.newComersJobBoard.generic.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Jobportal.newComersJobBoard.generic.webdriverutility.WebDriverUtility;

public class SearchPage extends WebDriverUtility{

		WebDriver driver;
		public SearchPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath="(//input[@name='search'])[1]")
	  private	WebElement KeyTxt;
		
		@FindBy(xpath="//span[.='Filter by location...']")
		  private	WebElement locTxt;
		@FindBy(xpath="//p[@class='active']/ancestor::div[@class='location-filter subcomponent filter-box']")
		  private	WebElement CountryTxt;
		

		@FindBy(xpath="//span[.='All categories']")
		  private	WebElement JobCatDrop;
		//div[@class='input']/descendant::span[.='All categories']
		@FindBy(xpath="//div[@class='input']/descendant::span[.='All jobs']")
		  private	WebElement JobTypeDrop;
		
		@FindBy(xpath="//input[@name='salary_min']")
		  private	WebElement MinsalTxt;
		
		@FindBy(xpath="//input[@name='salary_max']")
		  private	WebElement MaxsalTxt;
		
		@FindBy(xpath="//label[@for='salary_timeframe']")
		  private	WebElement TimeDrop;
		
		@FindBy(xpath="//div[@class='post']")
		  private	WebElement jobs;
		

		public WebElement getKeyTxt() {
			return KeyTxt;
		}

		public WebElement getLocTxt() {
			return locTxt;
		}

		public WebElement getCountryTxt() {
			return CountryTxt;
		}

		public WebElement getJobCatDrop() {
			return JobCatDrop;
		}

		public WebElement getJobTypeDrop() {
			return JobTypeDrop;
		}

		public WebElement getMinsalTxt() {
			return MinsalTxt;
		}

		public WebElement getMaxsalTxt() {
			return MaxsalTxt;
		}

		public WebElement getTimeDrop() {
			return TimeDrop;
		}
		public void JobCatDrop(String Management ) {
			JobCatDrop.click();		
			JobCatDrop.sendKeys(Management);
			
		}
		public void searchToJob()
		{
			Actions act =new Actions(driver);
			act.moveToElement(jobs).click();
			
		}	
		public void newToApp() {
      //  locTxt.click();
       // CountryTxt.sendKeys("Canada");
			Actions act=new Actions(driver);
			act.moveToElement(JobCatDrop);
		Select s= new Select(JobCatDrop);
		s.selectByVisibleText("Management");
		Select s1=new Select(JobTypeDrop);
		s1.deselectByVisibleText("Full time");
		MinsalTxt.sendKeys("30000");
	   MaxsalTxt.sendKeys("50000");
	   Select s2=new Select(TimeDrop);
	   s2.selectByVisibleText("Hourly (3)");
			
}

		public WebElement getJobs() {
			return jobs;
		}
}