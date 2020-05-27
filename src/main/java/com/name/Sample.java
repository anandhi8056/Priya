package com.name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priya\\Desktop\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       
       
       
       
        driver.get("https://connect.maveric-systems.com/index.php/site/login");
        Thread.sleep(2000);
        //driver.manage().window().maximize();
        //String pageTitle = driver.getTitle();
        //System.out.println(pageTitle);
       WebElement firstName= driver.findElement(By.id("LoginForm_username"));
       firstName.sendKeys("Maveric");

	}

}
