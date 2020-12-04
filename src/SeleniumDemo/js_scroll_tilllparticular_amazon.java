package SeleniumDemo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class js_scroll_tilllparticular_amazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	String url = "https://www.amazon.in/";
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement sign_in = driver.findElement(By.xpath("//a[@class='action-button']/span"));
	Thread.sleep(6000);
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();",sign_in);

	 
	Thread.sleep(2000);
	
	methd_takescrnsgt.fetch(driver, "Screeshot", "dmo1");
	
	 js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	 methd_takescrnsgt.fetch(driver, "Screeshot", "dmo2");
	 driver.close();
	
	}

}
