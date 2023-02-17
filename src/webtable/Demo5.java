package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\susmitha\\eclipse-workspace\\JavaSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		driver.manage().window().maximize();
		
		
		//10.To print 3rd and 4th row all datas using normal for loop
		WebElement table1 = driver.findElement(By.xpath("//table[@id='customers']"));
		List<WebElement> allrows1 = table1.findElements(By.tagName("tr"));
		
		for (int i = 0; i < allrows1.size(); i++) {
			if (i==3||i==4) {
				WebElement row = allrows1.get(i);
				List<WebElement> data = row.findElements(By.tagName("td"));
				for (int j = 0; j < data.size(); j++) {
					WebElement alldata = data.get(j);
					
						System.out.println(alldata.getText());
				
				}
			}
			
		}
		
//		driver.close();
		

	}

}
