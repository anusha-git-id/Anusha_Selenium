package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;


public class SeleniumClass {
	
	public static void main(String[] args) {
		
			ProfilesIni fp=new ProfilesIni();
			//ProfilesIni is a class which contains methods to retrieve profiles from firefox
			FirefoxProfile pf=fp.getProfile("anusha");
			//FirefoxProfile is a returntype for getprofile method 
			   //getProfile() is method...its parameter i.e input is string type and 
			//its output parameter i.e return type is Firefoxprofile
			//output is stored in pf.
		
		WebDriver driver=new FirefoxDriver(pf);
		//
		//here web driver is interface ...firefoxdriver is a class which implements interface webdriver
		driver.manage().window().maximize();
		//by default the browser window will be minimum.to open it maximum we use above maximise()method.manage and window are inner interface of webdriver. 
		
		WebDriver driver1=new ChromeDriver();
		driver1.get("http://naukri.com");
		driver1.close();
		driver1.quit();
		 
		
		 driver.get("http://google.com");
		 
		 driver.get("http://facebook.com");
		 //this will open in the same browser
		 
		 driver.navigate().back();
		 //will go to previous page
		 
		 driver.navigate().refresh();
		 
		 driver.navigate().forward();
		 //will go to next page.
		 
		 driver.close();
		 driver.quit();
		
	}

}
