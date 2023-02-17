package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo2 {
	public static void main(String[] args) {
		//findelement---to find single webelement on browser
		//findelements --to find multiple webelement
		
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\susmitha\\eclipse-workspace\\JavaSelenium\\driver\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();
		
		//tagname
		int size = driver.findElements(By.tagName("a")).size();
		System.out.println(size);
		
//		//classname
//		int size = driver.findElements(By.className("a-section a-spacing-none fluid-image-container")).size();
//		System.out.println("Size of elements: "+size);
//		
	                                                                                      
	}
}
