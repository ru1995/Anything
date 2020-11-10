package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class aisx {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String url = "https://www.urbanladder.com/";
		driver.get(url);
		Thread.sleep(10000);

		
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		WebElement sale=driver.findElement(By.xpath("//li[@class='topnav_item saleunit']"));
		Actions a=new Actions(driver);
		a.moveToElement(sale).build().perform();
		
	}

}
