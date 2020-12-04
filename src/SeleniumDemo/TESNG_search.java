package SeleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TESNG_search {
// go to selenium.org, n the search box search for java, navigate back and search for TESTNG
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		String url = "https://www.selenium.dev/";
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(4000);
		
		WebElement search=driver.findElement(By.xpath("//input[@name='search']"));
		search.sendKeys("java",Keys.ENTER);
		
		driver.navigate().back();
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.xpath("//input[@name='search']"));
		search.sendKeys("TESTNG",Keys.ENTER);
		
		//the reference of the particular element got old(a s when executing 
		//selenium assign s a id and after the page is refreshed it will throw)
		

	}

}
