package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fbs {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String url = "https://www.facebook.com/";
		driver.get(url);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(4000);
		
//		List<WebElement> a=driver.findElements(By.xpath("//select[@id='day']/option"));
//		for(WebElement menu:a)
//		{   
//			String name=menu.getText();
//			if(name.equals(20))
//			{
//				driver.findElement(By.xpath("//span/span/select[contains(.,'1')]")).sendKeys("20", Keys.ENTER);
//				break;
//			}
//			
//			
//			//System.out.println(menu.getText());
//			
//			Thread.sleep(2000);
		
		
			
			WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
			Select d =new Select(day);
			d.selectByValue("20");
			Thread.sleep(1000);
			
			
			WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
			Select m =new Select(month);
			m.selectByVisibleText("Feb");
			Thread.sleep(1000);
			
			WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
			Select y =new Select(year);
			y.selectByValue("1995");
			Thread.sleep(1000);
			

	}

}
