package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\susmitha\\eclipse-workspace\\JavaSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		driver.manage().window().maximize();
		
		
		//11.To find the row & cell of particular data
		WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
		List<WebElement> allrows = table.findElements(By.tagName("tr"));
		
		for (int i = 0; i < allrows.size(); i++) {
			WebElement row = allrows.get(i);
			List<WebElement> alldata = row.findElements(By.tagName("td"));
			for (int j = 0; j < alldata.size(); j++) {
				WebElement data = alldata.get(j);
				String text =data.getText();
				if (text.equals("Mexico")) {
					System.out.println("Value:"+text);
					System.out.println("row:"+i);
					System.out.println("cell:"+j);
					
				}
				
			}
			
			
		}
		
	}

}
