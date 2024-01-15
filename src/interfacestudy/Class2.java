package interfacestudy;

public class Class2 implements Class1 {

	public static void main(String[] args) {
		
		Class2 cs=new Class2();
		cs.test();
		cs.test1();
		System.out.println("value of a is"+ a);
		

	}

	@Override
	public void test() 
	{
		System.out.println("method test completed in implemantation");
		
	}

	@Override
	public void test1() {
	
		System.out.println("method  test 1 completed in implemantation");
	}

}
