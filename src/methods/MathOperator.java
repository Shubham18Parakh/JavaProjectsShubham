package methods;

public class MathOperator {

	public static void main(String[] args) 
	{
		
MathOperator mo=new MathOperator();
mo.addition();
mo.addition();
mo.adition(10, 20, 30);
mo.substraction(30, 20);
mo.adition(10, 200, 40);
	}
	public void addition()
	{
		int a;
		int b;
		int sum;
		a=40;
		b=20;
		sum= a+b;
		System.out.println("addition is "+sum);
	}
	public void adition (int a,int b, int c)
	{
		int sum=a+b+c;
		System.out.println("addition is sum "+sum);
		
	}
	public void substraction(int a,int b)
	{
		int sub;
		sub=a-b;
       System.out.println("subsraction is "+sub);
	}
	}


