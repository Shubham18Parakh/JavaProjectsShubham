package stringstudy;

public class StringMethods {

	public static void main(String[] args) {
		
		//1lenth
		String s="Mandsaur";
		int slenth=s.length();
		System.out.println("lenth of the String " + slenth);
		System.out.println("=================================");
		
	//touppercase()
	//tolowercase()
		
		
		String a="pune";
		a.toUpperCase();
		String uppercase=a.toUpperCase();
		System.out.println(a.toUpperCase());
		System.out.println(uppercase);
		System.out.println("------------------");
		System.out.println(a.toLowerCase());
		uppercase.toLowerCase();
		System.out.println(uppercase.toLowerCase());
		String lowercase=uppercase.toLowerCase();
		System.out.println(lowercase);
		System.out.println("===================");
		
		
		//equals()
		//equalsIgnoreCase
		
		String x1="Velocity";
		String x2="Velocity";
		String x3="velocity";
		String x4=new String("Velocity");
		
		String x5=new String("Velocity");
		String x6=new String("velocity");
		boolean results=x1.equals(x2);
		System.out.println(results);
		System.out.println(x2.equals(x4));
		System.out.println(x2.equals(x3));//case sensitive
		System.out.println(x3.equals(x6));
       System.out.println(x1==x2);
       System.out.println(x1==x4);
       System.out.println(x4==x5);
       System.out.println(x2.equalsIgnoreCase(x3));
       System.out.println("====================");
       
       //contains()
       String y1="INDIA";
      System.out.println(y1.contains("A"));
      System.out.println(y1.contains("a"));//case sensitive
      System.out.println(y1.contains("IND"));
      System.out.println(y1.contains("INDA"));
      System.out.println("==================");
      
      //isEmpty
      String a1="Katraj";
      String a2="";
      String a3=" ";
      System.out.println(a1.isEmpty());
      System.out.println(a2.isEmpty());
      System.out.println(a3.isEmpty());
      System.out.println("----------------");
      
      //isBlank
      System.out.println(a1.isBlank());
      System.out.println(a2.isBlank());
      System.out.println(a3.isBlank());
      System.out.println("----------------");
      //charAt
       String b1="Velocity";
       String b2="Katraj";
    char mychar = b1.charAt(1);
  System.out.println(mychar);
  System.out.println(b1.charAt(4));
  //System.out.println(b1.charAt(40));
  System.out.println("=================");
  
  //endsWith
  //startsWith
  String c1="Velocity";
  System.out.println(c1.endsWith("city"));
  System.out.println(c1.endsWith("loc"));
  System.out.println(c1.endsWith("cty"));
  System.out.println(c1.endsWith("Velocity"));
  System.out.println("==================");
  System.out.println(c1.startsWith("Velo"));
  System.out.println(c1.startsWith("city"));
  System.out.println(c1.startsWith("loc",2));
  System.out.println(c1.startsWith("city", 4));
  System.out.println("==========================");
  
  //substring
  String d1="MAHARASHTRA PUNE INDIA KATRAJ";
  System.out.println(d1.substring(12));
  System.out.println(d1.substring(17, 22));
  System.out.println(d1.subSequence(0, 11));
  System.out.println("=============");
  //replace 
  
  String p1="INDIA WON WORLD CUP";
  System.out.println(p1.replace("INDIA","AUS"));
  
  
  
  
  //split method
  
  String s1 = "HONESTY IS THE BEST POLICY";
  String[] myString=s1.split(" ");
  for(int i=0; i<=myString.length-1; i++) 
  {
	  System.out.println(myString[i] + " ");
  }
  
	}

}
