package collectionstudy;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsetStudy {

	public static void main(String[] args) {
	
		LinkedHashSet<String> lh= new LinkedHashSet<>();
		System.out.println(lh.size());
		lh.add("pune");
		lh.add("pune");
		lh.add("null");
		lh.add("pune");
		lh.add("null");
		lh.add("mumbai");
		lh.add("nagpur");
		lh.add("Mds");
		System.out.println(lh);
		
		for(String lh1:lh) 
		{
			System.out.println(lh1 + " ");
		}
		System.out.println("=======================");
		Iterator<String> lh2 = lh.iterator();
		
		while(lh2.hasNext())
		{
			System.out.println(lh2.next() + " ");
		}

	}

}
