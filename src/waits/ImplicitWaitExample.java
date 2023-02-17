package waits;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\susmitha\\eclipse-workspace\\JavaSelenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	
	//Implicitwait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //throughout the program only one time implicit wait is applicable.and its aplicable for all locators
	
	driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
	
	
	
	
	
	}

}
