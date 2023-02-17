package webtable;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\susmitha\\eclipse-workspace\\JavaSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/datepicker/#date%E2%88%92range");
		
		driver.manage().window().maximize();			
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		for (int i = 10; i >1; i--) {
			driver.findElement(By.xpath("//span[contains(text(),'Prev')]")).click();
			
			String text = driver.findElement(By.xpath("//span[contains(text(),'January')]")).getText();
			if (text.equals("January")) {
				driver.findElement(By.xpath("//a[contains(text(),'13')]")).click();
				break;
				
			}
		}
		
		
		
	}

}
