package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NeoEntLinkIdentification {
	
	public static void main(String[] args) {
		
	
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://neoent.in");
	
	//page identification
	
	String actualResult=driver.getTitle();
	System.out.println(actualResult);
	String expectedResult="NEO ENT – One Stop ENT Care";
	if(actualResult.equals(expectedResult))
	{
		System.out.println("true");
	}
	else
	{
		System.out.println("false");
	}
	
	driver.get("http://www.google.com");	
	
	WebElement link=driver.findElement(By.linkText("Gmail"));
	link.click();
	WebElement signinLink=driver.findElement(By.linkText("Sign in"));
	signinLink.click();
	
		//WebElement partialLink=driver.findElement(By.linkText("Learn more"));
	//partialLink.click();
	
	
	
	}
}
