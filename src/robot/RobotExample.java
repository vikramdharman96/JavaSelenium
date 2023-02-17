package robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotExample {
	public static void main(String[]args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\susmitha\\eclipse-workspace\\JavaSelenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		Actions a=new Actions(driver);  //Actions Class
		a.keyDown(Keys.SHIFT).sendKeys(email, "vikram").keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(2000);
		a.doubleClick(email).build().perform();
		Thread.sleep(2000);
		a.contextClick(email).build().perform();
		
		Robot r=new Robot();
		for (int i = 0; i <3; i++) {
			//press 3 times (Down arrow)
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);			
		}
		
		Thread.sleep(1000);
		  //press enter
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		//press tab
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(2000);
		//press Ctrl +V to paste
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		//release Ctrl+v
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
