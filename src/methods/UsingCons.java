package methods;

public class UsingCons {
	
	int a; // variable Declaration part
	int b;
	int c;
	
	public UsingCons()//user defined constructor without parameter
	{
		a=100; // assigning values to  variables
		b=20;
		c=10;
		System.out.println("using of constructror");
	}
	public void addition()
	{
		int sum= a+b+c;
		System.out.println("value of sum is " + sum);
	}
	public void substraction ()
	{
		int sub =a-b-c;
		System.out.println("value of sub is " + sub);
		System.out.println("value of a is "+ a);
		System.out.println("value of b is "+ b);
		System.out.println(" value of c is " + c);
	}  
	public void addition(int x)//user defined single parameter constructor
	{
		a=x;
		int sum= x;
		System.out.println("Constructor with single parameter");
		System.out.println("value of sum  is " + sum);
		
		
	}
	public void substraction( int x ,int y)//user defined two parameter constructor
	{
		b=y;
		int sub = x-y;
		System.out.println("=====================");
		System.out.println("constructor with two parameter");
		System.out.println("value of sub is " + sub);
		System.out.println("value of a is " + x);
		System.out.println("value of b is " + y);
	   
	}
	public void multiplication (int x, int y,int z)//user defined three parameter constructor
	{
		c=z;
		int mul=x*y*z;
		System.out.println("=====================");
		System.out.println("constructor with three parameter");
		System.out.println("value of multiplication is " + mul);
	   System.out.println(" value of a is " + x);
	   System.out.println(" value of b is " + y);
	   System.out.println(" value of c is " + z);
	   System.out.println("==========================");
	   
	   
	   
	}

	public static void main(String[] args) {
		UsingCons us=new UsingCons();
		us.addition();
		us.substraction();
		System.out.println("=====================");
		UsingCons us1=new UsingCons();
		us1.addition(25);
		us1.substraction(25, 20);
		us1.multiplication(25, 20, 30);

	}

}
