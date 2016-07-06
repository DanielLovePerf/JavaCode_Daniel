package javaJarTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

//Firefox and IE
	public class SeleTest {

		public static void main(String[] args) {
	        
			//this settings for IE only
	    	DesiredCapabilities dc = DesiredCapabilities.internetExplorer();
	    	dc.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
	    	dc.setCapability("ignoreProtectedModeSettings", true); //IE默认启动保护模式，要么手动在浏览器的设置中关闭保护模式，要么在代码中加上这一句，即可
	    	System.setProperty("webdriver.ie.driver", "C:\\Daniel Yuan\\work\\Selenium-2016\\ForJava\\tools\\2.53\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
	    	
	    	//如果浏览器没有默认安装在C盘，需要制定其路径
	        //System.setProperty("webdriver.firefox.bin", "D:/Program Files/Mozilla firefox/firefox.exe"); 
//	        WebDriver driver = new FirefoxDriver();  // for FireFox
	    	WebDriver driver = new InternetExplorerDriver(dc);  

	        driver.get("http://www.baidu.com/"); 
	        driver.manage().window().maximize();
	        WebElement txtbox = driver.findElement(By.name("wd")); 
	        txtbox.sendKeys("Glen");
	        WebElement btn = driver.findElement(By.id("su"));
	        btn.click();
	        
	        driver.close();

	    }

	}
