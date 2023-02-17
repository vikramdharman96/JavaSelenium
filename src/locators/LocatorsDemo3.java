package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo3 {
	public static void main(String[]args){
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\susmitha\\eclipse-workspace\\JavaSelenium\\driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement findElement = driver.findElement(By.xpath("//div[@id='nav-xshop']/descendant::a[contains(text(),'Mobiles')]"));
		findElement.click();
		 
		System.out.println(driver.getTitle());	
		driver.close();	
	
	}

}
