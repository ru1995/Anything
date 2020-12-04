package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class customwt {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		String url = "https://demo.actitime.com/login.do";
		driver.get(url);
		
		
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
        wait.until(new ExpectedCondition<Boolean>() {
        	
        	public Boolean apply(WebDriver driver) 
        	{
              return driver.findElement(By.xpath("//div[text()='Login ']")).isDisplayed();
                        
        	}
        });
        	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
    		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
    		driver.findElement(By.xpath("//div[text()='Login ']")).click();
                      
	}

}
