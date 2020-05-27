package com.Drill;

import java.net.HttpURLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.URL;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priya\\Desktop\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://maveric-systems.com/");
        driver.manage().window().maximize();
        
        List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println("Total links are "+links.size());
		
		for(int i=0;i<links.size();i++)
		{
			
			WebElement ele= links.get(i);
			
			String url=ele.getAttribute("href");
			
			verifyLinkActive(url);
			
		}
		
	}

	private static void verifyLinkActive(String url) {
		// TODO Auto-generated method stub
		
		try 
        {
           
		Object linkUrl;
		
		URL url() = new URL(linkUrl);
           
           HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
           
           httpURLConnect.setConnectTimeout(3000);
           
           httpURLConnect.connect();
           
           if(httpURLConnect.getResponseCode()==200)
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
            }
          if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
            }
          
          WebDriver driver;
		driver.quit();
        } catch (Exception e) {
           
        }
		
    } 
		
	}

	


