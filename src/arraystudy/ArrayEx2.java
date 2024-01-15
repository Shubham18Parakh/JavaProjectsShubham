package arraystudy;

import java.util.Arrays;

public class ArrayEx2 {

	public static void main(String[] args) {
	
		
		//Do remember --->Array[] can be written in front of varaible as well as datatype.
		
		//I want to store students names
		
		String names[]=new String[5];  //String aaray
		
		//if you want to store mobile number of students
		int [] mobilenum=new int[10];   // int array
		
		//if you want to store gender -----> M F T   //char aaray
		 char[]gender=new char[3];
		 
		 
		 //i want to store players 
		 
		 String[] players=new String[10];  // array decleration part
		 
		players[0]="Virat";
		players[1]="Viru";
		players[2]="Virendra";   // intialzation part
		players[3]="Rohit";
		players[4] = "Gill";
		System.out.println(players[0]);
		System.out.println(players[1]);
		System.out.println(players[2]);
		System.out.println(players[3]);
		System.out.println(players[4]);
		System.out.println(players[5]);
		
		System.out.println("======================");
		
		//i want to store rollnumber of 5 people
     
		int[] rollNum=new int[10];
		rollNum[0]=10;
		rollNum[1]=20;
		rollNum[2]=30;
		rollNum[3]=40;
		rollNum[4]=50;
		System.out.println(rollNum[5]);
		
		for(int i=0; i<=rollNum.length-1; i++)
		{
			System.out.println(rollNum[i]);
			//System.out.println(rollNum.length);
			
		}
		System.out.println("==============");
		for(int i=0; i<=4; i++) 
		{
			System.out.println(rollNum[i]);
		}
		//I want to store alphabet
		System.out.println("==============");
		char[]alphabet= {'A','B','C','D'};
		
		for(int i=0; i<=3; i++) {
			System.out.println(alphabet[i]);
		}
		System.out.println("===================");
		for(int i=0; i<=alphabet.length-1; i++) 
		{
			System.out.println(alphabet[i]);
		}
		
		System.out.println("=======");
		for( int i=alphabet.length-1;i>=0; i--) 
		{
			System.out.println(alphabet[i]);
		}

    //I want to print albhabet in accending and decending order
		System.out.println("================");

		char[]alpha= {'X','H','C','M','S','Q'};
		Arrays.sort(alpha); //we stored array class as alpha
		System.out.println("accending order");
		for(int i=0; i<=alpha.length-1; i++)
		{
			
			System.out.println(alpha[i]);
		}
		System.out.println("====================");
		System.out.println("decending order");
		for(int i= alpha.length-1; i>=0; i--) 
		{
			
			System.out.println(alpha[i]);
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
