package com.Jobportal.newComersJobBoard.generic.objectrepositoryutility;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import com.Jobportal.newComersJobBoard.generic.webdriverutility.WebDriverUtility;

public class postjobpage  extends WebDriverUtility{
	 
		WebDriver driver;
		public postjobpage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath="//a[@class='btn large full-width']")
		  private	WebElement PostJobBtn;
		
		@FindBy(xpath="//button[@data-plan-slug='free']")
		  private	WebElement SelectFreeBtn;
		
		@FindBy(xpath="(//div[@class='checkbox'])[1]")
		  private	WebElement NewEmpRadio;
		
		@FindBy(xpath="(//div[@class='checkbox'])[2]")
		  private	WebElement OldEmpRadio;
		
		@FindBy(xpath="//button[.='Next']")
		  private	WebElement NextBtn;
		
		@FindBy(xpath="//input[@id='employer-account-name']/ancestor::p[@class='row']")
		  private	WebElement CompNamTxt;
			
		@FindBy(xpath="//input[@name='company_tagline']")
		  private	WebElement CompTagTxt;
		
		@FindBy(xpath="//input[@placeholder='Jane Doe']")
		  private	WebElement CompContTxt;
		
		@FindBy(xpath="//input[@name='company_email']")
		  private	WebElement CompEmailTxt;
		
		@FindBy(xpath="//input[@name='company_password']")
		  private	WebElement CompPassTxt;
		
		@FindBy(xpath="//input[@name='company_password_repeat']")
		  private	WebElement CompConPassTxt;
		
		@FindBy(xpath="//button[.='Import from url']")
		  private	WebElement ImpUrl;
		//button[@class='btn medium outline']
		@FindBy(xpath="//input[@id='import-url']")
		  private	WebElement ImpUrlTxt;
		
		@FindBy(xpath="//button[@class='btn x-large full-width import-btn']")
		  private	WebElement ImpJobBtn;

		//button[.='Import from url']/ancestor::div[@class='row']
		
		@FindBy(xpath="//input[@id='job-title']")
		  private	WebElement JobTitleTxt;
		
		@FindBy(xpath="//input[@id='job-location']")
		  private	WebElement JobLocTxt;
         
		@FindBy(xpath="//input[@id='salary-min']")
		  private	WebElement MinSalTxt;

		@FindBy(xpath="//input[@id='salary-max']")
		  private	WebElement MaxSalTxt;
		
		@FindBy(xpath="//label[.='Salary timeframe']/ancestor::div[@class='select-wrap']")
		  private	WebElement SalTimeDrop;

		@FindBy(xpath="//select[@id='salary-currency']")
		  private	WebElement CurrencyDrop;
		
		@FindBy(xpath="//span[.='Preview listing']")
		  private	WebElement PrevListingBtn;
		
		@FindBy(xpath="//button[@class='btn next-btn']")
		  private	WebElement ConListingBtn;
		
		@FindBy(xpath="//button[@data-plan-slug='free']")
		  private	WebElement FreeBtn;
		
		
		public WebElement getPostJobBtn() {
			return PostJobBtn;
		}

		public WebElement getSelectFreeBtn() {
			return SelectFreeBtn;
		}

		public WebElement getImpUrl() {
			return ImpUrl;
		}

		public WebElement getImpJobBtn() {
			return ImpJobBtn;
		}

		public WebElement getJobTitleTxt() {
			return JobTitleTxt;
		}

		public WebElement getJobLocTxt() {
			return JobLocTxt;
		}

		public WebElement getMinSalTxt() {
			return MinSalTxt;
		}

		public WebElement getMaxSalTxt() {
			return MaxSalTxt;
		}

		public WebElement getSalTimeDrop() {
			return SalTimeDrop;
		}

		public WebElement getCurrencyDrop() {
			return CurrencyDrop;
		}

		public WebElement getPrevListingBtn() {
			return PrevListingBtn;
		}

		public WebElement getConListingBtn() {
			return ConListingBtn;
		}
		public WebElement getFreeBtn() {
			return FreeBtn;
		}
		public WebElement getNewEmpRadio() {
			return NewEmpRadio;
		}

		public WebElement getOldEmpRadio() {
			return OldEmpRadio;
		}

		public WebElement getNextBtn() {
			return NextBtn;
		}
		@FindBy(xpath="//button[.='Accept']")
		  private	WebElement AccBtn; 

		public WebElement getAccBtn() {
			return AccBtn;
		}			
	
    public void NavigateToPOst(WebDriver driver) throws Throwable
    {
    	Actions act=new Actions(driver);
    	act.scrollByAmount(0,-100);
    	JobLocTxt.sendKeys("canada");
    	Thread.sleep(3000);
    	Actions act1=new Actions(driver);
    	act1.scrollByAmount(0, 4000);
    	MinSalTxt.sendKeys("30000");
    	MaxSalTxt.sendKeys("50000");
    	Select s=new Select(SalTimeDrop);
    	s.selectByValue("annually");
    	
    	
			
    }

	public WebElement getCompNamTxt() {
		return CompNamTxt;
	}

	public WebElement getCompTagTxt() {
		return CompTagTxt;
	}

	public WebElement getCompContTxt() {
		return CompContTxt;
	}

	public WebElement getCompEmailTxt() {
		return CompEmailTxt;
	}

	public WebElement getCompPassTxt() {
		return CompPassTxt;
	}

	public WebElement getCompConPassTxt() {
		return CompConPassTxt;
	}
  public void PostToJob() {
	  
  }

  public WebElement getImpUrlTxt() {
	return ImpUrlTxt;
  }
	}

			
			
			
    	
 

   

	

	
					
