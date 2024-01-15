package arraystudy;

import java.util.Arrays;

public class ArrayEx1 {

	public static void main(String[] args) {
		
//do remember --Array[] can be written infront of variable as well as infront of datatype
		
		//I want to store students names
		
		String names[]=new String[5]; //string array
		
		//if i want to store table of 2 
		int[] tableof2= new int [10];//integer aaray

		//if i want to store genders --->m >f >t 
		
		char[] gender=new char[3];//character array
		
		//i want to store players
		
		String[] player=new String[10];//aaray declearation part
		player[0] = "GILL";
		player[1]="Rohit";
		player[2]="Virat";  //intialization part
		player[3]="Kl";
		player[4]="Surya";
		
		System.out.println(player[2]);
		System.out.println(player[0]);
		System.out.println(player[1]);
		System.out.println(player[3]);
		System.out.println(player[4]);
		System.out.println(player[5]); //default value of string will come
		
		System.out.println("==============");
		
		//I want to store roll number of 5 people
		
		int[] rollNum=new int[5];  //decleration part
		rollNum[0]=10;
		rollNum[1]=20;  //intilization part
		rollNum[2]=30;
		rollNum[3]=40;
		rollNum[4]=50;
		System.out.println(rollNum[0]);  //usages
		System.out.println(rollNum[1]);
		System.out.println(rollNum[2]);
		System.out.println(rollNum[3]);
		System.out.println(rollNum[4]);
		//System.out.println(rollNum[5]); Array index outofboundsException in thred Eroor will come
        System.out.println("-----------------------");
           //we can use loops in array travercing or iterating through array
        
        //static loop
		for( int i=0; i<=4; i++) //0-->1-->2-->3--->4
		{
			System.out.println(rollNum[i]);
		}
		
		System.out.println("lenth of rollNum " + rollNum.length);
		System.out.println("--------------");
		
   
		for(int i=0; i<=rollNum.length-1; i++) 
		{
			System.out.println(rollNum[i]);
		}
		System.out.println("---------------------");
		//I want to store marks----->int
		int[]marks=new int[5];
		marks[0]=90;
		marks[1]=80;
		marks[2]=70;
		marks[3]=60;
		marks[4]=50;
		int[]marks1= {90,80,70,60,50};
     System.out.println(marks[0]);
     System.out.println(marks[1]);
     System.out.println(marks[2]);
     System.out.println(marks[3]);
     System.out.println(marks[4]);
     System.out.println("lenght of marks size " + marks.length);
     
     System.out.println(marks1.length);
     System.out.println("===========");
     
    
     
    //static loop
        for(int i=0; i<=4; i++)
     {
    System.out.println(marks1[i]);
     }
        
   //dynamic loop	
        System.out.println("=========");
        
     for(int i=0; i<=marks.length-1; i++) 
     {
    	 System.out.println(marks[i]);
     }
     System.out.println("=========");
//i want to store colors
    
     String[] colors=new String[3];
     colors[0]="Red";
     colors[1]="Green";
     colors[2]="Yello";
     //colors[3]="Brown";
     String[] colors1= {"Red","Yellow","Brown","Green"};
     System.out.println(colors1.length);
     System.out.println(colors[0]);
     System.out.println(colors[1]);
     System.out.println(colors[2]);
     System.out.println("=========");
     for(int i=0; i<=2; i++) 
     {
    	 System.out.println(colors[i]);
     }
     
     //I want to store ALphabets
     
     char[] alpha = { 'A','B','C'};
     
     //STATIC FOR LOOP
     for(int i=0; i<=2; i++)
     {
    	 System.out.println(alpha[i]);
     }
     System.out.println("==========");
     //DYNAMIC FOR LOOP
     for(int i=0; i<=alpha.length-1; i++)
     {
    	 System.out.println(alpha[i]);
    	 System.out.println("alpha of " +i+  alpha[i]);
     }
     System.out.println("===============");
		//i want to store  diffent age 
     
     int[]age= {5,10,20,4};
     System.out.println("same order printing values");

     for( int i=0; i<=3; i++)
     {
    	    	 System.out.println(age[i]);
     }
     System.out.println("=============");
     //i want to print the age values in reverse order
     System.out.println("Reverse order printing values");
		for(int i=age.length-1; i>=0; i--) 
		{
			
             System.out.println(age[i]);
		}
		System.out.println("============");
		//Array has an inbuilt method called as sorting for //assending //decending order
		Arrays.sort(age);//Using sort Method of Array Class
		System.out.println("Accending order loop by applying sort method");
		for(int i=0; i<=age.length-1; i++) //assceding order
		{
			System.out.println(age[i]);
		}
		System.out.println("-------------");
		System.out.println("Decending order loop by applying sort method");
		for(int i=age.length-1; i>=0; i--)
		{
			System.out.println(age[i]);
		}
		System.out.println("===============");
		String[] actors= {"Srk","Manoj","Nawaz","Zakir","Sunny"};
		Arrays.sort(actors);//we stored arrays class as actors
		for(int i=0; i<=actors.length-1; i++)
		{
			System.out.println(actors[i]);//accending order 
		}
		System.out.println("----------------");
		for(int i=actors.length-1; i>=0; i--)
		{
			System.out.println(actors[i]);//desscending order
			
		}
		System.out.println("===========");
	//I want to print albhabet in acceding and decending order by using sort
		
		char[]alphabet= {'B','C','F','G','M'};
		Arrays.sort(alphabet);//we stored array class as alphabet
		for(int i=0; i<=alphabet.length-1; i++)
		{
			System.out.println(alphabet[i]);
		}
		System.out.println("---------------");
		for(int i=alphabet.length-1; i>=0; i--)
		{
			System.out.println(alphabet[i]);
		}
		
	}

}
