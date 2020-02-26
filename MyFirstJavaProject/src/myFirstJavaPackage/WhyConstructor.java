package myFirstJavaPackage;

public class WhyConstructor {
	
	String studentName;
	String studentId;
	String department;
	


public static void main(String[] args) {
	
	WhyConstructor cc=new WhyConstructor();
	System.out.println("Student Details are:");
	System.out.println(cc.studentName);
	System.out.println(cc.studentId);
	System.out.println(cc.department);
	
	
	WhyConstructor c2=new WhyConstructor();
	System.out.println("Student Details are:");
	System.out.println(c2.studentName);
	System.out.println(c2.studentId);
	System.out.println(c2.department);
}

}