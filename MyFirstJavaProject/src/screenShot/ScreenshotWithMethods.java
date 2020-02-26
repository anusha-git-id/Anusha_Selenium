package screenShot;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ScreenshotWithMethods {
	
		public void screenshot(WebDriver driver,String filename) throws Exception
	{
		           
		File f=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//the above line is like print+screen button which we use to take screenshot
			//Now save the screenshot in some location
		FileUtils.copyFile(f, new File("E:\\"+filename+".png"));
		System.out.println("screenshot");
		}
		public void openUrl(WebDriver driver) throws Exception
		{
			
			try
			{
				driver.get("http://ebay.com");
			}
			catch(Exception e)
			{
			 this.screenshot(driver, "connectionFailed");
			}
			
		}
		public void textBox(WebDriver driver) throws Exception {
			
			try
			{
			WebElement text=driver.findElement(By.xpath("(.//input[@class='gh-tb ui-autocomplete-input'])"));
			text.sendKeys("iphone charger");
			System.out.println("entered text");
			}
			catch(Exception e)
			{
				this.screenshot(driver, "textBoxNoSuchElement");		
			}
		}
		public void dropBox(WebDriver driver,String option) throws Exception
		{
			try {
			WebElement dropBox=driver.findElement(By.xpath(".//*[@class='gh-sb gh-sprRetina']"));
			Select sel=new Select(dropBox);
			sel.selectByVisibleText(option);
			}
			catch(Exception e)
			{
			   this.screenshot(driver, "dropBoxElementNotFound");	
			}
			
		}
		public void searchBox(WebDriver driver) throws Exception
		{
			try
			{
			   driver.findElement(By.xpath(".//*[@class='btn btn-prim gh-spr']")).click();
			}
			catch(Exception e)
			{
				this.screenshot(driver, "SearchBoxNotFound");
			}
			
		}
		
		
		
      public static void main(String[] args) throws Exception {
    	  ScreenshotWithMethods ss=new ScreenshotWithMethods();
    	  WebDriver driver=null;
		  driver=new ChromeDriver();

    	  ss.openUrl(driver);
    	  System.out.println("connection opened");
    	  ss.textBox(driver);
    	  
    	  ss.dropBox(driver, "Cell Phones & Accessories");
    	  ss.searchBox(driver);
    	  System.out.println("search completed");
    	  
    	  
		
	}
}
