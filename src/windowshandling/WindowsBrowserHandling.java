package windowshandling;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javascriptexecutor.JavaScriptUtil;

public class WindowsBrowserHandling {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\susmitha\\eclipse-workspace\\JavaSelenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
//	//getwindowHandle
//	String single = driver.getWindowHandle();  //return single window ID
//	System.out.println(single);
	
	//Thread.sleep(3000);
	driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
	
	//getWindowHandles
	Set<String>  Multiplewindows= driver.getWindowHandles();
	System.out.println(Multiplewindows);
	
	//First method-Iterator method
	Iterator<String> iterator = Multiplewindows.iterator();
	String ParentId = iterator.next();
	//System.out.println("ParentId:"+ParentId);
	String childID = iterator.next();
	//System.out.println("ChildID:"+childID);
	
	
	//Second method-List/Arraylist   
	List<String> windowslist=new ArrayList<String>(Multiplewindows);  //---converting set to list
	System.out.println("Parent:"+windowslist.get(0));
	System.out.println("Child:"+windowslist.get(1));
	
	
	//How to use window ID' to switch
	
//	driver.switchTo().window(ParentId);
//	System.out.println("Parent window title:"+driver.getTitle());
//	
//	driver.switchTo().window(childID);
//	System.out.println("Child window title:"+driver.getTitle());
	
	for (String winID : windowslist) {
		String title = driver.switchTo().window(winID).getTitle();
		System.out.println(title);
	}
	
	
	
	
	
	
	}

}
