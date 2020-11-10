package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ACJQ {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String url = "https://jqueryui.com/slider/";
		driver.get(url);
		Thread.sleep(1000);
		WebElement framee=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(framee);
		WebElement slider=driver.findElement(By.xpath("//div[@id='slider']"));
		driver.switchTo().defaultContent();
		String text=driver.findElement(By.xpath("//p[text()='Drag a handle to select a numeric value.']")).getText();
		System.out.println(text);
		Actions a=new Actions(driver);
		a.dragAndDropBy(slider, 0, 75).build().perform();
	}

}
