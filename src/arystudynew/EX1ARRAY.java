package arystudynew;

public class EX1ARRAY {

	public static void main(String[] args) {
		// A B C
	    // D E F
	    // G H I
	char [][] div = {{'A','B','C'},{'D','E','F'},{'G','H','I'}};
	
	for(int i=0; i<=div.length-1; i++) 
	{
		for(int j=0; j<=div.length-1; j++) 
		{
			System.out.print(div[i][j] + " ");
		}
		System.out.println();
		
	}
	 System.out.println("==================");
	 //true false true
	 //true ture ture
	 //false false false
	 boolean result[][]= {{true,false,true},{true,true,true},{false,false,false}};
	 
	 for(int i=0; i<=result.length-1; i++) 
	 {
		 for(int j=0; j<=result.length-1; j++) 
		 {
			System.out.print(result[i][j] + " "); 
		 }
		 System.out.println();
	 }
	 
	 
	 
	 
	}

}
