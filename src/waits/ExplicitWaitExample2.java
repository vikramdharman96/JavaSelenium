package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample2 {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\susmitha\\eclipse-workspace\\JavaSelenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/signin");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("email")).sendKeys("vikramdhraman96@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		
		//ExplicitWait---It is applicable for particular locator/condition
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		WebElement toast = driver.findElement(By.xpath("//div[@role='alertdialog']")); 
		
		wait.until(ExpectedConditions.visibilityOf(toast)); //wait till visible ant get text
		System.out.println(toast.getText());
		wait.until(ExpectedConditions.invisibilityOf(toast)); //wait untill invisible

		
		
		driver.findElement(By.xpath("//a[contains(text(),'Sign out')]")).click(); //ElementClickInterceptedException
		
		
	}

}
