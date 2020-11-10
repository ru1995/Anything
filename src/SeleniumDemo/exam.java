package SeleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class exam {

	public static void main(String[] args) throws InterruptedException {
		 {
			System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			String url = "https://www.urbanladder.com/";
			driver.get(url);
			Thread.sleep(10000);

			
			driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()=' Stores ']")).click();
			
			
			List<WebElement> menus=driver.findElements(By.xpath("//div[@class='_3oCTi']/a"));  // writing a common xpath
			Thread.sleep(2000);
			
			
			for(WebElement menu:menus)
			{   
				String name=menu.getText();
				
				
				System.out.println(menu.getText());
				
				Thread.sleep(2000);
				
				
			}
	}

}}
