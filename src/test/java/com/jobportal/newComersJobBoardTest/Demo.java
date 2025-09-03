package com.jobportal.newComersJobBoardTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class Demo {
@Test
public void demo_Test(){
	System.out.println("hello");
	WebDriver driver =new FirefoxDriver();
	driver.get("https://newcomersjobboard.com/");
	driver.findElement(By.xpath("//span[@data-onhovertext='Job Seekers']")).click();
	driver.findElement(By.xpath("//a[@href='/seeker/signup']/ancestor::ul[@class='user-menu applicants-menu active']/descendant::a[.='Sign up']")).click();
    driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("hi");
    driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("bye");
   // driver.findElement(By.xpath("//button[.='Accept']")).click();
	WebElement Resume = driver.findElement(By.xpath("//input[@id='resume']/ancestor::div[@class='dropzone']"));
	Resume.click();
	
	Resume.sendKeys("/Users/yourusername/Desktop/resume.pdf");
	//sendKeys("./Users/mac2/Desktop/Resume.pdf");
	 
}
}
