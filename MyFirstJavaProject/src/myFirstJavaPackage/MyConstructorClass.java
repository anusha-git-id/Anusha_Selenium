package myFirstJavaPackage;

public class MyConstructorClass {
	
	String studentName;
	String studentId;
	String department;
	
	public MyConstructorClass(String a,String b,String c) {
		studentName=a;
		studentId=b;
		department=c;
	}
	
	public static void main(String[] args) {
		
		MyConstructorClass cc=new MyConstructorClass("Ram","E1","ECE");
		System.out.println("The Student Details::");
		System.out.println(cc.studentName);
		System.out.println(cc.studentId);
		System.out.println(cc.department);
		MyConstructorClass c2=new MyConstructorClass("Sam","E2","CSE");
		System.out.println("The Student Details::");
		System.out.println(c2.studentName);
		System.out.println(c2.studentId);
		System.out.println(c2.department);
		
		
		
		


		
		
		
	}
	

}
