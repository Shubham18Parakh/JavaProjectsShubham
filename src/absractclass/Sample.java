package absractclass;

public abstract class Sample {

	public static void main(String[] args) {
		//Sample s=new Sample(); abstract class me object create nhi ho skta hai
		
		
	

	}
	public void testm() //non static complete method
	{
		System.out.println("This is test m complete method completed in sample class");
	}
	//public abstract void test();<---->//public static void test();
	//we cant call static method in abstract class becasue it becomes non static 

	public abstract void test1();//change method as a abstract method,class need do as abstract
	public abstract void test2();//only method declration part

}
