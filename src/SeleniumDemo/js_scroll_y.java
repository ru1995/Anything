package SeleniumDemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class js_scroll_y {
//This program scrolls down and up the provided web page
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String url = "https://www.selenium.dev/";
		driver.get(url);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for(int i=100;i<1000;i=i+100){
		 js.executeScript("window.scrollBy(0,1000)");
		 
		 // try for knight rider code here
		}

	}

}
