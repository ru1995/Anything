package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dorp {

	public static void main(String[] args) throws InterruptedException {
		
		// drag one thing from one and place it to the other
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String url = "https://jqueryui.com/slider/";
		driver.get(url);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='Droppable']")).click();
		
		
		WebElement framee=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(framee);
		
		Actions a=new Actions(driver);
		Thread.sleep(1000);
		
		WebElement source=driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement target=driver.findElement(By.xpath("//p[text()='Drop here']"));
		a.dragAndDrop(source, target).build().perform();
		
		String text=driver.findElement(By.xpath("//p[text()='Dropped!']")).getText();
		System.out.println(text);

	}

}
