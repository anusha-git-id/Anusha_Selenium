package stringMethods;

public class StringMethods {
	
	
	public static void main(String[] args) {
		
		
		String str="discovere";
		String str1="world";
		String str2="we in the in the world in the sea";
		
		
		int strLength=str.length();
		System.out.println(strLength);
		
		char character=str.charAt(4);
		System.out.println(character);
		
		String concatString=str.concat(str1);
		System.out.println(concatString);
		
				
		int index=str.indexOf("r");
		System.out.println(index);
		
		String newString=str.replace('r', 'R');
		System.out.println(newString);
		
		String result=str2.replace("in", "IN");
		System.out.println(result);
		
		int ch=str.lastIndexOf('e');
		System.out.println(ch);
		
		int r=str2.lastIndexOf("in");
		System.out.println(r);
		
		int re=str.lastIndexOf('e', 2);
		System.out.println(re);
		
		str.compareTo("str1");
	}
 
}
