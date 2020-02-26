package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ItemExistOrNot {

	public static void main(String[] args) {

			WebDriver driver=new ChromeDriver();
			driver.get("http://amazon.in");
			
			WebElement dropDown=driver.findElement(By.id("searchDropdownBox"));
			Select sel=new Select(dropDown);
			List<WebElement> items=sel.getOptions();
			System.out.println(items.size());
			for(int i=0;i<items.size();i++)
			{
				
				if(items.get(i).getText().equals("Books"))
				{
					System.out.println("Item found");
					i=items.size()+1;
				}
				
				else if(i>=items.size()-1)
				{
					System.out.println("Item not found");
				}	
			}
	}
	
}