package collectionstudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Travarsingstudy {

	public static void main(String[] args) {
	
		ArrayList<Integer> al = new ArrayList<>();
       System.out.println(al.size());
       al.add(1);
       al.add(3);
       al.add(34);
       al.add(21);
       al.add(22);
       al.add(12);
       System.out.println(al);
       System.out.println("------------------------");
       //for loop
       for(int i =0; i<=al.size()-1; i++)
       {
    	   System.out.print(al.get(i));
       }
       System.out.println("====================");
      // using for each loop
       //Object a;
	for ( Integer a:al) 
       {
    	   System.out.println(a);
       }
	System.out.println("=================");
	// Object s;
	for(Integer s:al)
	{
		System.out.println(s);
	}
	System.out.println("==================");
	//cursor iterator use 
	//it.next(); returns integer 
	Iterator <Integer> it =al.iterator();
	System.out.println(it.next());
	System.out.println(it.next());
	System.out.println(it.next());
	System.out.println(it.next());
	System.out.println(it.next());
	System.out.println(it.next());
	System.out.println("=======================");
	//System.out.println(it.next());Exception in thread "main" java.util.NoSuchElementException
	System.out.println("____________________whileloop__________________________");
	
	
ListIterator<Integer> al1 = al.listIterator();
while(al1.hasNext())
{
	System.out.print(al1.next() + " ");
}

System.out.println("___________________________________________________________________--");

while(al1.hasPrevious())
{
	System.out.print(al1.previous() + " ");
}
System.out.println("===============================================================================");
Integer ele1 = al1.next();
Integer ele2 = al1.next();
System.out.println(ele1);
System.out.println(ele2);





	}


}
