package this_superuse;

public class Bclas extends A{
	int a=500;//global variable of class B

	public static void main(String[] args)
	{
	Bclas B = new Bclas();
	B.display();


	}
public void display ()
{
	int a= 200;//local variable
	System.out.println("local value of a is " + a);//calling local variable
	System.out.println("Global varible of a from sameclass is " +this.a);//calling global variable of a same class
	System.out.println("global value of a from superclass is " +super.a);//calling global value of superclass
}
}
