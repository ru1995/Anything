package SeleniumDemo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class method_fetchscrnsht  {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String url = "https://www.facebook.com/";
		driver.get(url);
		
		
		methd_takescrnsgt.fetch(driver, "Screeshot", "dmo1");
		// passing driver Stirng String as an argument
		

        


	}

}
