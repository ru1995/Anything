package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hmtsk1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//url=https://www.naukri.com/nlogin/login;
		driver.manage().window().maximize();	
		String url="https://www.facebook.com/";
		driver.get(url);
		//WebElement search=driver.findElement(By.name("email"));
		//search.sendKeys("aAmin");
		//WebElement search1=driver.findElement(By.name("pass"));
				//search1.sendKeys("aAmin",Keys.ENTER);//used when the search key is not visble to to the suggestions
//				WebElement password=driver.findElement(By.name("pwd"));
//				password.sendKeys("hello");
				
//				WebElement login=driver.findElement(By.name("btnK"));
//				login.click();
				
				driver.findElement(By.partialLinkText("Forgotten password?")).click();
	}

}
