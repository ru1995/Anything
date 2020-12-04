package org.qsp.testpom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.qsp.pom.Acti_time;
import org.qsp.pom.Acti_time_afterLogin;
import org.qsp.pom.SeleniumHome;

public class TestActi_time {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();


		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Acti_time at=new Acti_time(driver);
		at.sendUsername("admin");
		at.sendpassword("manager");
		at.loginClick();
		at.forgetPassword();
		at.ActTInc();
		at.forgetRightClick(driver);
		System.out.println(driver.getTitle());
		
		Acti_time_afterLogin ata=new Acti_time_afterLogin(driver);
		ata.logout();
		System.out.println(driver.getTitle());
		
		

	}

}
