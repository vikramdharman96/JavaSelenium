package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserLaunch {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\susmitha\\eclipse-workspace\\JavaSelenium\\driver\\chromedriver.exe");
		
//		ChromeOptions options=new ChromeOptions();
//		options.setHeadless(true);                              //without seeing UI we can execute browser
//		options.addArguments("--headless");
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println("Title:\n "+title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current Url:\n "+currentUrl);
				
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("ram@123");
		
		driver.findElement(By.id("pass")).sendKeys("password");
		
		driver.findElement(By.id("loginbutton")).click();
		

		
		driver.close();
		
//		driver.quit();
		
		
		
	}

}
