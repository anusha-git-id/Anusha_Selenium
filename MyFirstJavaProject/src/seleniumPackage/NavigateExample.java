package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateExample {
	
	public static void main(String[] args) {
		
		
		    WebDriver driver=new ChromeDriver();
		    
		    driver.get("http://google.com");
		    driver.findElement(By.id("gb_70")).click();//clicks on sign in link  
		    
		    driver.navigate().back();
		    driver.navigate().forward();
		  // System.out.println(driver.getPageSource());
		    
		    System.out.println(driver.getTitle());
		    
		  
		    
	}

}
