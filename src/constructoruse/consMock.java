package constructoruse;

public class consMock {
	
	int a;// declaration part 
	int b;
	int c;
	
	public consMock()
	{
		a= 500; // intializing part
		b= 200;
		c= 50;
		System.out.println(" hi this is constructor");
	}
	public void addition ()
	{
		 int sum = a+b+c;
		 System.out.println(" value of addition is " + sum);
		 
	}
	public void subsraction ()
	{
		int sub = a-b-c;
		System.out.println(" value of substraction is " + sub);
		
	}
	public void multiplication ()
	{
		int mul = a*b*c;
		System.out.println("alue of mul is " + mul);
	}
	

	
	

	public static void main(String[] args) {
		 consMock cs= new consMock();
		 cs.addition();
		 cs.subsraction();
		 cs.multiplication();
	

	}

}
