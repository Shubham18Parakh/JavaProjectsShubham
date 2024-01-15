package constructoruse;

public class Sample {
	
	String name;  // variable declaration part 
	int id;
	char gender;
	float avg_marks;
	
	
	
	public Sample ()
	{
		name= "Vikas"; // intializing variable 
		id =1245;
		gender='M';
		avg_marks= 95.5f;
		System.out.println("HI This is constructor");
			
	}
	
	
	public void Sample() // zero parameter non static method
	{
		System.out.println("my name is " + name);
		System.out.println("my id is " + id);
		System.out.println("my gender is " + gender);
		System.out.println("my avg_marks is " + avg_marks);
	}
	public Sample (String name) // single parameter
	
	{
	 System.out.println("my name is " + name);
	}
	
	

	public static void main(String[] args) {
		
		Sample s1= new Sample();
	         s1.Sample();
				
		Sample s2= new Sample ("Vikram");
				s2.Sample();
	

	}

}
