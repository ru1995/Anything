package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class custwt_adminadmin {
	

	public static void main(String[] args) {
		
//****************************************************************************************************		
		//program to
		//open https://demo.actitime.com/login.do and send admin and admin and get the error text
		// as it is wrong we fetch the error text and again send admin and manager to login
//****************************************************************************************************		
		
		/*System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		String url = "https://demo.actitime.com/login.do";
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("admin");

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(new ExpectedCondition<Boolean>() {

			public Boolean apply(WebDriver driver) {
				return driver.findElement(By.xpath("//div[text()='Login ']")).isDisplayed();

			}
		});
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();

		String s = driver.findElement(By.xpath("//span[@class='errormsg']")).getText();
		System.out.println(s);

		if (s.equals("Username or Password is invalid. Please try again.")) {
			WebDriverWait wait1 = new WebDriverWait(driver, 5);

			wait1.until(new ExpectedCondition<Boolean>() {

				public Boolean apply(WebDriver driver) {
					return driver.findElement(By.xpath("//div[text()='Login ']")).isDisplayed();

				}
			});
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			System.out.println("hello");
		} else {
			System.out.println("Code error");

		}*/
		
		
	
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		String url = "https://demo.actitime.com/login.do";
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("admin");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(new ExpectedCondition<Boolean>() {

			public Boolean apply(WebDriver driver) {
				
			WebElement e = driver.findElement(By.xpath("//span[@class='errormsg']"));
			if(e!=null)
			{
				if(e.getText().contains("Username or Password is invalid. Please try again."))
				{
					driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
					driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
					driver.findElement(By.xpath("//div[text()='Login ']")).click();

					return true;
				}
				else
					return false;
			}
			return false;

			}
		});

	}

}
