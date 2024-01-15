package methods;

public class StaticMethodCallFromSameClass {

	public static void main(String[] args) {
		//How To Call Static Regular Method From Same Class
		//method Name ();
		//
		test();
		test1();
		sample();
		sample();
		test2();
	    }
	public static void test() //complete static regular method
	{
		System.out.println("HI this is static regular method test");
	}
	public static void test1() //complete static regular method
	{
		System.out.println("HI this is static regular method test1");
	}
	public static void sample()
	{
		System.out.println("HI this is static regular method sample");
	}
	public static void test2()
	{
		System.out.println("HI this is static regular method test2");
	}
}
