package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDropDownExampl2 {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\susmitha\\eclipse-workspace\\JavaSelenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		WebElement yearbox = driver.findElement(By.id("yearbox"));
		WebElement Month = driver.findElement(By.xpath("//select[@placeholder=\"Month\"]"));
		WebElement day = driver.findElement(By.id("daybox"));
		
		HandleDropDown.selectOptionsFromDropDown(yearbox, "1996");
		HandleDropDown.selectOptionsFromDropDown(Month, "January");
		HandleDropDown.selectOptionsFromDropDown(day, "13");
		
		
		
		
		
		
		
		
		
	}

}
