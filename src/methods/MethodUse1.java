package methods;

public class MethodUse1 {

	public static void main(String[] args)
	{
		MethodUse1 xyz=new MethodUse1();
		xyz.a();//calling non static method a without parameter from same class
		MethodUse1.b();//calling method b static without parameter
		xyz.c(10, 20);//calling non static method c with parameter
		d("Whitehouse",05); //calling static  method d with parameter
		
		
		
	    MethodUse2 abcd=new MethodUse2();
	    		abcd.p();////calling non static method p without parameter from another class
	    		abcd.q('M', 6.0f);//calling non static method q with parameter from another class
	    		MethodUse2.r();//calling static method r without parameter from another class
	    		MethodUse2.s(100,90 );//calling static method s with parameter from another class
	}
public void a()
{
	System.out.println("Method a is non static without parameter");
}
public static void b ()
{
	System.out.println("method b is static method without parameter");
	System.out.println("");
}
public void c(int a,int b)
{
	System.out.println("method c is non static with parameter");
	int sum = a+b;
	System.out.println("the sum of " + sum);
}
public static void d(String name ,int apartment)
{
	System.out.println("method d is static with parameter");
	System.out.println("name of the building is " + name +"number of the apartment is " + apartment);
}
}
