package dataType;

public class Swap {

	public static void main(String[] args) {
		//(raju 10--------->sonu 20)
		//(raju 20----BY SWAPINGNG----sonu 10)

		
		int a=10;
		int b=25;
		int temprory; //you can use any variable.
		System.out.println("before swaping " + a + " " + b ); 
		
		temprory=a;
		a=b;
		b=temprory;
		System.out.println("After swaping " + a + " " + b ); 
	}

}
