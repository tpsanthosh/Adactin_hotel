package com.Configuration_Reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config_Reader {

	public static Properties p;
	
	public Config_Reader() throws IOException {
		
		File f= new File(
				"C:\\Users\\Santhosh kumar\\eclipse-workspace\\Adactin_Hotel\\src\\main\\java\\com\\Config_Properties\\Configuration.properties");
		FileInputStream fis= new FileInputStream(f);
		p= new Properties();
		p.load(fis);
	}
	
	public String getUsername() {
		
		String user= p.getProperty("username");
		return user;
	}
	
	public String getPassword() {
		
		String pass= p.getProperty("password");
		return pass;
	}
	
	public String getFirstname() {
		
		String fname=p.getProperty("firstname");
		return fname;
	}
	
	public String getLastname() {
		
		String lname=p.getProperty("lastname");
		return lname;
	}
	
	public String getBaddress() {
		
		String badd=p.getProperty("baddress");
		return badd;
	}
	
	public String getCcnum() {
		
		String ccno=p.getProperty("ccnum");
		return ccno;
	}
	
	public String getCvv() {
		
		String cvv=p.getProperty("cvv");
		return cvv;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
