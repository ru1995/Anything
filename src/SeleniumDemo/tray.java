package SeleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tray {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String url = "https://www.flipkart.com/";
		driver.get(url);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		Thread.sleep(2000);
		//for closing pop up
		
		List<WebElement> menus=driver.findElements(By.xpath("//div[@class='_1OSP27']/span"));  // writing a common xpath
		Thread.sleep(4000);
		
		Actions a=new Actions(driver);
		for(WebElement menu:menus)
		{   
			String name=menu.getText();
			
			//System.err.println(name);
			System.out.println(menu.getText());
			
			a.moveToElement(menu).perform();
			Thread.sleep(1000);
			
			List<WebElement> submenus=driver.findElements(By.xpath("//span[contains(.,'"+name+"')]/parent::div/descendant::div/div/a"));  // writing a common xpath
			
		// we are concatenating in the above line			//span[contains(.,'Electronics')]/parent::div/div/div/a
			Thread.sleep(2000);
			for(WebElement smenu:submenus)
			{
				System.out.println(smenu.getText());
				//Thread.sleep(2000);
			}
	}
		
		
		
		

	}

}
