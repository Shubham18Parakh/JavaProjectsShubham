package collectionstudy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) {

		//how to create vector?
		Vector<String> v = new Vector<>();
		v.add("MH");
		v.add("Pune");
		v.add(1,"MDS");
		v.add("AP");
		v.add("TN");
		v.add("PB");
		v.add("UP");
		v.add("DL");
		v.add("MP");
		v.add("HR");
		v.add(null);
		v.add(null);
		
	
	System.out.println(v.capacity());
	System.out.println(v.size());
	System.out.println(v);
	//contains use
	System.out.println(v.contains("xy"));
	System.out.println(v.get(0));
	System.out.println(v.elementAt(1));
	System.out.println(v.firstElement());
v.insertElementAt("GJ", 12);
System.out.println(v);
	System.out.println(v.lastElement());
	System.out.println(v.remove(11));
	System.out.println(v.remove("UP"));
	System.out.println(v);
	System.out.println(v.remove("RJ"));
	v.setSize(18);
	System.out.println(v);
	System.out.println("_________________for each loop ____________");
	for(String vect:v) 
	{
		System.out.print(vect + " ");
	}
	
	System.out.println("___________iterator____________________________");
	
	Iterator<String> it=v.iterator();
	while(it.hasNext()) 
	{
		System.out.print(it.next() + " ");
	}
	
	System.out.println("____________-enmmueration_________________________");
	Enumeration<String> ele = v.elements();
	while(ele.hasMoreElements())
	{
		System.out.print(ele.nextElement() + " ");
	}
	System.out.println("________________________for  lop_____________________________");
	for(int i=0; i<=v.size()-1; i++) 
	{
		System.out.print(v.get(i) + " ");
	}
	
	
	}

}
