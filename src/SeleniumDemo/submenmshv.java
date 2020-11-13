package SeleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;

public class submenmshv {

	public static void main(String[] args) throws InterruptedException {
		//****very important code*******
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String url = "https://www.urbanladder.com/";
		driver.get(url);
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		Thread.sleep(2000);
		//for closing pop up
		
		List<WebElement> menus=driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));  // writing a common xpath
		Thread.sleep(2000);
		
		Actions a=new Actions(driver);
		for(WebElement menu:menus)
		{   
			String name=menu.getText();
			
			System.err.println(name);
			System.out.println(menu.getText());
			a.moveToElement(menu).perform();
			
			Thread.sleep(2000);
			
			List<WebElement> submenus=driver.findElements(By.xpath("//span[contains(.,'"+name +"')]/parent::li/descendant::ul[@class='taxonslist']/li"));  // writing a common xpath
			// we are concatenating in the above line
			Thread.sleep(2000);
			for(WebElement smenu:submenus)
			{
				System.out.println(smenu.getText());
			}
		}

	}

}
