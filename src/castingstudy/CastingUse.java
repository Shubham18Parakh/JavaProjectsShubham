package castingstudy;

public class CastingUse {

	public static void main(String[] args) {
		
		//implicit casting lower to higher data trasnfer
		int a=10; //4 bytes
		double b=a; // 8 bytes
		
System.out.println(b);

//explicit casting higher to lower

double x=10.5; //8 bytes
int y= (int )x;//4 bytes
System.out.println(y);
	}

}
