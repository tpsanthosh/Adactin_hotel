package com.Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_hotel {

	public WebDriver driver;
	
	@FindBy (xpath = "//select[@name='location']")
	private WebElement location;
	
	@FindBy(xpath = "//select[@name='hotels']")
	private WebElement hotels;
	
	@FindBy(xpath ="//select[@name='room_type']")
	private WebElement roomtype;
	
	@FindBy (xpath ="//select[@name='room_nos']")
	private WebElement roomnos;
	
	@FindBy (xpath = "(//input[@type='text'])[2]")
	private WebElement date1;
	
	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement date2;
	
	@FindBy(xpath= "//select[@name='adult_room']")
	private WebElement adult;
	
	@FindBy(xpath = "//select[@name='child_room']")
	private WebElement child;
	
	@FindBy(xpath="//input[@name='Submit']")
	private WebElement submit;
	
	public Search_hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getLocation() {
		return location;
	}
	
	public WebElement getHotels() {
		return hotels;
	}
	
	public WebElement getRoomtype() {
		return roomtype;
	}
	
	public WebElement getroomnos() {
		return roomnos;
	}
	
	public WebElement getDate1() {
		return date1;
	}
	
	public WebElement getDate2() {
		return date2;
	}
	
	public WebElement getAdultroom() {
		return adult;
	}
	
	public WebElement getchildroom() {
		return child;
	}
	
	public WebElement getSubmit() {
		return submit;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
