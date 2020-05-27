package com.name;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCallPom {
	
	   public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priya\\Desktop\\selenium\\chromedriver.exe");
        
	       driver = new ChromeDriver(); 
	        
	        driver.get("https://www.facebook.com/");
	        
	        driver.manage().window().maximize();
	        
	        FacebookPOM p=new FacebookPOM();
	        
	        p.getFirstName().sendKeys("Maveric");
	        
	        p.getLastName().sendKeys("Systems");        
	        
	        
	    
	        
	    }

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		ToCallPom.driver = driver;
	}

	 

	
	}


