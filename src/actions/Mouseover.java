package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\susmitha\\eclipse-workspace\\JavaSelenium\\driver\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		
		Actions act=new Actions(driver);
		
		
		WebElement course = driver.findElement(By.xpath("//div[text()='Courses ']"));
		act.moveToElement(course).build().perform();
		
		WebElement Java = driver.findElement(By.xpath("//span[contains(text(),'Java (4)')]"));
		act.moveToElement(Java).build().perform();
		
		WebElement CoreJava = driver.findElement(By.xpath("//span[contains(text(),'Core Java Certification Training')]"));
		act.moveToElement(CoreJava).click().build().perform();
		
		
		
	

}
}
