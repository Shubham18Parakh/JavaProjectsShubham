package methods;

public class MyClass3 {

	public static void main(String[] args) {
	//How to create object 	
    MyClass3 hospital=new MyClass3();//ClassName objectName=new ClassName();
     MyClass4 clinic=new MyClass4();
    //object.methodName();
    hospital.doctor();//calling non static method from same class
   hospital.patient();
    clinic.cardiology();//calling non static method from another class
    clinic.nephrology();//calling non static method from another class
   
	}
	
	public void doctor()
	{
		System.out.println("This is a method from MyClass3");//Non Static Regular Complete Method
		System.out.println("Only cardio and nephro doctors available today");
	}
	public void patient()
	{
		//System.out.println("This is a method from MyClass3");//Non Static Regular Complete Method
		System.out.println("The earlier the treatment given,the better the patients chances");
	}

}
