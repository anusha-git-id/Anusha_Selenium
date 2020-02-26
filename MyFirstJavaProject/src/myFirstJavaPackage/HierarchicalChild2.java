package myFirstJavaPackage;

public class HierarchicalChild2 extends HierarchicalParent{
String name="child two class";
	
	public void childtwoMethod ()
	{
		System.out.println("I am child two");
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public static void main(String[] args) {
		HierarchicalChild2 two=new HierarchicalChild2();
		two.parentMethod();
		two.childtwoMethod();
		
		
	}

}
