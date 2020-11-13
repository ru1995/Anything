package SeleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dslct {

	public static void main(String[] args) throws InterruptedException {
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
				
				d.selectByVisibleText(val.getText()); //selectiong 1 by 1 by text that is returning
				
			
		    }
			d.deselectAll();
			d.deselectByVisibleText(vals.get(2).getText());
		
}}}
