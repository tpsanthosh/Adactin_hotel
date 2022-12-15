package com.Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {

	public WebDriver driver;
	
	@FindBy(xpath="//input[@name='search_hotel']")
	private WebElement out;
	
	public Logout(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getOut() {
		return out;
	}
	
	
	
	
	
	
	
	
}
