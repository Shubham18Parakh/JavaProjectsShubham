package interfacestudy;

public class Sample implements Interface2{

	public static void main(String[] args) {
		
		
		Sample s=new Sample();
		s.demo1();
		s.demo2();
		s.demo3();
		s.demo4();
		System.out.println("value of a is " + a);
		System.out.println("value of b is " + b);
		System.out.println("value of c is " + c);
	

	}

	@Override
	public void demo1() {
		System.out.println("Method demo1 completed in implementation class");
		
	}

	@Override
	public void demo2() {
		System.out.println("Method demo2 completed in implementation class");
		
	}

	@Override
	public void demo3() {
		
		System.out.println("Method demo3 completed in implementation class");
	}

	@Override
	public void demo4() {
		System.out.println("Method demo4 completed in implementation class");
		
	}

}
