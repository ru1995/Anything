package SeleniumDemo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class fb_Scrnshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String url = "https://www.facebook.com/";
		driver.get(url);
		
		
		//Convert web driver object to TakeScreenshot

        TakesScreenshot ts =(TakesScreenshot) driver;

        //Call getScreenshotAs method to create image file

         File sShot=ts.getScreenshotAs(OutputType.FILE);

         //Move image file to new destination

         File sShotSave=new File("./Screeshot/fb.png");

         	//Copy file at destination

          Files.copy(sShot, sShotSave);


	}

}
