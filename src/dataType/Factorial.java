package dataType;

public class Factorial {

	public static void main(String[] args) {
		//factorial of 8 is (8*7*6*5*4*3*2*1)
		int n=8,fact=1;
		for(int i=1; i<=n; i++)
		{
			fact=fact*i;
			System.out.println("factorial  " + fact);
		}
		int m=5;fact=1;
		for(int i=1; i<=m; i++) 
		{
			fact=fact*i;
			System.out.println("factorial " + fact);
		}

	}

}
