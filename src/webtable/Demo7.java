package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\susmitha\\eclipse-workspace\\JavaSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		driver.manage().window().maximize();
		
		//12.TO print last row last cell
		
		WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
		List<WebElement> allrows = table.findElements(By.tagName("tr"));
		
		WebElement lastrow = allrows.get(allrows.size()-1);
		
		List<WebElement> alldatas = lastrow.findElements(By.tagName("td"));
		WebElement lastdata = alldatas.get(alldatas.size()-1);
		
		System.out.println(lastdata.getText());
		
		//13.TO Print center row center cell
			WebElement table1 = driver.findElement(By.xpath("//table[@id='customers']"));
			List<WebElement> allrows1 = table1.findElements(By.tagName("tr"));
			WebElement centerrow = allrows1.get(allrows1.size()/2);
			
			List<WebElement> centerdatas = centerrow.findElements(By.tagName("td"));
			WebElement data = centerdatas.get(centerdatas.size()/2);
			System.out.println(data.getText());
	}

}
