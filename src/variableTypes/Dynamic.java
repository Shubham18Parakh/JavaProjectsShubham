package variableTypes;

public class Dynamic {
	int m=50;// global non static variable
	static String name="Virat";//global static variable


public static void main(String[] args) {
	
	Dynamic d1=new Dynamic();
	Strong s1=new Strong();
	System.out.println("value of m is "+ d1.m);
	System.out.println("my name is " + name);
	System.out.println("calling from diffrent class static" + Strong.name);
	System.out.println("calling non static from diffrent class" + s1.rollno );
	
	
}
	
	
		
		
		
				
		
		
	}


