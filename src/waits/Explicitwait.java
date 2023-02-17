package waits;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\susmitha\\eclipse-workspace\\JavaSelenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/waits");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='Simple Alert']")).click(); //No alertexceptionpresent
		
		
		//Explicitwait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		Alert until = wait.until(ExpectedConditions.alertIsPresent());
		
		System.out.println(until.getText());
		until.accept();
		//driver.switchTo().alert().accept();
		
		
		
		
	}

}
