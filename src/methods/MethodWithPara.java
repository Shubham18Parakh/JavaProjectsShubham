package methods;

public class MethodWithPara {

	public static void main(String[] args) 
	{
		MethodWithPara wawp=new MethodWithPara();
		wawp.PlayerDetails("Virat", 'M',6.0f, 18);
		wawp.PlayerDetails("parag",'M',5.0f,15);
	
	}
     public void PlayerDetails(String name,char gender,float height,int jersy )
     {
    	System.out.println("player name is "+name);
    	System.out.println("gender is "+ gender);
    	System.out.println("player height is "+ height);
    	System.out.println("jersy number is "+jersy);
     }
    	 
  
     }

