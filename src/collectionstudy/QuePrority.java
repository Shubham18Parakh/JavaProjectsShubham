package collectionstudy;

import java.util.PriorityQueue;
import java.util.Queue;

public class QuePrority {

	public static void main(String[] args) {
	PriorityQueue<Object> qp= new PriorityQueue<>();
	qp.add(1);
	qp.add(2);
	qp.add(4);
	qp.add(2);
	qp.add(10);
	qp.add(13);
	//qp.add(null);
	//qp.add(null);//java.lang.NullPointerException
	//qp.add("Mandsaur");//java.lang.ClassCastException:
	System.out.println(qp);
		qp.contains(10);
		System.out.println(qp.contains(10));
System.out.println(qp.peek());
System.out.println(qp.poll());
System.out.println(qp.element());
System.out.println(qp.offer(12));
System.out.println(qp);
System.out.println(qp.size());
	}

}
