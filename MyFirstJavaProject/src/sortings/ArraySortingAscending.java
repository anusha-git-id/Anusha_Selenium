package sortings;

public class ArraySortingAscending {
	public void ascendingSorting()
	{
		int[] intArray = { 5,3,7,2,9 }; 
		
		for (int i=0;i<intArray.length;i++)
		{
			for(int j=i+1;j<intArray.length;j++)
			{
			if(intArray[i]>intArray[j])
			{
				
				int a=intArray[i];
				intArray[i]=intArray[j];
			     intArray[j]=a;	     
		
			}
					
		}
		}
		for(int i=0;i<intArray.length;i++)
		{
		System.out.println("Final array"+intArray[i]);
		}
		
	}
	
	public void palindromeInt() {
		int original=12122;
		int a=12122;int reverse=0;
		
		for(;a!=0;a=a/10)
		{
			int remainder=a % 10;
			reverse=reverse*10+remainder;
		}
		if(original==reverse)
		{
			System.out.println("yes given no is palindrome no::"+reverse);
		}
		else
		{
			System.out.println("not palindrome");
		}
		
	}
	
	public void primeNo() {
		
	}
	
	public static void main(String[] args) {
		
	
		ArraySortingAscending sa=new ArraySortingAscending();
		sa.ascendingSorting();
		sa.palindromeInt();
	}

}
