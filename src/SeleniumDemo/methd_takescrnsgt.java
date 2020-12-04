package SeleniumDemo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class methd_takescrnsgt {
	
	public static void fetch(WebDriver driver,String folder_name,String ss_name) throws IOException
	{
		TakesScreenshot ts =(TakesScreenshot) driver;

        //Call getScreenshotAs method to create image file

         File screenShot=ts.getScreenshotAs(OutputType.FILE);

         //Move image file to new destination

         File screenShotSave=new File("./"+folder_name+"/"+ss_name+".png");

         	//Copy file at destination

          Files.copy(screenShot, screenShotSave);	
	}
}
