package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class MyExample {

	
				public static void main(String[] args) {
					
					ProfilesIni fp=new ProfilesIni();
				FirefoxProfile	 pf=fp.getProfile("anusha")	;				
					WebDriver driver=new FirefoxDriver(pf);
					driver.get("http://flipcart.com");
					driver.navigate().back();
				String currentUrl=	driver.getCurrentUrl();
				System.out.println(currentUrl);
				
			
				//String pageSource=driver.getPageSource();
				//System.out.println(pageSource);
			
				driver.close();
				driver.quit();
									}
}
