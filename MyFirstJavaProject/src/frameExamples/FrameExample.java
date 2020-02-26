package frameExamples;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {
	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.quackit.com/javascript/javascript_alert_box.cfm");
		
		List<WebElement> frame=driver.findElements(By.className("result"));
		System.out.println(frame.size());
		
WebElement frm=		driver.findElement(By.className("result"));
		//driver.findElement(By.name("result1"));
	     // driver.switchTo().frame("result1")	;
	      //driver.switchTo().frame(1);
driver.switchTo().frame(frm);
	      driver.findElement(By.xpath(".//*[@value='Click me']")).click();
	      	//Thread.sleep(5000);
	      driver.switchTo().alert().accept();
	      
		
		
		
		
		
		
	}

}
