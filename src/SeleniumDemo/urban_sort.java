package SeleniumDemo;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class urban_sort {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String url = "https://www.urbanladder.com/";
		driver.get(url);
		Thread.sleep(10000);
		
		//for closing pop up
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile'22222222222222222222222222222222]")).click();
		Thread.sleep(2000);
		
		
		
		Set<Integer> set=new TreeSet<>(); // tree set for sorting ,DNSO
		
		List<WebElement> menus=driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li")); // for the menus
		Thread.sleep(2000);
		
		Actions a=new Actions(driver); // for performing mouse hover
		
		  for(WebElement menu:menus)
		  {   
			
			String name=menu.getText();
			Thread.sleep(2000);  
			
			
			
			if(name.equals("Living"))
			{
				a.moveToElement(menu).perform(); //performing mouse hover on the main menus
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//a[text()='Sofa cum Bed']")).click(); ///clicking on the sofa cum bed sub menu
				Thread.sleep(4000);
				
				driver.findElement(By.xpath("//img[@alt='Sofa cum Beds']")).click(); //clicking on the first option
				Thread.sleep(4000);
				
				// performing on the second tab a s the control goes there
				Set<String> wins = driver.getWindowHandles();
				for (String win : wins) 
				{
					
					driver.switchTo().window(win);
					Thread.sleep(4000);
				}
				
				//xpath of the prices
				List<WebElement> fetch=driver.findElements(By.xpath("//div[@class='price-number']/span/ancestor::li[@class='product hovercard']"));
				
				
				
				for(WebElement f:fetch)
				{
					
					//removing the special characters
					String p=f.getText();
					String r = p.replaceAll("[,₹]","");  
					
					
					// adding it to the set
					set.add(Integer.parseInt(r));
					Thread.sleep(4000);
					
				}
				
				for(Integer d:set)
				{
					//printing the set
					System.out.println(a); 
					
				}
				
				
				String o=set.get(0); // getting the first element by price comparision and putting it to the xpath
				driver.findElement(By.xpath("//div[@class='"+o+"']/span/ancestor::li[@class='product hovercard']")).click();
					
				
				
			 break;	
			 }
			
			
			
			// else part not required though
			else
			{
				System.out.println("false");
			}
			
			
		  }}

}
