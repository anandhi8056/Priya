package com.name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priya\\Desktop\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       
       
       
       
        driver.get("https://demoqa.com/droppable/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        WebElement toDrag = driver.findElement(By.id("draggable"));
        System.out.println(toDrag.isEnabled());
       WebElement toDrop = driver.findElement(By.id("droppable"));
       System.out.println(toDrop.isEnabled());
       Actions ac= new Actions(driver);
       ac.dragAndDrop(toDrag, toDrop).build().perform();
       
       // movetoElementsTry();
      /* 
       WebElement moveToElements = driver.findElement(By.id("doubleClickBtn"));
       Actions act_try=new Actions(driver);
       act_try.moveToElement(moveToElements).build().perform();
       Thread.sleep(5000);
       */
    
       // movetoElementsTry();
       
       /*
        WebElement doubleClickEle = driver.findElement(By.id("doubleClickBtn"));
       Actions act_try=new Actions(driver);
       act_try.doubleClick(doubleClickEle).build().perform();
       Thread.sleep(5000);
       */
    
       // movetoElementsTry();
       /*
        WebElement rightClickEle = driver.findElement(By.id("rightClickBtn"));
       Actions act_try=new Actions(driver);
       act_try.contextClick(rightClickEle).build().perform();
       Thread.sleep(5000);
       */
	}

}
