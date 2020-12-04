package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class custmwt_1st_prog {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		String url = "https://demo.actitime.com/login.do";
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(new ExpectedCondition<Boolean>() {

			public Boolean apply(WebDriver driver) {
				return driver.findElement(By.xpath("//a[@id='logoutLink']")).isDisplayed();

			}
		});
		
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
		
		// if the return statement goes to true it will click on the logout link
		//else it will throw an exception


	}

}
