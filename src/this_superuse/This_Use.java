package this_superuse;

public class This_Use {
	
	int a=100;//global variable
	int b=90;//global variable
	static int z= 5;//static global variable

	public static void main(String[] args) {
	This_Use t=new This_Use();
	
		t.display();

	}
	public void display() 
	{
		int a=10;//local variable 
		int b=20;//local variable
		int z=1000;//local variable
		System.out.println(a);//calling local variable
		System.out.println(this.a);//calling global variable using this keyword
		System.out.println(b);//calling local variable
		System.out.println(this.b);//calling global variable using this keyword
		System.out.println(z);//calling local variable
		System.out.println(this.z);//calling  static global variable using this keyword
		
		
		
	}

}
