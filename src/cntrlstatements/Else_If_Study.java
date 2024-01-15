package cntrlstatements;

public class Else_If_Study {

	public static void main(String[] args) {

		
		//if my gender is M then i am Male
		//else my gender is F I am a female
		//else please enter gender value either M Or F 
		
		char gender='X';
		if(gender=='M') {
			System.out.println(" I am a Male");
		}
		else if(gender=='F') {
			System.out.println(" I am a female ");
		}
		else {
			System.out.println("please enter valid gender value either M or F");
		}
		System.out.println("==========================================");
		
		//if my marks are greater then or equal to 80 and less then equal to 100----> i am in distinction
		//else if marks >=66  and marks<80------> i am in first division
		//else if marks>50 and <66-----> i am in 2nd division
		//else if marks>35 and <50----->i am just pass 
		//else marks <35 then --------------i am fail
		
		
		int marks =33;
		if (marks>=100) {
			System.out.println("please enter valid marks should be below 100");
		}
			else if(marks>80 && marks<=100)
			{
			System.out.println("i am in distinction");
				
			}
			else if(marks>=66 && marks<80)
			{
				System.out.println("i am in 1st division");
			}
			else if(marks>=50 && marks<66)
				{
					System.out.println("i am in 2nd division");
				}
			else if(marks>=35 && marks<50) {
				System.out.println("i am just pass");
				}
			else {
				System.out.println("I am Fail");
			}
		
		

		
		
		
		
		
		
		
		
		
		

	}

}
    