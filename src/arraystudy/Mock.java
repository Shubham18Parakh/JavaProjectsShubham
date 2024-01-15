package arraystudy;

public class Mock {
public static void main(String[] args) {
	
	//i want to print numeric value from 1-10 by using array concepts
	int [] values = new int[10];
	values [0]=1;
	values[1] =2;
	values[2] =3;
	values[3] =4;
	values[4] =5;
	values[5] =6;
	values[6] =7;
	values[7] =8;
	values[8] =9;
	values[9] =10;
	
	for(int i =0; i<=values.length-1; i++)
	{
		System.out.println(values[i]);
	
	}
   for ( int i= values.length-1; i>=0; i--) 
   {
	   System.out.println(values[i]);
   }
	
	
	
	
	
	
}
}
