package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromtAlert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\susmitha\\eclipse-workspace\\JavaSelenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Textbox')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'prompt box')]")).click();
		
		//PromptAlert
		Alert a = driver.switchTo().alert();
		
		a.sendKeys("Vikram");
		Thread.sleep(3000);
		
		a.accept();
		
		driver.close();
		
		
	}

}
