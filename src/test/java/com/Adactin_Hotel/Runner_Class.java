package com.Adactin_Hotel;

import java.io.File;

import org.openqa.selenium.WebDriver;

import com.Base_Class.Base_Class;
import com.Configuration_Reader.File_Reader;

public class Runner_Class extends Base_Class{

	public static WebDriver driver=Base_Class.get_Driver();
	
	public static Singleton sdp=new Singleton(driver);
	
	public static void main(String[] args) throws Throwable {
		
		geturl("https://adactinhotelapp.com");
		
		String username=File_Reader.getInstanceFR().getInstanceCR().getUsername();
		inputvalues(sdp.getInstanceLog().getUser(), username);
		
		String password=File_Reader.getInstanceFR().getInstanceCR().getPassword();
		inputvalues(sdp.getInstanceLog().getPass(), password);
		
		clickonelement(sdp.getInstanceLog().getButton());
		waitForSeconds(8);
		
		
		dropdown(sdp.getInstanceShotel().getLocation(), "London");
		dropdown(sdp.getInstanceShotel().getHotels(), "Hotel Hervey");
		dropdown(sdp.getInstanceShotel().getRoomtype(), "Super Deluxe");
		dropdown(sdp.getInstanceShotel().getroomnos(), "3");
		sdp.getInstanceShotel().getDate1().clear();
		inputvalues(sdp.getInstanceShotel().getDate1(), "21/12/2022");
		sdp.getInstanceShotel().getDate2().clear();
		inputvalues(sdp.getInstanceShotel().getDate2(), "23/12/2022");
		dropdown(sdp.getInstanceShotel().getAdultroom(), "3");
		dropdown(sdp.getInstanceShotel().getchildroom(), "1");
		clickonelement(sdp.getInstanceShotel().getSubmit());
		sleep(4000);
		
		clickonelement(sdp.getInstanceSelhotel().getRadbutton());
		clickonelement(sdp.getInstanceSelhotel().getConbutton());
		
		String firstname=File_Reader.getInstanceFR().getInstanceCR().getFirstname();
		inputvalues(sdp.getInstanceBhotel().getFname(), firstname);
		
		String lastname=File_Reader.getInstanceFR().getInstanceCR().getLastname();
		inputvalues(sdp.getInstanceBhotel().getLname(), lastname);
		
		String baddress=File_Reader.getInstanceFR().getInstanceCR().getBaddress();
		inputvalues(sdp.getInstanceBhotel().getAddress(), baddress);
		
		String ccnum=File_Reader.getInstanceFR().getInstanceCR().getCcnum();
		inputvalues(sdp.getInstanceBhotel().getCcnum(), ccnum);
		
		dropdown(sdp.getInstanceBhotel().getCctype(), "Master Card");
		dropdown(sdp.getInstanceBhotel().getCcexpmon(), "mar");
		dropdown(sdp.getInstanceBhotel().getCcexpyr(), "2022");
		
		String cvv=File_Reader.getInstanceFR().getInstanceCR().getCvv();
		inputvalues(sdp.getInstanceBhotel().getCccvv(), cvv);
		
		clickonelement(sdp.getInstanceBhotel().getBooknow());
		sleep(3000);
		
		clickonelement(sdp.getInstanceLout().getOut());
		sleep(3000);
		screenshot("Snap1.png");
		sleep(3000);
		close();
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
