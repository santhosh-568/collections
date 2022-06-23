package collection.com;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> link=new LinkedList<>();
		link.add(239);
		link.add(233);
		link.add(222);
		link.add(236);
		link.add(237);
		link.add(232);
		link.add(243);
		link.add(656);
		System.out.println("Before the iterator" +link);
		//for(Integer elements:link) {
			//System.out.println("After the iterator: " +elements);
		//}
		//adding elements at specifi position
		//link.add(2, 333);
		//printing from descending order
		/*Iterator it=((LinkedList<Integer>) link).descendingIterator();
		System.out.println("Elements in Reverse Order:");
	     while (it.hasNext()) {
	        System.out.println(it.next());


	}*/
	   //adding elements at first and last  
		/*link.add(0, 111);
		link.add(9, 888);
		System.out.println("the are after adding the first and last elements:" +link);*/
		
		//adding elments with another method
		/*((LinkedList<Integer>) link).addFirst(000);
		((LinkedList<Integer>) link).addLast(999);
		System.out.println("the elements with another method adding first and last:" +link);*/
		
		//adding at the first and last
		/*((LinkedList<Integer>) link).offerFirst(101);
		((LinkedList<Integer>) link).offerLast(909);
		System.out.println("the elemnents are at Front and end:" +link);*/
		
		System.out.println("the elements at the orginal :"+link);
		for(int p=0;p<link.size();p++) {
			System.out.println("the elements with index no"+ p+":" +link.get(p));
		}
	}
}



