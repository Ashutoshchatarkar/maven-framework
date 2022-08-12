package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Indexpage {

	WebDriver ldriver;
	
	
	 public Indexpage(WebDriver rdriver) {
		 
		 ldriver=rdriver;
		 
		PageFactory.initElements(rdriver, this);
	}
	  
	@FindBy(xpath = "//a[@class='login'] ")
	private WebElement signinbtn;
	
	public void Clickonsignin() {
		
		signinbtn.click();
		
	}
	
	
	
	
	
}
