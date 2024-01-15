package collectionstudy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


public class LinkedListStudy {

	public static void main(String[] args) {
		
		LinkedList<Character> ll=new LinkedList<>();
		ll.add('A');
		ll.add('B');
		ll.add('C');
		ll.add('D');
		ll.add('E');
		ll.add('A');
		ll.add('B');
		ll.add(null);
		ll.add(null);
		System.out.println(ll);
		ll.addFirst('M');
		System.out.println(ll);
		ll.addLast('Z');
		System.out.println(ll);
		System.out.println(ll.contains('C'));
		System.out.println(ll.contains('Y'));
		System.out.println(ll.element());
		System.out.println(ll.poll());
		System.out.println(ll);
		System.out.println(ll.peek());
		System.out.println(ll.pop());
		System.out.println(ll);
		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());
		System.out.println(ll.get(3));
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.offer('X'));
		System.out.println(ll);
		System.out.println(ll.offerFirst('L'));
		System.out.println(ll.offerLast('K'));
		System.out.println(ll);
		
		
	
		
		System.out.println("_______________________FOR__LOOP_______________________________");
		for(int i=0; i<=ll.size()-1; i++) 
		{
			System.out.print(ll.get(i) + " ");
		}
		System.out.println("_____________________________Iteration______________________________");
		Iterator<Character> a1 = ll.iterator();
		while(a1.hasNext()) 
		{
			System.out.print(a1.next() + " ");
		}
		System.out.println("__________________eachloop___________________________________________");
	for( Character p:ll) 
	{
		System.out.print(p + " ");
	}
	System.out.println("___________________________________listIterator____________________________");
	ListIterator<Character> lll = ll.listIterator();
	while(lll.hasNext()) 
	{
		System.out.print(lll.next() + " ");
	}
	System.out.println("===========================================================================");
	while(lll.hasPrevious()) 
	{
		System.out.print(lll.previous() + " ");
	}
	System.out.println("__________________________________________________________________________-");
Character ele1 = lll.next();
System.out.println(ele1);

	}

}
