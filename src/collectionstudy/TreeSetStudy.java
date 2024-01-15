package collectionstudy;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args) {
	
		TreeSet<Object> ts= new TreeSet<>();
		ts.add("pune");
		//ts.add(123);
		System.out.println(ts);
		// java.lang.ClassCastException:
		//ts.add(null);
		System.out.println(ts);
		//java.lang.NullPointerException
		ts.add("Mandsaur");
		ts.add("Indore");
		ts.add("Rtalam");
		ts.add("Ujjain");
		ts.add("Udaipur");
		System.out.println(ts);
	
		
TreeSet<Integer> TS= new TreeSet<Integer>();

TS.add(10);
TS.add(1);
TS.add(3);
TS.add(4);
//TS.add(2);
TS.add(5);
//TS.add(7);
TS.add(8);
TS.add(6);
TS.add(9);

System.out.println(TS);
TS.ceiling(3);
System.out.println(TS.ceiling(5));
System.out.println(TS.ceiling(2));

TS.floor(2);
System.out.println(TS.floor(7));
TS.first();
System.out.println(TS.first());
System.out.println(TS.last());
System.out.println(TS.size());
System.out.println(TS.remove(6));
System.out.println(TS);
System.out.println(TS.higher(2));
System.out.println(TS.lower(7));

for(Integer T:TS)
{
	System.out.println(T);
}
System.out.println("+++++++++++++++++++++++++++++++++==");
System.out.println("_______________________Iterator___________________________________");
Iterator<Integer> ts1 = TS.iterator();
while(ts1.hasNext()) 
{
	System.out.println(ts1.next());
}

System.out.println("+++++++++++++++++++++++++++++++++++++");


Iterator<Integer> it1 = TS.descendingIterator();
while(it1.hasNext()) 
{
	System.out.println(it1.next());

}
	}

}
