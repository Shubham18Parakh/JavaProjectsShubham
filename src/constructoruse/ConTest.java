package constructoruse;

public class ConTest
{

	public static void main(String[] args) {
		
		ConTest students =new ConTest();//created object of a class
		students.ConstructTest("Ram", 'M');
		ConTest students1 =new ConTest();
		students1.team("INDIA",10,1.98f);
		ConTest std2=new ConTest();
		std2.addition(50, 50);
	}
	public ConTest()
	{
	
		int a =10;
		int b=20;

		
		System.out.println(" value of the a is  "+ a);
		System.out.println("value of b is " + b );
		
		System.out.println("Hi this is constructor");
		
	}
	public void ConstructTest  (String name,char gender)
	{	
       System.out.println("my name is " + name);
	}
  public void team(String team,int jersy,float ip_adress)
  {
	  System.out.println("my tam name is "+ team);
	  System.out.println("my jersy number is "+ jersy);
	  System.out.println("my computer ip adress is " + ip_adress);
  }
  public void addition ( int a, int b)
  {    
	int sum =  a+b;
	  System.out.println("value of addition is "+ sum);
  }
}
