package javascriptexecutor;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutotDemo {
	public static void main(String[] args) throws IOException, InterruptedException{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\susmitha\\eclipse-workspace\\JavaSelenium\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		
		
		//flashing
		WebElement loginButton = driver.findElement(By.xpath("//button[@id='loginbutton']"));
		//JavaScriptUtil.flash(loginButton, driver);
		
		//Draw border and Takesscreenshot
		//JavaScriptUtil.drawBorder(loginButton, driver);
		
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File scr = ts.getScreenshotAs(OutputType.FILE);
//		File trg=new File(".\\Screenshots\\fbhomepage.png");
//		FileUtils.copyFile(scr, trg);
		
		//Get title of page
		//System.out.println(driver.getTitle());
		String titleByJS = JavaScriptUtil.getTitleByJS(driver);
		System.out.println(titleByJS);
		
		//To click
		//JavaScriptUtil.clickElementByJS(loginButton, driver);
		
		
		//To generate
//		WebElement signup = driver.findElement(By.xpath("//a[contains(text(),'Sign up')]"));
//		JavaScriptUtil.clickElementByJS(signup, driver);
//		JavaScriptUtil.generateAlert(driver,"Please Sign up " );
	
		//To refresh
		//driver.navigate().refresh();
//		Thread.sleep(3000);
//		JavaScriptUtil.refreshBrowserByJS(driver);
		
		//Scroll down the page till we found element
//		WebElement helpOption = driver.findElement(By.xpath("//a[text()='Help']"));
//		JavaScriptUtil.scrollIntoView(helpOption, driver);
		
		//scroll down page to end
		JavaScriptUtil.scrollPageDown(driver);
		
		
		
		
	
	
	}

}
