package polymorphism;

public class Runtime2 extends Runtime1 {

	public static void main(String[] args) {
		
		Runtime1 rn=new Runtime1();
		Runtime2 rm=new Runtime2();
           rn.test();
           
           rm.test();
           rn.display();
           rm.display();
           rn.addition(30, 20);
           rm.addition(30, 20);
           rm.show();
	}
	public void test()
	{
		System.out.println(" test method of class runtime1 calling in class runtime2");
	}
	public void show()
	{
		System.out.println("this is a method show from runtime2");
	}
	public void addition(int a,int b) 
	{
		 int sub=a-b;
		 System.out.println("method of class runtime1");
		 System.out.println("value of substraction is " + sub);
	}
	public void display()
	{
		System.out.println("method of class runtime1 calling in class runtime2");
	}

}
