package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\susmitha\\eclipse-workspace\\JavaSelenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'Cancel')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'confirm box ')]")).click();
		
		Thread.sleep(3000);
		//Confrim alert
		//switch into alert
		Alert a = driver.switchTo().alert();
		
		//gettext
		System.out.println(a.getText());
		
		Thread.sleep(3000);
		//accept or dismiss
		a.dismiss();
		
		
		driver.close();
		
		
		
	}

}
