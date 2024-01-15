package variableTypes;

public class Testing {
	
	
	
	
	int a =90; //global variable globally known 
	int b=20;

	public static void main(String[] args) {
		Testing s1=new Testing();
		s1.demo1();
		s1.demo2();
	

	}
	public void demo1()
	{
		int x=1;   //local variable because its known only within method local level
		int y=2;
		int sum = (x+a);
		System.out.println("value of sum is " + sum);
	}
	public void demo2()
	{
		int x=75;
		int y= 20;
		int sub = (x-b);
		System.out.println("value of sum is " + sub);
	}

}
