package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {

	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://ebay.com");
		
		
		WebElement wb=driver.findElement(By.xpath("(.//input[@class='gh-tb ui-autocomplete-input'])"));
		//WebElement wb=driver.findElement(By.className("gh-tb ui-autocomplete-input"));
		wb.sendKeys("mobiles");
		
		WebElement wb1=driver.findElement(By.xpath("(.//input[@class='btn btn-prim gh-spr'])"));
		wb1.click();
		
		
		WebElement wb2=driver.findElement(By.xpath("(.//h3[@class='s-item__title s-item__title--has-tags'])[3]"));
		wb2.click();
		
		
		
		
		
	}
}
