package interfacestudy;

public class SAM implements Inter2




{

	public static void main(String[] args) {
		
		
		SAM s=new SAM();
		s.test1();
		s.test2();
		s.test3();
		s.test4();
		System.out.println("value of a is " + a);
		System.out.println("value of b is " + b);
		System.out.println("value of c is " + c);
	

	}

	@Override
	public void test1() {
		System.out.println("test1 from inter1");
		
	}

	@Override
	public void test2() {
		System.out.println("test2 from inter1");
		
	}

	@Override
	public void test3() {
		System.out.println("test3 from inter2");
		
	}

	@Override
	public void test4() {
		System.out.println("test4 from inter2");
		
	}

}
