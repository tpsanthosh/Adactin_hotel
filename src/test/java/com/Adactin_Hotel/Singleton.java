package com.Adactin_Hotel;

import org.openqa.selenium.WebDriver;

import com.Page_Object_Model.Book_hotel;
import com.Page_Object_Model.Login;
import com.Page_Object_Model.Logout;
import com.Page_Object_Model.Search_hotel;
import com.Page_Object_Model.Select_Hotel;

public class Singleton {

	public WebDriver driver;
	
	private Login log;
	private Search_hotel serhotel;
	private Select_Hotel selhotel;
	private Book_hotel bhotel;
	private Logout lout;
	
	public Singleton(WebDriver driver2) {
		this.driver=driver2;
	}
	
	public Login getInstanceLog() {
		log=new Login(driver);
		return log;
	}
	
	public Search_hotel getInstanceShotel() {
		serhotel=new Search_hotel(driver);
		return serhotel;
	}
	
	public Select_Hotel getInstanceSelhotel() {
		selhotel=new Select_Hotel(driver); 
		return selhotel;
	}
	
	public Book_hotel getInstanceBhotel() {
		bhotel=new Book_hotel(driver);
		return bhotel;
	}
	
	public Logout getInstanceLout() {
		lout= new Logout(driver);
		return lout;
	}
	
	
	
	
	
	
	
	
}
