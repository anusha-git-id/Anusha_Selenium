package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebelementsIdentification {
	
	
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		/*driver.findElement(By.name("q")).sendKeys("vijay devarakonda");
		//driver.findElement(By.className("Tg7LZd")).click();
		
		driver.get("http://www.voot.com");
		driver.findElement(By.className("MuiTab-label-325")).click();
		//driver.findElement(By.className("jss64 jss441")).click();
		
		driver.get("http://www.ebay.com");
		driver.findElement(By.id("gh-ac")).sendKeys("mobiles");
		driver.findElement(By.id("gh-btn")).click();*/
		
		driver.findElement(By.name("q")).sendKeys("MindQ Systems");
		//driver.findElement(By.name("btnG")).click();
		
		
		
	}
	
	

}
