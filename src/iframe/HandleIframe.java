package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIframe {
 	public static void main(String[]args) {
 		System.setProperty("webdriver.chrome.driver", 
 				"C:\\Users\\susmitha\\eclipse-workspace\\JavaSelenium\\driver\\chromedriver.exe");
 		WebDriver driver=new ChromeDriver();
 		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
 		driver.manage().window().maximize();
 		
 		//switch to frame using framename
 		driver.switchTo().frame("packageListFrame");
 		driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();
 		
 		driver.switchTo().defaultContent();  //go back to main page
 		
 		//switch to frame using indexvalue
 		driver.switchTo().frame(1);
 		driver.findElement(By.xpath("//span[contains(text(),'Alert')]")).click();
 		
 		driver.switchTo().defaultContent(); //go back to main page
 		
 		//using webelement
 		WebElement classframe = driver.findElement(By.xpath("//iframe[@name='classFrame']"));
 		driver.switchTo().frame(classframe);
 		driver.findElement(By.xpath("(//a[text()='Help'])[1]")).click();
 		
 		
	 
 }
	
}