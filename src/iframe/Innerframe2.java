package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Innerframe2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\susmitha\\eclipse-workspace\\JavaSelenium\\driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
	driver.manage().window().maximize();
	
	WebElement outerframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
	driver.switchTo().frame(outerframe);
	driver.switchTo().frame(0);
	
	String text = driver.findElement(By.xpath("//h1[contains(text(),'This page is displayed in an iframe')]")).getText();
	System.out.println(text);
	
	
	driver.switchTo().parentFrame(); //to switch parent frame
	String text2 = driver.findElement(By.xpath("//p[contains(text(),'You can use the height and width attributes to specify the size of the iframe:')]")).getText();
	System.out.println(text2);
	
	
	
	
	
	
	
	
}
}
