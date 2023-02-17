package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Sample {
	public static void main(String[] args) {
		
		// Set the driver path
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\susmitha\\eclipse-workspace\\JavaSelenium\\driver\\chromedriver.exe");

		// Start Edge Session
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println("Title:\n "+title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current Url:\n "+currentUrl);
		
		driver.quit();

		
		
	}

}
