package SeleniumDemo;

//import java.util.List;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart_rating_sort {

	public static void main(String[] args) throws InterruptedException {
		
		//fetch from flipkart the ratings and sort it in any order
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String url = "https://www.flipkart.com/";
		driver.get(url);
		Thread.sleep(4000);
		
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys("m21",Keys.ENTER);
		Thread.sleep(1000);
		
		 //creating the empty list that will be used for adding elements
		
		//List<WebElement> fetch=driver.findElements(By.xpath("//div[text()='4.3']/ancestor::div[@class='_1HmYoV _35HD7C']/div"));
		List<WebElement> fetch=driver.findElements(By.xpath("//div[@class='hGSR34']"));//correct xoath as we only need the 4.3
		//...........//div[@class='hGSR34']  use this
		
		Set<Double> set=new TreeSet<>();
		Thread.sleep(2000);
		for(WebElement f:fetch)
		{
			System.out.println(f.getText());
			
			set.add(Double.parseDouble(f.getText()));
			Thread.sleep(2000);
		}
		
		for(Double a:set)
		{
			System.out.println(a);
			
		}
		
		
	
	}

}
