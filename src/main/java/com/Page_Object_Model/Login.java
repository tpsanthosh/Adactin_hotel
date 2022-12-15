package com.Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	public WebDriver driver;
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement user;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement pass;
	
	@FindBy(xpath = "//input[@name='login']")
	private WebElement button;
	
	public Login(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getUser() {
		return user;
	}
	
	public WebElement getPass() {
		return pass;
	}
	
	public WebElement getButton() {
		return button;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
