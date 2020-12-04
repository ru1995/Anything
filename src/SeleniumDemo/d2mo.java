package SeleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class d2mo {
//sudha asked o fetch the value of what she was writing in the text field
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		String url = "https://demo.actitime.com/login.do";
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(7000);
		WebElement a=driver.findElement(By.xpath("//input[@name='username']"));
		a.sendKeys("admin");
		
		Thread.sleep(2000);
		String b=a.getAttribute("value");
		System.out.println("Value of type attribute: "+b);

	}

}
