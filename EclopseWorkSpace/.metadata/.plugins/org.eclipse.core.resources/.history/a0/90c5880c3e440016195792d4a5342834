package javaJarTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Chrome
	public class Chrome {

		public static void main(String[] args) throws InterruptedException {
	        
	    	System.setProperty("webdriver.chrome.driver", "C:\\Daniel Yuan\\work\\Selenium-2016\\ForJava\\tools\\2.53\\chromedriver.exe");
	    	
	    	WebDriver driver = new ChromeDriver();  

	        driver.get("http://www.baidu.com/"); 
	        driver.manage().window().maximize();
	        WebElement txtbox = driver.findElement(By.name("wd")); 
	        txtbox.sendKeys("Glen");
	        WebElement btn = driver.findElement(By.id("su"));
	        btn.click();
	        
	        System.out.println("Test is done!");
	        Thread.sleep(5000);
	    
	        driver.close();

	    }

	}