package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YouTube {

			public static void main(String[] args) {
				
				WebDriver driver=new ChromeDriver();
				driver.get("http://www.youtube.com");
				
				WebElement txtBoxSearch=driver.findElement(By.id("search"));
				txtBoxSearch.sendKeys("vijay Devarakonda");
				
				WebElement search=driver.findElement(By.xpath("(.//yt-icon[@class='style-scope ytd-searchbox'])[1]"));
				search.click();
				
				WebElement wb=driver.findElement(By.xpath("(.//yt-formatted-string[@class='style-scope ytd-video-renderer'])[1]"));
				wb.click();
				
				
			}

}

