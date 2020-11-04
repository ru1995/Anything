package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pyu {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//WebDriver driver1=new ChromeDriver();
		driver.manage().window().maximize();
		//driver1.manage().window().maximize();
		
		String url="https://www.google.com/";
		driver.get(url);
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("java",Keys.ENTER);
		
		//WebElement s=driver.findElement(By.xpath("//input[@name='q']"));
		//s.sendKeys("java",Keys.ENTER);
	Thread.sleep(2000);
//		System.out.println(driver.findElement(By.xpath("//span[contains(.,'Programming language')]")).getText());

	}

}
