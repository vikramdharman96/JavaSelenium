package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\susmitha\\eclipse-workspace\\JavaSelenium\\driver\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://strml.github.io/react-resizable/examples/1.html");
		driver.manage().window().maximize();
		
//		driver.switchTo().frame(0);
		WebElement resize = driver.findElement(By.xpath("//body/div[@id='content']/div[1]/div[1]/span[2]"));
		Actions act =new Actions(driver);
		act.moveToElement(resize).dragAndDropBy(resize, 50, 250).build().perform();
	
		
		
	}

}
