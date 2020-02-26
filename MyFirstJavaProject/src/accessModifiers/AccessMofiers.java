package accessModifiers;

public class AccessMofiers {
	
	public int x=100;
	private String we="hello";
	protected double y=12.23;
	boolean m=true;
	
	public static void main(String[] args) {
	
		AccessMofiers af=new AccessMofiers();
		System.out.println("current class calls");//in same class we can call all variables
		System.out.println(af.x);
		System.out.println(af.we);
		System.out.println(af.y);
		System.out.println(af.m);
		
	}

}
