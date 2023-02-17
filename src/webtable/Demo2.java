package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\susmitha\\eclipse-workspace\\JavaSelenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	
	driver.manage().window().maximize();
	
	//5.TO fetch all data from all rows without heading using for loop
	
	WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
	List<WebElement> allrows = table.findElements(By.tagName("tr"));
	for (int i = 0; i < allrows.size(); i++) {
		WebElement rows = allrows.get(i);
		List<WebElement> data = rows.findElements(By.tagName("td"));
			for (int j = 0; j < data.size(); j++) {
				WebElement alldata = data.get(j);
				System.out.println(alldata.getText());
			}
	}
	
	//6.To fetch all data from all rows with datas ,heading but without usinf for loop
	WebElement table1 = driver.findElement(By.xpath("//table[@id='customers']"));
	
	System.out.println(table1.getText());
	
	
	
	
	
	
	
}
}