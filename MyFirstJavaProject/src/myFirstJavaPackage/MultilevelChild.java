package myFirstJavaPackage;

public class MultilevelChild extends MultilevelParent
{
	String name="child class";
	
	public void childMethod ()
	{
		System.out.println("I am child");
		System.out.println(name);
		System.out.println(super.name);//super can be used to refer immediate parent class instance variable.
		//so here it takes name from parent class not grandparent class
	}
	
	
	
	public static void main(String[] args) {
		
		MultilevelChild child=new MultilevelChild();
		child.gParentMethod();
		child.parentMethod();
		child.childMethod();
		
	}

}
