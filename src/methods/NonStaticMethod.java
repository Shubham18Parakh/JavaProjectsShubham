package methods;

public class NonStaticMethod {

	public static void main(String[] args) {
		// calling static method from same class
		//To call non static method we need a object
		//how to a create object //className object=newclassName
		
          NonStaticMethod stadium =new NonStaticMethod();
          //how to call non static method -->objectName.methodName();
          stadium.test1();
	}
	public void test1()
	{
		System.out.println("This is non static method from same class");
	}
    public void test2()
    {
    	System.out.println("This is non staic method from same class");
    }
}
