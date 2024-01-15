package accesefiernew;

public class Myclass1 {
	
	private int a=20;
	int b =30;
	protected int c =50;
	public int d = 40;
	
	
	
	
	
	private void demo1()
	{
		System.out.println("private method only visible within class only");
	}
	void demo2()
	{
		System.out.println("default method only visible within package");
	}
	protected void demo3()
	{
		System.out.println("protected method within package and outside of package using inheritence operations");
	}
	public void demo4()
	{
		System.out.println("public visible within the project");
	}
	
	

	public static void main(String[] args) {
	
		Myclass1 m1=new Myclass1();
		System.out.println("value of a is " + m1.a);//calling private member from same class
		System.out.println("value of b is " + m1.b);//calling default member from same class 
		System.out.println("value of c is " + m1.c);//calling protected member from same class
		System.out.println("value of d is " + m1.d);//calling public member from same class
		System.out.println("================================================================");
		
		m1.demo1();
		m1.demo2();
		m1.demo3();
		m1.demo4();
		
		
		
		
		
		
		
		
		

	}

}
