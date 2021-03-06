package SeleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class slctMulty {

	public static void main(String[] args) throws InterruptedException {
		//This is the html code to be used while developing the program!
/*<html>
<body> 
        <select id="a"> 
             
            <option value="123">123</option> 
            <option value="124">124</option> 
            <option value="125">125</option> 
            <option value="126">126</option> 
            
        </select> 
<br>
</br>
  <select id="b" multiple> 
             
            <option value="321">321</option> 
            <option value="322">322</option> 
            <option value="323">323</option> 
            <option value="324">324</option> 
            
        </select> 
    </body> 
</html>    */
		
		
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		String url = "file:///C:/Users/SONY/Desktop/slct.html";
		driver.get(url);
		Thread.sleep(2000);

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//// to select multiple values from the created html that sir has provided
		

		WebElement ele = driver.findElement(By.xpath("//select[@id='b']"));
		
		Select d = new Select(ele);
		if(d.isMultiple())//returns bool
		{
		
			List<WebElement> vals = d.getOptions();// fetching and storing
		
			for (WebElement val : vals)
			{
				System.out.println(val.getText());
				d.selectByVisibleText(val.getText());
				
			
		    }
			
		}
		List<WebElement> so = d.getAllSelectedOptions();
		for(WebElement a:so)
			
		{
			System.err.println(a.getText());
			
		}
	
		
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//to select the multiple values by indexes lets say a[0] and a[2]
		WebElement ele1 = driver.findElement(By.xpath("//select[@id='b']"));
		Select d1 = new Select(ele1);
		if(d1.isMultiple())
		{
			List<WebElement> vals1 = d1.getOptions();
			d1.selectByValue(vals1.get(0).getText());
			d1.selectByValue(vals1.get(2).getText());
			System.out.println(vals1.get(0).getText()+""+vals1.get(2).getText());
		}
	
	}

}
