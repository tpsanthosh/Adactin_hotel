package com.Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_hotel {

	public WebDriver driver;
	
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement fname;
	
	@FindBy(xpath="//input[@name='last_name']")
	private WebElement lname;
	
	@FindBy(xpath="//textarea[@name='address']")
	private WebElement address;
	
	@FindBy (xpath="//input[@name='cc_num']")
	private WebElement ccnum;
	
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement cctype;
	
	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement ccmon;
	
	@FindBy(xpath="//select[@name='cc_exp_year']")
	private WebElement ccyear;
	
	@FindBy(xpath="//input[@name='cc_cvv']")
	private WebElement cc_cvv;
	
	@FindBy(xpath="//input[@name='book_now']")
	private WebElement booknow;
	
	
	public Book_hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		}
	
	public WebElement getFname() {
		return fname;
	}
	
	public WebElement getLname() {
		return lname;
	}
	
	public WebElement getAddress() {
		return address;
	}
	
	public WebElement getCcnum() {
		return ccnum;
	}
	
	public WebElement getCctype() {
		return cctype;
	}
	
	public WebElement getCcexpmon() {
		return ccmon;
	}
	
	public WebElement getCcexpyr() {
		return ccyear;
	}
	
	public WebElement getCccvv() {
		return cc_cvv;
	}
	
	public WebElement getBooknow() {
		return booknow;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
