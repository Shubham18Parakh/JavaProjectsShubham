package absractclass;

public class Con_Use extends Sample  {

	public static void main(String[] args) {
		
	Con_Use cs=new Con_Use();
	cs.test1();//calling method from abstract class --->completed in sample(abstract class)
	cs.testm();//calling method from astract class completed in sample(abstract class)
	cs.test2();//calling method from concrete class completed comlpeted in concerete class(method from sample class)
	cs.test3();//calling method from concerte class completed in concrete class(method from concerte class
	}

	@Override
	public void test1() {
	System.out.println("This is abstract incomplete method test 1 complete in concrete class");
		
	}

	@Override
	public void test2() {
		System.out.println("This is abstract incomplete method test 2 complete in concrete class");
		
	}
	public void test3() {
		System.out.println("This method test4 IS Completed in concerete class own");
	}

}
