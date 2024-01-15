package accesifier;

public class PubAcce1 {
	private int a=20;
	int b= 40;
	protected int c=50;
	public int d=40;
	
	
	
	 private void test1()//non static method
	{
		System.out.println("private method visible within class only");
	}
	 void test2()//default non static method
	 {
		 System.out.println("default method only visible within package only");
	 }
	 protected void test3()//protected non static method
	 {
		 System.out.println("protected method within package and outside of package using inheritence concept");
	 }
	 public void test4()//public non static method
	 {
		 System.out.println("public method visible within the project");
	 }

public static void main(String[] args) {

	PubAcce1 p1= new PubAcce1();
			System.out.println("value of a is " + p1.a);//calling private member within the class 
            System.out.println("value of b is " + p1.b);//calling default member in same class
            System.out.println("value of c is " + p1.c);//calling protected member within the package
            System.out.println("value of d id " + p1.d);//calling public member of class
            
            System.out.println("=====================================");
     p1.test1();
     p1.test2();
     p1.test3();
     p1.test4();
	}

}
