package dataType;

public class Students_Info {

	public static void main(String[] args) {
		//multiple data type use in a single class
		//dataType-> String,char,float,int,boolean
		
		//1.Variable Declaration
		//name,gender,average_result,marks,result_status
		
		String name;
		char gender;
		float avg_result;
		int marks;
		boolean result_status;
		
		//2.Assigning value to variable
		 name="Shubham";
		 gender='M';
		 avg_result=98.6f;
		 marks=85;
		 result_status=true; //true-->pass
		 
		 //Usage
		 System.out.println("===========================");
		 System.out.println("My name is "+ name );
		 System.out.println("My gender is "+ gender);
		 System.out.println("My average result is "+ avg_result);
		 System.out.println("My marks are " +marks  );
		 System.out.println("My passing status is " + result_status);
		 System.out.println("============================");
	}
	

}
