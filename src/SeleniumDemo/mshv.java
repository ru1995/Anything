package SeleniumDemo;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mshv {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String url = "https://www.urbanladder.com/";
		driver.get(url);
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		Thread.sleep(2000);
		
		
		List<WebElement> menus=driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));  // writing a common xpath
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		for(WebElement menu:menus)
		{
			System.out.println(menu.getText());
			a.moveToElement(menu).perform();
			Thread.sleep(2000);
		}
		 
		
		

		
//		driver.findElement(By.xpath("//span[text()='Kadas']")).click();
//		driver.findElement(By.xpath("//img[@alt='The Udith Kada For Him']")).click();
//		
//		
//		Set<String> wins = driver.getWindowHandles();
//		for (String win : wins) {
//			System.out.println(win);
//			driver.switchTo().window(win);
//		}
//		Thread.sleep(4000);
//		
//		
//		driver.findElement(By.xpath("//span[@class='icon-ion-android-arrow-dropdown']")).click();
//		driver.findElement(By.xpath("//li[@data-key='08']")).click();
//		Thread.sleep(12000);
//		
//		
//		
//		driver.findElement(By.xpath("//div[@class='buynow-block col-xs-7']")).click();
//		System.out.print(driver.getTitle());
//		

	}

}
