package SeleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaextract_thrdval {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String url = "https://www.google.com/";
		driver.get(url);
		Thread.sleep(1000);
		
		
		
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("java");
		Thread.sleep(1000);
		
		//xpaths
		//b[text()=' download']/parent::span[text()='java']/parent::div/parent::div/parent::div//parent::li....
		//b[text()=' download']/parent::span/parent::div/parent::div/parent::div/parent::li/parent::ul
		
		List<WebElement> jav=driver.findElements(By.xpath("//span[text()='java']/parent::div/parent::div/parent::div//parent::li"));
		for(WebElement a:jav)
		{
			String b=a.getText();			
			//System.out.println(b);
			String z=b.replace("java ","");// removing "java" keyword with nothing
			System.err.println(z);  //pass z to the xpath
			
		// fetching 3rd element	
			
			System.err.println(jav.get(2).getText());
			if(a.equals((jav.get(2)).getText()))
			{
			driver.findElement(By.xpath("//b[text()='"+z+"']/parent::span[text()='java']/parent::div/parent::div/parent::div//parent::li"));//.click();
			break;
			}
			else
			{
				System.out.println("did not fetch");
			}
				

		}
		
		
	}

}
