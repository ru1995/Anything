package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class notificatn_guru99 {

	public static void main(String[] args) {
		//we open red bus.com  and it gives us the notification pop up 
		//so in this code we are disabling the pop up
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
				
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(co);

		driver.manage().window().maximize();

		
		String url = "http://demo.guru99.com/v1/index.php";
		driver.get(url);
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();

	}

}
