package autoIt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoItExample {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.convertfiles.com/");
		driver.findElement(By.name("uploadedfile")).click();
		
		Runtime.getRuntime().exec("cmd /c E:\\Upload.exe");
		
	}

}
