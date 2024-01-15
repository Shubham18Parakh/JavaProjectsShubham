package interfacestudy;

public class B implements MyInterface{

	public static void main(String[] args) {
		B b=new B();
		b.test();
		System.out.println(" value of a is " + a);

	}

	@Override
	public void test() {
		System.out.println(" test method completed in implementation");
		
	}

}
