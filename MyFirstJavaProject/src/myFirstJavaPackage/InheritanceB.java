package myFirstJavaPackage;

public class InheritanceB extends InheritanceA
{
             String Day="monday";
	public InheritanceB(String name, String branch, String cource, int no) {
		super(name, branch, cource, no);
		
	}
	
	
	public static void main(String[] args) {
		InheritanceB b=new InheritanceB("anu","cse","java",1);
		System.out.println(b.Day);
		System.out.println(b.name);
	}
	
	

	
	
}
