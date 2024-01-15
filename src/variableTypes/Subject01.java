package variableTypes;

public class Subject01 {
	
	int a=50;//global variable declaration
	int b= 70;
	
	

	public static void main(String[] args) {
		
	Subject01 s1=new Subject01();
			s1.addition();
			s1.substraction();
			Strong s=new Strong();
			System.out.println("my rollnumber is" + s.rollno);
	}
	public void addition()
	{
		int x =20;
		int sum = a+x; //ussage of global variable in method
		System.out.println("value of sum is " + sum);
	}
	public void substraction()
	{
		int sub = b-a;//using global variable in method
		System.out.println("value of sub is " + sub);
	}

}
