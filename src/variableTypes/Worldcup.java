package variableTypes;

public class Worldcup {

	
	byte squade;//non static global variable
	static String name;// static global variable
	int strikerate;//non static global variable
	static String venue;//static global variable
    float avg_score;
	
	public Worldcup()
	{
		squade=16;
		name ="India"; 
		strikerate =150;
		venue="Ahmedabad";
		avg_score= 350.0f;
	}


	public static void main(String[] args) {
		
     Worldcup a1=new Worldcup();
     Iccwc23 a2=new Iccwc23();
     System.out.println("1.India vs Pak Match on 14t-oct at the " + venue + " location." );
     System.out.println("2.Umpires for the world cup ind vs pak match anounced by icc is  " + a2.name );
     System.out.println("3.Mastercard Pre-sale all India matches through bookmyshow at price of " + Iccwc23.price + "INR. ");
     System.out.println("4.Every team has squade of "+a1.squade + " players per side." );
     System.out.println("5.Fovourites to win icc mens 2023wc is team " + name);
     System.out.println("6.Virat batted at strikerate of " + a1.strikerate + " in every match against pak.");
     System.out.println("7.Average 1st inning score is " + a1.avg_score );
     System.out.println("8.commentators for hindi streamimg " + Iccwc23.commentators);
     System.out.println("=======================================");
	}

}
