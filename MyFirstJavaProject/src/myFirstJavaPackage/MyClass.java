package myFirstJavaPackage;

public class MyClass {
	
		
		int a=10;
		String str="hello java";
		double d=1.5;
		boolean b=true;
		char c='a';
		public void addMethod()
		{
			int a=10;
			int b=20;
			int c=a+b;
			
		}
		public int addMethod2(int a,int b) {
			int c=a+b;
			return c;
 		}
		
		public boolean addBoolean(boolean b1,boolean b2) {
			boolean b3=b1==b2;
			return b3;
			
		}
		public String addString(String s1,String s2) {
			String s3=s1+s2;
			return s3;
		}

		public static void main(String[] args) {
			MyClass obj1=new MyClass();
			int ans=obj1.addMethod2(30, 20);
			String concat=obj1.addString("anusha", "vuppala");
			boolean result=obj1.addBoolean(true, false);
			
			
		          System.out.println(ans);
		          System.out.println(concat);
		          System.out.println(result);
		}
	}



