package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {
	public static void main (String[]args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\susmitha\\eclipse-workspace\\JavaSelenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(text(),'alert ')]")).click();
		
		//simple alert
		
		//switch into alert
		Alert a = driver.switchTo().alert();
		//get text from alertbox
		System.out.println(a.getText());
		//click ok or accept the alert box
		a.accept();
		
		
		
		
		
		
		
		
	}

}
