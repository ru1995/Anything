package SeleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class alert {
// this program shows how to handle alert popup
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		String url = "http://demo.guru99.com/v1/index.php";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Alert a=driver.switchTo().alert();
		//in order to handle alert pop up we switch to alert using this line , it will return alert class object
		
		System.out.println(a.getText());
		a.accept();
	}

}
