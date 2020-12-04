package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class custwt_sendsome {

	public static void main(String[] args) {
		
//This is the html code to be used while developing the program!
/*<!DOCTYPE html>
<html>
<body> 
	<div id='prova' style=display:none'>
	<input type="text" id="iamtextbox">

	</div>

	<script>
		window.onload=function(){
		       setTimeout(appeardiv,3000);
		}
		function appeardiv(){
			document.getElementById('prova').style.display= "block";
		}
	</script>

</body> 
</html>    */
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		String url = "file:///C:/Users/SONY/Desktop/Visibilityoftext.html";
		driver.get(url);
		
		//In this program we are writing our own html script and with the custom wait we are trying to send a
		//key while it loads
		
		
		WebDriverWait wait = new WebDriverWait(driver, 1);
		        wait.until(new ExpectedCondition<Boolean>() {
        	
        	public Boolean apply(WebDriver driver) 
        	{
              return driver.findElement(By.xpath("//input[@id='iamtextbox']")).isDisplayed();
                        
        	}
        });
        driver.findElement(By.xpath("//input[@id='iamtextbox']")).sendKeys("i am text box");
    		

	}

}
