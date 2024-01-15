package arystudynew;

import java.util.Arrays;

public class MultiDimen {


	public static void main(String[] args) {
		// ||10 20||   //two dimensional aaray
		// ||30 40||
		
		int [] [] num= new int[2] [2]; //Declration part
		
		//Array Intializtion part
		num[0][0]=10;
		num[0][1]=20;
		num[1][0]=30;
		num[1][1]=40;
		System.out.println(num[0][0]);
		System.out.println(num[0][1]);
		System.out.println(num[1][0]);
		System.out.println(num[1][1]);
		System.out.println("==============="); //usage part
		System.out.print(num[0][0] + " ");
		System.out.print(num[0][1] + " ");
		System.out.print(num[1][0] + " ");
		System.out.print(num[1][1] + " ");
		

		//Use of Nested for loop //row variable name ------->i ------column variable name-----j
		
		for( int i=0; i<=num.length-1; i++)//outerfoorloop
		{
			//column inner foor loop
			for(int j=0; j<=num.length-1; j++)
			{
				
				System.out.print(num[i][j] + " ");
			}
				
		System.out.println();
		}
		System.out.println("============");
		
		//I want to store player name 
		
		String players[][] =new String[3][3];

		
		players[0][0]="ST";
		players[0][1]="MK";
		players[0][2]="MSD";
		players[1][0]="SKY";
		players[1][1]="YS";
		players[1][2]="VS";
		players[2][0]="VK";
		players[2][1]="SR";
		players[2][2]="IP";
	
	for(int i=0; i<=players.length-1; i++)
	{
		for(int j=0; j<=players.length-1; j++) 
		{
			System.out.print(players[i][j] + " ");
		}
		
		System.out.println();
	}
	}
}
	
		
		
			

	


