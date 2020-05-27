package com.name;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priya\\Desktop\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       driver.get("https://demoqa.com/automation-practice-table/");
        driver.manage().window().maximize();
       java.util.List<WebElement> colOne = driver.findElements(By.xpath("//table[@class='tsc_table_s13']//tbody//tr//td[1]"));
        
        for (WebElement tdata : colOne) 
        
        {
        
            System.out.println(tdata.getText());
           
     }
        
        driver.quit();
        Thread.sleep(2000);

	}

}
