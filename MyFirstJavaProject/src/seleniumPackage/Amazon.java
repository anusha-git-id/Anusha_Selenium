package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	
	public static void main(String[] args) {
		
	
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://amazon.com");
	
	    WebElement wb=driver.findElement(By.id("twotabsearchtextbox"));
	    	wb.sendKeys("phone cases for iphone 7plus");
	    	
	    	//WebElement wb1=driver.findElement(By.xpath("(.//span[@class='nav-search-submit-text nav-sprite'])"));
	    	//wb1.click();
	    	WebElement wb1=driver.findElement(By.className("nav-input"));
	    	wb1.click();
	    	
	    	WebElement wb2=driver.findElement(By.xpath("(.//span[@class='a-size-base-plus a-color-base a-text-normal'])[2]"));
	    	wb2.click();
	    	
	    	WebElement wb4=driver.findElement(By.xpath("(.//img[@class='imgSwatch'])[4]"));
	    	
	    	wb4.click();
	    	WebElement wb3=driver.findElement(By.className("a-dropdown-prompt"));
	    	
	    	//Select quantity=new Select(wb3);
	    	
	    	
	    		    	    	
	    	WebElement wb5=driver.findElement(By.xpath("(.//input[@name='submit.add-to-cart'])"));
	    	wb5.click();
	    	
	    	
	    	
}
	
}