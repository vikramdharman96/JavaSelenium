package screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TakesScreenshotExample {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\susmitha\\eclipse-workspace\\JavaSelenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		//Full page
		TakesScreenshot ts=(TakesScreenshot)driver;
//		File scr = ts.getScreenshotAs(OutputType.FILE);
		File trg =new File(".\\Screenshots\\homepage.png");
		
		File screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshotAs, trg);
		
		     
		//Section /portion of the page
		WebElement section = driver.findElement(By.xpath("//div[@id='gw-card-layout']/div[1]"));
		
		File scr1 = section.getScreenshotAs(OutputType.FILE);
		File trg1 =new File(".\\Screenshots\\Layout.png");
		
		FileUtils.copyFile(scr1, trg1);
		
		//Section/portion/element of the page
		WebElement logo = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		
		File scr2 = logo.getScreenshotAs(OutputType.FILE);
		File trg2 =new File(".\\Screenshots\\Logo.png");
		
		FileUtils.copyFile(scr2, trg2);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
