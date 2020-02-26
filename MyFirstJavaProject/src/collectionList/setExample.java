package collectionList;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setExample {
	
	public void activeWindow(WebDriver driver,String activeWindowName)
	{
		Set<String> ids=driver.getWindowHandles();
		for(String id:ids)
        {
      	  driver.switchTo().window(id);
      	  String title=driver.getTitle();
      	 // System.out.println(title);
      	  if(title.equals(activeWindowName))
      	  {
      		  driver.manage().window().maximize();
      		 driver.findElement(By.xpath(".//*[@alt='Croma']")).click();
      		 
      	  }
        }
		
	}
	
   public void closeWindow(WebDriver driver,String window)
   {
	          Set<String> ids=driver.getWindowHandles();   
	          for(String id:ids)
	          {
	        	  driver.switchTo().window(id);
	        	  String title=driver.getTitle();
	        	  if(title.equals(window))
	        	  {
	        		  driver.close();
	        	  }
	          }
   }

	
	public static void main(String[] args) throws InterruptedException {
		setExample se=new setExample();
		WebDriver driver=new ChromeDriver();
		driver.get("http://naukri.com");
		se.activeWindow(driver, "Croma");
		Thread.sleep(6000);
		se.closeWindow(driver, "Croma");
		se.closeWindow(driver, "Tech Mahindra");
		driver.quit();
		
		
		
	}
}
