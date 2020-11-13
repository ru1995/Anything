package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getttl_without {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String url = "https://www.google.com/";
		driver.get(url);
		Thread.sleep(2000);
		
//		WebElement ele=driver.findElement(By.xpath("//title[text()='Google']"));
//		System.out.println(ele.getAttribute("textContent"));
//		
		//driver.findElement(By.xpath("//title[text()='Google']")).getText();
		driver.findElement(By.tagName("title")).getText();
				

	}

}
