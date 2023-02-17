package javascriptexecutor;

import java.sql.Driver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {
	
	//contains userdefined methods to perform javascriptexecutor
	//flash method
	public static void flash(WebElement element, WebDriver driver)  {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		String bgcolor = element.getCssValue("backgroundColor");
		
		for (int i = 0; i <500; i++) {
			changeColor("#000000", element, driver);
			changeColor(bgcolor, element, driver);
			
		}
	}
	public static void changeColor(String color,WebElement element, WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.backgroundColor='"+color+"'",element);
		
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
		}
		
	}
	
	//DrawBorderMethod
	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	
	//Capture title of page
	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String title = js.executeScript("return document.title;").toString(); 
		return title;
	}
	 
	//To perform click
	public static void clickElementByJS(WebElement element,WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
	}
	
	//To generate Alert
	public static void generateAlert(WebDriver driver, String message) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('"+message+"')");

	}
	//To refresh Browser
	public static void refreshBrowserByJS(WebDriver driver) {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("history.go(0)");
	}
	
	//To scrolldown the page till find the element 
	public static void scrollIntoView(WebElement element, WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",element);

	}
	//To scrolldown till end
	public static void scrollPageDown(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");	
	}
	
	

}
