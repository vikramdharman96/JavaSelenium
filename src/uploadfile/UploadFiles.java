package uploadfile;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFiles {
	public static void main(String[]args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\susmitha\\eclipse-workspace\\JavaSelenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.foundit.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(" //div[contains(text(),'Upload')]")).click();
		
		//using send keys
//		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\susmitha\\Desktop\\Vikram.pdf");
		
		WebElement button = driver.findElement(By.id("file-upload"));
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", button);
		
		/*Copy the path
		  Ctrl+v
		  Enter
		 */
		//using robot class
		Robot rb=new Robot();
		rb.delay(2000);
		
		//get file from path and copied in clipboard
		StringSelection ss=new StringSelection("C:\\Users\\susmitha\\Desktop\\Vikram.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//ctrl+v
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		//enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
	}

}
