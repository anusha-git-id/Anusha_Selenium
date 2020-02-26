package myFirstJavaPackage;

public class InheritanceA {
	
	String name;
	String branch;
	String cource;
	int no;
	
	public InheritanceA(String name,String branch,String cource,int no)
	{
	      this.name=name;
	      this.branch=branch;
	      this.cource=cource;
	      this.no=no;
	}

	public static void main(String[] args) {
		InheritanceA a=new InheritanceA("Anu","Madhapur","Dance fitness",30);
		System.out.println(a.no);
		System.out.println(a.branch);
	}
}
