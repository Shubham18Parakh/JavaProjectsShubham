package cntrlstatements;

public class NestedUse {

	public static void main(String[] args) {
		
		//store email id and password 
	String email_id="Jainshubh18@gmail.com";
	String password="Parakh95@";
	
	if(email_id=="Jainshubh18@gmail.com"){//outer
		System.out.println("please enter password");
	if(password=="Parakh95@") { //inner
	System.out.println("welcome to home page");
	System.out.println();
	}
   else{ //inner
		System.out.println("please enter correct password");
	}
	}
	else { //outer
 System.out.println("please enter correct email id");
	}
	}

}

