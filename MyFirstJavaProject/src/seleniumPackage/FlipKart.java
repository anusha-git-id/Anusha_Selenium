package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart {

	public static void main(String[] args) {
		
	
	     WebDriver driver=new ChromeDriver();
	     driver.get("http://www.flipkart.com");
	     
	     WebElement wb=driver.findElement(By.xpath("(.//button[@class='_2AkmmA _29YdH8'])"));
	     wb.click();
	}
}
