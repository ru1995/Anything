package SeleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class disbttxt_Cutmwt {

	public static void main(String[] args) {
//This is the html code to be used while developing the program!
/*<html>
<body>
<div>
A:<input type = "text"  id = "abc">
</div>
B:<input type = "text" id= "xyz" disabled>
</div>
<div>
C:<input type="text"  id="pqr">
</div>
</body>
</html>*/
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		String url = "file:///C:/Users/SONY/Desktop/disabledtxt.html";
		driver.get(url);
		
		
		List<WebElement> fetch=driver.findElements(By.xpath("/input[@id]"));
		
		for(WebElement a:fetch){
			
			String b=a.getAttribute("value");
			
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(new ExpectedCondition<Boolean>() {

				public Boolean apply(WebDriver driver) {
					return driver.findElement(By.xpath("//input[@id='"+b+"']")).isDisplayed();
				}
			});
			
			driver.findElement(By.xpath("//input[@id='"+b+"']")).sendKeys("java");
			
			
	}}

}
