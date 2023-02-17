package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\susmitha\\eclipse-workspace\\JavaSelenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	
	driver.manage().window().maximize();
	
	
	//8.To print all datas using enhanced for loop with headings	
	WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
	List<WebElement> allrows = table.findElements(By.tagName("tr"));
	for (WebElement rows : allrows) {
		List<WebElement> headrow = rows.findElements(By.tagName("th"));
		for (WebElement allheadings : headrow) {
			System.out.println(allheadings.getText());
		}
		List<WebElement> alldata = rows.findElements(By.tagName("td"));
		for (WebElement datas : alldata) {
			System.out.println(datas.getText());
			
		}
	}

	
	
//	driver.close();
	
	
	}

}
