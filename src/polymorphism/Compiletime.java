package polymorphism;

public class Compiletime {

	public static void main(String[] args) 
	{
	Compiletime ct=new Compiletime();
	ct.addition();
	ct.addition(20, 30);
	ct.addition(12.5f, 10);
    ct.addition(38.5f, 11.5f);
	}
public void addition() 
{
	int a=10;
	int b=20;
	int sum= a+b;
	System.out.println("addition of sum is " + sum);
	
}
public void addition(int a,int b) 
{
	
	int sum=a+b;
	System.out.println("addition of sum is " + sum);
	
}
public void addition (float a, int b) 
{
	float sum = a+b;
	System.out.println("addition of sum is " + sum);
}
public void addition (float a,float b) 
{
	float sum =a+b;
	System.out.println("addition of float is " + sum );
}
}
