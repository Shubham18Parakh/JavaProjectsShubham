package cntrlstatements;

public class Switch_Break {

	public static void main(String[] args) {
		// write a program that takes a day of the weeks input and uses a switch statement 
		//to display a message whether its a weekend or a weekend Day

		int day = 7;
		
		switch(day) {
		case 1:
			System.out.println(" MONDAY");
			break;
		case 2:
			System.out.println("TUESDAY");
			break;
		case 3:
			System.out.println("WEDNESDAY");
			break;
		case 4:
			System.out.println("THURSDAY");
		break;
		case 5:
			System.out.println("FRIDAY");
         break;
	   default:
			System.out.println("WEEKEND");
		
		}
		
		
	}
	

}
