package methods;

public class StudentInfo {

	public static void main(String[] args) 
	{
	
		StudentInfo SI=new StudentInfo();
		SI.studentInfo();
		SI.studentinfo("Sheru", 10, 'M', 88.5f);
		SI.studentinfo("Kamal", 20, 'M', 90.5f);

	}
	public void studentInfo()//non static method //without parameter
	{
		String name;
		int rollNumber;
		char gender;
		float avg_result;
		
		name="virat";
		rollNumber=10;
		gender= 'M';
		avg_result=88.5f;
		
		System.out.println("Hi my name is "+ name);
		System.out.println("My rollNumber is " + rollNumber);
		System.out.println("My gender is "+ gender);
		System.out.println("My average result is "+avg_result);
		System.out.println("==================================");
		
	}
  public void studentinfo(String name,int rollNumber,char gender,float avg_result)//method with parameter
  {
	 
	    System.out.println("Hi my name is "+ name);
		System.out.println("My rollNumber is " + rollNumber);
		System.out.println("My gender is "+ gender );
		System.out.println("My average result is "+avg_result);
  }
}
