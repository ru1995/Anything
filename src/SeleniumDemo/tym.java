package SeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tym {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String url = "https://google.com";
		driver.get(url);
		Thread.sleep(10000);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}

		
}
		


