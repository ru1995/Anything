package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rclck {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String url = "http://demo.guru99.com/test/simple_context_menu.html";
		driver.get(url);
		Thread.sleep(2000);
		// right click
		Actions a=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//span[text()='right click me']"));//span[text()='right click me']
		a.contextClick(ele).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']")).click();
		
		Thread.sleep(2000);
		// double click		
		Actions a1=new Actions(driver);
		WebElement ele1=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));//span[text()='right click me']
		a1.doubleClick(ele1).perform();
	}

}
