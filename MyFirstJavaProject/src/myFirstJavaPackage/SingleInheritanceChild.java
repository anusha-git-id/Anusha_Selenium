package myFirstJavaPackage;

public class SingleInheritanceChild extends SingleInheritanceParent
{
	
	String name="child class";
	
	
	public void childMethod()
	{
		System.out.println("I am child method");
		System.out.println(name);
		System.out.println(super.name);//parent class name variable
	}
	
	public static void main(String[] args) {
		
		SingleInheritanceChild sic=new SingleInheritanceChild();
		sic.parentMethod();
		sic.childMethod();
		System.out.println(sic.name);
		//System.out.println(super.name);
		
	}

}
