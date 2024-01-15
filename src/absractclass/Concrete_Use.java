package absractclass;

public class Concrete_Use extends Abstract_Practice
{

	public static void main(String[] args)
	{
		Concrete_Use cr=new Concrete_Use();
        cr.sample();
        cr.test();
        cr.demo();
	}

	@Override
	public void sample() {
	
		System.out.println("this iS incompelte method SAMPLE oF ABSTRACT CLASS COMPLETED IN CONCRETE class");
	}

	@Override
	public void test() {
		
		System.out.println("this iS incompelte method TEST oF ABSTRACT CLASS COMPLETED IN CONCRETE class");
	}

}
