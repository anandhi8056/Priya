package com.name;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	//static JavascriptExecutor driver = null;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priya\\Desktop\\selenium\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
        driver.manage().window().maximize();
        alertSendMsg(driver);
	}

	private static void alertSendMsg(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//JavascriptExecutor driver = null;
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(5000);
			//WebElement sendAlertEle = driver.findElement(By.id("promptOption"));
		WebElement sendAlertEle = driver.findElement(By.xpath("//button[@onclick='if (!window.__cfRLUnblockHandlers) return false; promptConfirm()']"));
			sendAlertEle.click();
			
		 driver.switchTo().alert().sendKeys("Hi");
		 Thread.sleep(5000);
	 driver.switchTo().alert().accept();
	driver.quit();
			
		
		
	}

	}


