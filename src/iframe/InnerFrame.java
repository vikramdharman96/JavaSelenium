package iframe;

import org.checkerframework.checker.units.qual.degrees;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnerFrame {
	public static void main(String[] args) {
		
 		System.setProperty("webdriver.chrome.driver", 
 				"C:\\Users\\susmitha\\eclipse-workspace\\JavaSelenium\\driver\\chromedriver.exe");
 		WebDriver driver=new ChromeDriver();
 		driver.get("https://demo.automationtesting.in/Frames.html");
 		driver.manage().window().maximize();
 		
 		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
 		
 		WebElement outterframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
 		driver.switchTo().frame(outterframe);
 		
 		WebElement innerframe = driver.findElement(By.xpath("(//iframe[@src='SingleFrame.html'])[1]"));
		driver.switchTo().frame(innerframe);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vikram");
	}

}
