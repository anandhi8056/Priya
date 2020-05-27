package com.name;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priya\\Desktop\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        
        //driver.get("https://demoqa.com/automation-practice-table/");
       
        driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
        driver.manage().window().maximize();
       
        //TakeScreenshot
       
        TakesScreenshot ts = ((TakesScreenshot) driver);
       
        File temp = ts.getScreenshotAs(OutputType.FILE);
       
        File des = new File("C:\\Users\\Priya\\Desktop\\ScreenShot\\firstpic.png");
       
        FileUtils.copyFile(temp, des);

	}

}
