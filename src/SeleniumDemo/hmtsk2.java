package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hmtsk2 {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();	
		
		String url="https://www.facebook.com/";
		driver.get(url);
		
		driver.getTitle();
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(2000);
		
		
		driver.getTitle();
		//driver.findElement(By.id("u_5_b")).click();
		WebElement f_name=driver.findElement(By.name("firstname"));
		f_name.sendKeys("Abcd");
		
		WebElement s_name=driver.findElement(By.name("lastname"));		
		s_name.sendKeys("Efgh");
		
		WebElement mob=driver.findElement(By.name("reg_email__"));		
		mob.sendKeys("123456789@gamil");
		
		WebElement pwd=driver.findElement(By.name("reg_passwd__"));		
		pwd.sendKeys("abcd12345");
		
		driver.findElement(By.id("u_1_s")).click();
		driver.close();
		
		
		
		
		//WebElement search1=driver.findElement(By.name("pass"));
				//search1.sendKeys("aAmin",Keys.ENTER);//used when the search key is not visble to to the suggestions
//				WebElement password=driver.findElement(By.name("pwd"));
//				password.sendKeys("hello");
				
//				WebElement login=driver.findElement(By.name("btnK"));
//				login.click();
				
		

	}

}
