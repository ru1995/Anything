package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ABCD_CustmWt {

	public static void main(String[] args) {
//This is the html code to be used while developing the program!
/*<html>
<body>
<div>
A:<input type = "text"  name = "textA">
B:<input type = "text" name = "textB">
</div>
<div>
C:<input type="text"  name = "textC">
D:<input type="text"  name = "textD">

</div>

</body>
</html>*/		

		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		String url = "file:///C:/Users/SONY/Desktop/ABCD.html";
		driver.get(url);
		
		
		driver.findElement(By.xpath("//input[@name='textA']")).sendKeys("name");
		
	
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(new ExpectedCondition<Boolean>() {

			public Boolean apply(WebDriver driver) {
				
			WebElement e = driver.findElement(By.xpath("//input[@name='textA']"));
			String val = e.getAttribute("value");
			if(e!=null)
			{
				if(val.equals("name"))
				{
					driver.findElement(By.xpath("//input[@name='textB']")).sendKeys("Surname");
					driver.findElement(By.xpath("//input[@name='textC']")).sendKeys("Address");
					driver.findElement(By.xpath("//input[@name='textD']")).sendKeys("Phno");

					return true;
				}
				else
					return false;
			}
			return false;

			}
		});
		
		
		/* Ankur Sir's method
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(new ExpectedCondition<Boolean>() {

			public Boolean apply(WebDriver driver) {
				
			return driver.findElement(By.name("textA")).getAttribute("value").equalsIgnoreCase("name");
			
		});
		driver.findElement(By.name("textB")).sendKeys("hello");
		*/
	}

}
