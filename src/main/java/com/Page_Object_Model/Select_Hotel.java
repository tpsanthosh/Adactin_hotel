package com.Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {

	public WebDriver driver;
	
	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement radbutton;
	
	@FindBy(xpath= "//input[@name='continue']")
	private WebElement conbutton;
	
	
	public Select_Hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getRadbutton() {
		return radbutton;
	}
	
	public WebElement getConbutton() {
		return conbutton;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

