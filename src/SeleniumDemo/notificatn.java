package SeleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class notificatn {

	public static void main(String[] args) {
		//handling notification popup
		//we open red bus.com  and it gives us the notification pop up 
		//so in this code we are disabling the pop up
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
				
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(co);

		driver.manage().window().maximize();

		String url = "https://www.redbus.in/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
	}

}
