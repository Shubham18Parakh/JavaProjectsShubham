package polymorphism;

public class CompileDynamic {

	public static void main(String[] args) 
	{
	CompileDynamic cd= new CompileDynamic();
		cd.addition();
		cd.addition(20, 30);
		cd.addition("Virat", 'M');

	}
	public void addition() 
	{
		int a=10;
		int b= 20;
		int c;
		c=a+b;
		System.out.println("addition of c is " + c);
	}
	public void addition(int a,int b)
	{
		int sum =a+b;
		System.out.println("addition of sum is " + sum);
	}
	public void addition(String name ,char gender) 
	{
		System.out.println("name is " + name);
		System.out.println("gender is " + gender);

	}

}
