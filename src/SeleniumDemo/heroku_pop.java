package SeleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class heroku_pop {

	public static void main(String[] args) {
		
	//handling authentication password
		
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();

	String url = "http://admin:admin@the-internet.herokuapp.com/basic_auth";
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	String a=driver.findElement(By.tagName("p")).getText();// or u can use contains for xpath
	System.out.println(a);
	
	}

}
