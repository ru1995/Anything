package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebk {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String url = "https://www.facebook.com/";
		driver.get(url);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Mark");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Zuck");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("202020");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("avavav");
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//span/span/select[contains(.,'1')]")).sendKeys("20", Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span/span/select[contains(.,'Jan')]")).sendKeys("Feb", Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span/span/select[contains(.,'2020')]")).sendKeys("1995", Keys.ENTER);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']")).click();
		Thread.sleep(1000);
		
		driver.close();
		Thread.sleep(2000);
		
		

	}

}
