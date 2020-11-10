package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class darg {



	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String url = "https://jqueryui.com/slider/";
		driver.get(url);
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//a[text()='Draggable']")).click();
		
		//switch to iframe
		WebElement framee=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(framee);
		
		
		
		WebElement dr=driver.findElement(By.xpath("//div[@id='draggable']"));
		Actions a=new Actions(driver);
		Thread.sleep(1000);
		a.dragAndDropBy(dr, 0, 50).build().perform();
		
		
		
		

		
		
	}

}
