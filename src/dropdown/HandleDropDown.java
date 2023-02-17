package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\susmitha\\eclipse-workspace\\JavaSelenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.opencart.com/index.php?route=account/register");
	driver.manage().window().maximize();
	
		WebElement drpdrop = driver.findElement(By.name("country_id"));
		
		Select s=new Select(drpdrop);
//		s.selectByIndex(3);
//		s.selectByValue("3");
		s.selectByVisibleText("Algeria");
	}
	
	// user defined method for dropdwon
	public static void selectOptionsFromDropDown(WebElement ele, String value) {
		Select s=new Select(ele);
		List<WebElement> options = s.getOptions();
		for (WebElement option : options) {
			if(option.getText().equals(value)) {
				option.click();
				break;
			}
			
		}
		

	}

}






