package SeleniumDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class js_scroll_Assign {
	
// Program to load google, search for java, click on the next button until CodingBat Java website 
//is found and click on the website
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		String url = "https://www.google.com/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("java", Keys.ENTER);
		Thread.sleep(2000);
		
		WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));//finding the xpath of next
		
		while (next.isDisplayed()) {  //if the next button is displayed then hit next
			
			List<WebElement> fetch = driver.findElements(By.xpath("//h3[@class='LC20lb DKV0Md']/span"));//to get all the websites
			
			for (WebElement a : fetch) {
				if(a.getText().equals("CodingBat Java"))//comparing all the wesites with the required
				{
					System.out.println("Element found");
					a.click();//if website found open the website
					break;
				}
				else
				{
					System.out.println("not found");
				}
			}
			next.click();//if website not found click next
			
			next=driver.findElement(By.xpath("//span[text()='Next']"));//re-assigning it as it is local
		}

	}

}
