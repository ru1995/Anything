package SeleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hidandivsn {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		String url = "https://demo.actitime.com/login.do";
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		//Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_support']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='About your actiTIME']")).click();
		//Thread.sleep(2000);
		Alert a=driver.switchTo().alert();
		driver.findElement(By.xpath("//span[text()='© 2020 actiTIME Inc. All rights reserved.']"));
		
			
		driver.findElement(By.xpath("//div[@id='aboutPopupCloseButtonId']")).click();
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
		

	}

}
