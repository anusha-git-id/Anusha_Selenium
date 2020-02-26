package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		WebElement fCheckbox=driver.findElement(By.xpath("(.//input[@value='red'])"));
		      
	fCheckbox.click();
		WebElement sCheckbox=driver.findElement(By.xpath("(.//input[@value='yellow'])"));
	sCheckbox.click();
		
		if((fCheckbox.isSelected())&&(sCheckbox.isSelected()))
				{
					System.out.println("Both are checked");
				}
		else if(!(fCheckbox.isSelected()))
		{
			System.out.println("first check is not selected...so selecting it");
			fCheckbox.click();
		}
		if(!(sCheckbox.isSelected()))
		{
			System.out.println("second check box is not selected....seo selecting it");
		        sCheckbox.click();
		}
		//radio button code to check whether third button is seleted or not
		WebElement radioButton=driver.findElement(By.xpath("(.//input[@name='browser'])[3]"));
		if(radioButton.isSelected())
		{
			System.out.println("third is  selected");
			
		}
		else
		{
			System.out.println("not ckecked.so checking");
			radioButton.click();
		}
		}
				
		}
		
	

