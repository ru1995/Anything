package SeleniumDemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class blstn {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String url = "https://www.bluestone.com/";
		driver.get(url);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("gold ring", Keys.ENTER);
		driver.findElement(By.xpath("//div/a[@id='pid_26039']")).click();
		
		
		Set<String> wins = driver.getWindowHandles();
		for (String win : wins) {
			System.out.println(win);
			driver.switchTo().window(win);
		}
		Thread.sleep(4000);
		
		//Thread.sleep(4000);
		//driver.findElement(By.xpath("//div[@class='buynow-block col-xs-7']")).click();
		//System.out.print(driver.findElement(By.xpath("//div[text()='* This field is required']")).getText());  // to return the invalid logi thing

		
		driver.findElement(By.xpath("//span[@class='icon-ion-android-arrow-dropdown']")).click();
		Thread.sleep(12000);
		
		driver.findElement(By.xpath("//li[@data-key='06']")).click();// do it with li if not span is helpful
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[@class='buynow-block col-xs-7']")).click();
		System.out.print(driver.getTitle());
		
		driver.close();
	}

}
