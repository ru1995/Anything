package SeleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class java_extrct_geturl {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String url = "https://www.google.com/";
		driver.get(url);
		Thread.sleep(1000);
		
		
		
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("java",Keys.ENTER);
		Thread.sleep(1000);
		
		
		List<WebElement> fet=driver.findElements(By.xpath("//span[text()='Java | Oracle']//ancestor::div[@class='g']//parent::div[@id='rso']/div"));
		for(WebElement f:fet)
		{
			String a=f.getText();
			System.out.println(a);
			Thread.sleep(1000);
			
		}
		
		fet.get(2).click();
	}

}
