package collectionstudy;

import java.util.ArrayList;

public class ArrayListStudy {

	public static void main(String[] args) {
	
		
	ArrayList<Object> al = new ArrayList<>();
	
	System.out.println(al.add("Mandsaur"));
	

	al.add(0, "Indore");
	System.out.println(al); // right shifting
	Object al1 = al.clone();
	System.out.println("clone arraylist " + al1);
	
	System.out.println(al.contains("pune"));
	System.out.println(al.contains("Indore"));
	
al.ensureCapacity(3);
 al.add("MP");
 System.out.println(al);
al.add("MDS");
System.out.println(al);
al.add("RTLM");
System.out.println(al);

System.out.println(al.equals(al1));

//System.out.println(al.get(20)); //exception out of bond value


System.out.println(al.indexOf("Indore"));
//al.clear();
System.out.println(al.isEmpty());
System.out.println(al.add("RTLM"));
System.out.println(al);
System.out.println(al.lastIndexOf("MDS"));

al.remove(2);
System.out.println(al); //left shifting 
al.set(2, "IND");
System.out.println(al);
System.out.println(al.size());



	

	}

}
