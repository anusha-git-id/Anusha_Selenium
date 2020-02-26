package expectionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		
		
		File f=new File("C:\\Users\\Anusha\\Desktop\\1.txt");
		
		try
		{
			FileInputStream fis=new FileInputStream(f);
			fis.read();
			fis.close();
		}
		//catch( FileNotFoundException e) {
			//e.getMessage();
		//} 
	catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("file opened successfuly");
	}

}
