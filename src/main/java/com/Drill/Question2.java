package com.Drill;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priya\\Desktop\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://wordpress.com/?aff=58022&cid=8348279");
        
     
      WebElement findproElement = driver.findElement(By.xpath("//*[@id=\"lpc-header-nav-hp-jan-2020\"]/div/div/div[1]/header/nav/ul[1]/li[2]/button"));
      
      findproElement.click();
        Thread.sleep(5000);
        List<WebElement> findLinkElements = driver.findElements(By.tagName("a"));
        System.out.println(findLinkElements.size());
        for(WebElement item: findLinkElements) {
            System.out.println(item.getAttribute("href"));
        }
        List<WebElement> findimgElements = driver.findElements(By.tagName("img"));
        System.out.println(findimgElements.size());
        for(WebElement item: findimgElements) {
            System.out.println(item.getAttribute("src"));
            
          
           
        }
        /*
        WebElement findbloElement = driver.findElement(By.xpath("//a[contains(text(),'Blogs')]"));
        findbloElement.click();
        Thread.sleep(5000);
        List<WebElement> findblogLinkElements = driver.findElements(By.tagName("a"));
        System.out.println(findblogLinkElements.size());
        for(WebElement item: findblogLinkElements) {
            System.out.println(item.getAttribute("href"));
        }
        List<WebElement> findblogimgElements = driver.findElements(By.tagName("img"));
        System.out.println(findblogimgElements.size());
        for(WebElement item: findblogimgElements) {
            System.out.println(item.getAttribute("src"));
                		
        }
        */
        
        
        WebElement findwebElement = driver.findElement(By.xpath("//a[contains(text(),'Websites')]"));
        findwebElement.click();
        Thread.sleep(5000);
        List<WebElement> findwebLinkElements = driver.findElements(By.tagName("a"));
        System.out.println(findwebLinkElements.size());
        for(WebElement item: findwebLinkElements) {
            System.out.println(item.getAttribute("href"));
        }
        List<WebElement> findwebimgElements = driver.findElements(By.tagName("img"));
        System.out.println(findwebimgElements.size());
        for(WebElement item: findwebimgElements) {
            System.out.println(item.getAttribute("src"));
        }
        
        

        WebElement finddomainElement = driver.findElement(By.xpath("//a[contains(text(),'Domains')]"));
        finddomainElement.click();
        Thread.sleep(5000);
        List<WebElement> finddomainLinkElements = driver.findElements(By.tagName("a"));
        System.out.println(finddomainLinkElements.size());
        for(WebElement item: finddomainLinkElements) {
            System.out.println(item.getAttribute("href"));
        }
        
        List<WebElement> finddomainimgElements = driver.findElements(By.tagName("img"));
        System.out.println(finddomainimgElements.size());
        for(WebElement item: finddomainimgElements) {
            System.out.println(item.getAttribute("src"));
        }
        
        WebElement findecomElement = driver.findElement(By.xpath("//a[contains(text(),'eCommerce')]"));
        findecomElement.click();
        Thread.sleep(5000);
        List<WebElement> findecomLinkElements = driver.findElements(By.tagName("a"));
        System.out.println(findecomLinkElements.size());
        for(WebElement item: findecomLinkElements) {
            System.out.println(item.getAttribute("href"));
        }
         
        List<WebElement> findecomimgElements = driver.findElements(By.tagName("img"));
        System.out.println(findecomimgElements.size());
        for(WebElement item: findecomimgElements) {
            System.out.println(item.getAttribute("src"));
        }
        
        WebElement findselfElement = driver.findElement(By.xpath("//a[contains(text(),'Self')]"));
        findselfElement.click();
        Thread.sleep(5000);
        List<WebElement> findselfLinkElements = driver.findElements(By.tagName("a"));
        System.out.println(findselfLinkElements.size());
        
        for(WebElement item: findselfLinkElements) {
            System.out.println(item.getAttribute("href"));
        }
        List<WebElement> findselfimgElements = driver.findElements(By.tagName("img"));
        System.out.println(findselfimgElements.size());
        for(WebElement item: findselfimgElements) {
            System.out.println(item.getAttribute("src"));
        }
        driver.quit();
	}

}
