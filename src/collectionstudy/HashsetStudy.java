package collectionstudy;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetStudy {

	public static void main(String[] args) {
		
		
		HashSet<Object> hs=new HashSet<>();
		hs.add(4);
		hs.add(10);
		hs.add(12);
		hs.add(3);
		hs.add(2);
		hs.add(3);
		hs.add(10);
		hs.add(null);
		hs.add(null);
System.out.println(hs);

System.out.println("=======================================");

HashSet<String> hs1=new HashSet<>();
hs1.add("HI");
hs1.add("GN");
hs1.add("GM");
hs1.add("GE");
hs1.add("HI");
hs1.add("GA");
System.out.println(hs1);
System.out.println("==================================================");
for( String h:hs1) 
{
	System.out.println(h);
}
System.out.println("==================================================");
Iterator<String> it=hs1.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}


	}

}
