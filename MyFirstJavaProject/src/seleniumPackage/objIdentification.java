package seleniumPackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class objIdentification {	
		
		public static void main(String[] args) {
			
		
				
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		
		
		WebElement click= driver.findElement(By.id("gb_70"));
		click.click();


		}}
