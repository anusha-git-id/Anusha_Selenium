package accessModifiers;

public class AccessChild {
	
	public static void main(String[] args) {
		
		AccessMofiers af=new AccessMofiers();
		//AccessChild ac=new AccessChild();
	    System.out.println(af.m);//can call default value in other class in same package but not in other package
	    System.out.println(af.y);//can call protected variable in other class and in same package.yes in other package but we need to inherit
	    System.out.println(af.x);//can call public value in other class in same package and also in other package
	    	}

}
