package cntrlstatements;

public class MarksElseIf {

	public static void main(String[] args) {

		
		//imagine you have 6 subjects nd grand total is 600
		//if your marks are greater then 540 then you got 100% scholarship
	   //else if your marks are greater then 480 but below 540 you got 50% scholarship
		//else if your marks are greater then 420 but below 480 you got 30% scholarship
		//else if your marks are greater then 360 but below 420 you got 20% scholarship
		//else if your marks are greater then 300 but below 360 you got 10% scholarship
     	//else if your marks are not more then 280 then you got zero scholarship
		
		int totalmarks=290;
		
		if(totalmarks>=480  && totalmarks<=540) {
			System.out.println("Congratulations");
			System.out.println("you got 100% scholarship");
		
		}
		else if (totalmarks>=420 && totalmarks<=480) {
			System.out.println("Congratulations");
			System.out.println("you got 50% scholarship");
		}
		
		 else if(totalmarks>=360 && totalmarks<=420) {
			 System.out.println("Congratulations");
				System.out.println("you got 30% scholarship");
		 }
		 else if (totalmarks>=300 && totalmarks<=360)
		 {
			 System.out.println("Congratulations");
				System.out.println("you got 10% scholarship"); 
		 }
		 else {
			 System.out.println("you are not eligible for scholarship");
			 System.out.println("we are really sorry for you");
		 }
		
	      }

	     	}

	     

