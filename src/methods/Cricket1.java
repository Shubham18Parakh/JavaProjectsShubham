package methods;

public class Cricket1 {

	public static void main(String[] args) {
    match1();//calling static method from same class
    match2();//calling static method from same class
    
    //classname.methodname();//syntax
    Cricket2.game1();//calling static regular method from another class
    Cricket2.game2();//calling static regular method from another class
  
	}
	public static void match1() //static regular complete method
	{
		System.out.println("#group A#");
		System.out.println("This is group stage matches in aisa cup match1");
	}
	public static void match2() //static regular complete method
	{
		System.out.println("This is group stage matches in aisa cup match2");
	}

}
