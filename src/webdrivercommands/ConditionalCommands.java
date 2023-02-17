package webdrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands {
	//isDisplayed()
	//.isEnabled()
	//.isSelected()

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\susmitha\\eclipse-workspace\\JavaSelenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		
		WebElement txtfirstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement txtMobilenum = driver.findElement(By.xpath("//input[@name='reg_email__']"));
	
		if (txtfirstname.isDisplayed() && txtfirstname.isEnabled() ) {     
			
			txtfirstname.sendKeys("Vikram");		
		}
		if (txtMobilenum.isDisplayed() && txtMobilenum.isEnabled()) {
			txtMobilenum.sendKeys("123456");
		}
		//female
		System.out.println(driver.findElement(By.xpath("(//input[@type='radio'])[1]")).isSelected());
		//Male
		System.out.println(driver.findElement(By.xpath("(//input[@type='radio'])[2]")).isSelected());
		
		
		
		if (driver.findElement(By.xpath("(//input[@type='radio'])[1]")).isSelected()==false) {
			driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		}
		
		
	
	}

}
