package SeleniumDemo;

import java.awt.List;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class naukri2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//url=https://www.naukri.com/nlogin/login;
		driver.manage().window().maximize();	
		String url="https://www.naukri.com/";
		driver.get(url);
		//String parent=driver.getWindowHandle();
		//System.out.println(parent);
		
		Set<String> wins=driver.getWindowHandles();
		ArrayList<String> lst=new ArrayList<String>(wins);
//		for(int i=lst.size()-1;i>=0;i--){
//			String winhan=lst.get(i);
//			driver.switchTo().window(winhan);// in reverse order imp**
//			driver.close();
			
			
	//}
		driver.switchTo().window(lst.get(1)).close();
//unde target locator(which is present in switch to)window is present 
		//which will return web deiver
System.out.println(driver.getCurrentUrl());
	
	}}
