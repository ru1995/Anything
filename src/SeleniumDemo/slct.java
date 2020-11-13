package SeleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class slct {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		String url = "https://www.facebook.com/";
		driver.get(url);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(4000);

		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select d = new Select(day);
		List<WebElement> days = d.getOptions();
		for (WebElement number : days) {
			System.out.println(number.getText());
		}

	}

}
