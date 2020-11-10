package SeleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;

public class java_extract {

	public static void main(String[] args) throws InterruptedException  {
		// To search in google java and get all the texts with java plus the text after it after search while not hitting enter
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String url = "https://www.google.com/";
		driver.get(url);
		Thread.sleep(1000);
		
		
		
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("java");
		Thread.sleep(1000);
		
		
		List<WebElement> names=driver.findElements(By.xpath("//b[text()=' download']/parent::span/parent::div/parent::div/parent::div/parent::li/parent::ul"));
		for(WebElement a:names)
		{
			
		String s=a.getText();
		System.out.println(s);
			
		}
			
	}

}
