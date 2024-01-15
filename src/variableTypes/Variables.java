package variableTypes;

public class Variables {
	
	
	
	int a=100; //non static global variable
	 static int b=200;//static global variable

	public static void main(String[] args) {
		//calling global variables from same class
		//if want to call non static global variable from same class
		//calling type --->objectName.variableName
		
		Variables su=new Variables();//  creating object for non static global
		System.out.println("A value is " + su.a );//calling non static global variable from same class
		
		
		//if want to call static global variable from same class
		//calling type---->VriableName
		System.out.println("B value is " + b );//calling  static global variable from same class

		
		//calling global variable from another class
		//if want to call non static global variable from another class--> 
		//calling type-->objectName.variablename
		
		Tester1 su1=new Tester1();//creating object for non static global variable from other class
		System.out.println("X value is " + su1.x);
		//if we want to call static global variable from other class 
		//calling type---->classname.variablename
		System.out.println("Y value is " + Tester1.y);
		
	
	
	}

}
