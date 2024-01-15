package encapsulation;

public class EncapsulationUse {
	
	private int a=20;
	private int b=40;
	
	public void addition() {
		
		int sum=a+b;
		System.out.println("value of sum is " + sum);
	}
	public int getAvalue() {
		return a;
		
	}
	public int getBvalue() 
	{
		return b;
		
	}
	public static void main(String[] args) {
		
		EncapsulationUse U=new EncapsulationUse();
		U.addition();
	
	}

}
