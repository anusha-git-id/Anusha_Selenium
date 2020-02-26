package myFirstJavaPackage;

public class HierarchicalChild1 extends HierarchicalParent{
String name="child one class";
	
	public void childoneMethod ()
	{
		System.out.println("I am child one");
		System.out.println(name);
		System.out.println(super.name);
	}
	public static void main(String[] args) {
		HierarchicalChild1 two=new HierarchicalChild1();
		two.parentMethod();
		two.childoneMethod();
		
		
	}
}
