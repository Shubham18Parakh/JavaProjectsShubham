package polymorphism;

public class Runt2 extends RunT {

	public static void main(String[] args) {
		
		RunT rt = new Runt2();
				rt.demo();
				rt.demo1();
				rt.addition(35.45d, 12);
                rt.addition(10, 40);
                rt.demo();
                rt.demo1();
	}
	public void demo() 
	{
		System.out.println(" demo method of class Run2");
	}
	public void  demo1() 
	{
		System.out.println("demo1 method of class Run2");
	}
	public void addition (double x, int y)
	{
		double sub = x-y;
		System.out.println(" value of sum is " + sub);
	}
}
