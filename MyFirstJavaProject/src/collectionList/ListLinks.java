package collectionList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListLinks {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://amazon.in");
		
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("tv");
		
		WebElement enter=driver.findElement(By.className("nav-input"));
		enter.click();
		
		
		List<WebElement> tv=driver.findElements(By.xpath(".//*[@class='a-size-medium a-color-base a-text-normal']"));
		System.out.println("total tv links"+tv.size());
		List<WebElement> price=driver.findElements(By.className("a-price-whole"));
		
		for(int i=0;i<tv.size();i++) {
		
		System.out.println(tv.get(i).getText());
		System.out.println(price.get(i).getText());
		}
		}
		
				
		
		
	
}
