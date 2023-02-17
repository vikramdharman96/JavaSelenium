package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\susmitha\\eclipse-workspace\\JavaSelenium\\driver\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		WebElement slider = driver.findElement(By.xpath("//body/div[@id='slider']/span[1]"));
		
		Actions act =new Actions(driver);
		act.moveToElement(slider).dragAndDropBy(slider, 300, 0).build().perform();  //drag the slider
		
		
		
		
		
	}

}
