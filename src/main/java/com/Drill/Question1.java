package com.Drill;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priya\\Desktop\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/newtours/register.php");
        driver.findElement(By.name("country"));
        
        
        
        TakesScreenshot ts = ((TakesScreenshot) driver);
        
        File temp = ts.getScreenshotAs(OutputType.FILE);
       
        File des = new File("C:\\Users\\Priya\\Desktop\\ScreenShot\\secondpic.png");
       
        FileUtils.copyFile(temp, des);

	}

}
