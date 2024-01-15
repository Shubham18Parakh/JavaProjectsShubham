package methods;

public class SumSub {

	public static void main(String[] args) {
		//className objectName=new className
		SumSub mathopr=new SumSub();
		mathopr.addition();
		mathopr.substraction(40,20);
        mathopr.addition(90, 60);
	}
	public void addition()//non static method without parameter
	{
		int a;
		int b;
		a=50;
		b=30;
		System.out.println("Addition of a+b");
		System.out.println(a+b);
	}
   public void substraction(int a,int b)//non static method with parameter
   {
  
   int sub;
   sub=a-b;
   System.out.println("substraction of "+ sub);
  
   }
   public void addition(int a,int b)//non static method with parameter
   {
	   int sum;
	   sum=a+b;
	   System.out.println("addition of "+sum);
   }
}
