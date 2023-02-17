package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebtable {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\susmitha\\eclipse-workspace\\JavaSelenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	
	driver.manage().window().maximize();
	
	//1.find No.of Tables in webpage
	
	List<WebElement> alltables = driver.findElements(By.tagName("table"));
	System.out.println("No.of tables:"+alltables.size());
		
	//2.To fetch a single data
	
	WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
	List<WebElement> allrows = table.findElements(By.tagName("tr"));
	WebElement row = allrows.get(2);
	List<WebElement> alldata = row.findElements(By.tagName("td"));
	WebElement data = alldata.get(2);
	
	String text = data.getText();
	System.out.println("Single Data:"+text);
	
	//2.1
	
	WebElement value = driver.findElement(By.xpath("//td[text()='Mexico']"));
	System.out.println(value.getText());
	
	//3 To fetch all data of 3rd row
	WebElement table1 = driver.findElement(By.xpath("//table[@id='customers']"));
	List<WebElement> allrows1 = table1.findElements(By.tagName("tr"));
	WebElement row1 = allrows1.get(3);
	List<WebElement> data1 = row1.findElements(By.tagName("td"));
	for (WebElement d : data1) {
		System.out.println(d.getText());
	}
	
	for (int i = 0; i < data1.size(); i++) {
		WebElement webElement = data1.get(i);
		System.out.println(webElement.getText());		
	}
	
	

	
	
	}

}
