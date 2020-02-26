package myFirstJavaPackage;

import accessModifiers.AccessMofiers;

public class ProtectedExample extends AccessMofiers {
	
	public static void main(String[] args) {
		
		ProtectedExample pf=new ProtectedExample();
		
		System.out.println(pf.x);
		System.out.println(pf.y);//here we can only access public and protected variables of other package
		
	}
	
	
	

}
