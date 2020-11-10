package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prlink {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//WebDriver driver1=new ChromeDriver();
		driver.manage().window().maximize();
		//driver1.manage().window().maximize();
		
		String url="https://www.urbanladder.com/";
		driver.get(url);
		Thread.sleep(12000);
		
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("search")).sendKeys("sofa",Keys.ENTER);		
		
		
	}

}