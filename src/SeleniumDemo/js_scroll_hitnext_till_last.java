package SeleniumDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class js_scroll_hitnext_till_last {
	
	//Program to load google, search for java scroll full down until there is no page count
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		String url = "https://www.google.com/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("java", Keys.ENTER);
		Thread.sleep(2000);
		
		WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)"); // scroll to the bottom of the page
		
		Thread.sleep(4000);
		
		while (next.isDisplayed()) {
			
			List<WebElement> fetch = driver.findElements(By.xpath("//h3[@class='LC20lb DKV0Md']/span"));// xpath of al the websites
			
			for (WebElement a : fetch) {
				System.out.println(a.getText());// fetching and printing
			}
			next.click();
			
			next=driver.findElement(By.xpath("//span[text()='Next']"));
		}


	}

}
