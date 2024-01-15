package constructoruse;

public class ConsUse {
int a;
int b;
int c;
	public ConsUse()
	{
		a=120;
		b=20;
		c=30;
	}
	public static void main(String[] args) {
		ConsUse cu=new ConsUse();
				cu.addition();
				cu.substraction();
		System.out.println("========");
		ConsUse c1=new ConsUse();
		c1.addition(20);
		c1.substraction(0, 60);
		System.out.println("===========");
		ConsUse c2=new ConsUse();
		c2.addition(10, 20, 30);
	}
	public void addition()
	{
       int sum= a+b+c;
       System.out.println("value of sum is "+sum);
      
	}
	public void substraction ()
	{
		int sub=a-b-c;
		System.out.println("value of sub is " +sub );
		 System.out.println("value of a is " + a);
	       System.out.println("value of b is " + b);
	       System.out.println("value of c is " + c);

	}
	public void addition(int x)
	{
		a=x;
		System.out.println("value of a is "+ x);
		int sum = x;
		System.out.println("value of sum is "+ sum);
	}
   public void substraction(int x,int y)
   {
	    b=y;
	   int sub = x-y;
	   System.out.println("the value of sum is "+ sub);
   }
   public void addition (int x, int y, int z)
   {
	   int sum =x+y+z;
	   System.out.println("the sum is " + sum);
	   System.out.println("value of a is " +x);
	   System.out.println("value of b is " +y);
	   System.out.println("value of c is " +z);
   }
}
