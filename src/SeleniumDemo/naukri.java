package SeleniumDemo;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class naukri {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//url=https://www.naukri.com/nlogin/login;
		driver.manage().window().maximize();	
		String url="https://www.naukri.com/";
		driver.get(url);
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String> wins=driver.getWindowHandles();
		wins.remove(parent);
		for(String win:wins){
			System.out.println(win);
			driver.switchTo().
			driver.close();
			
		}
		}

}
