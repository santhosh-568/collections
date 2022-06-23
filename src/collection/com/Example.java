package collection.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> obj=new ArrayList<>();
         obj.add(2);
         obj.add(1);
         obj.add(4);
         obj.add(45);
         obj.add(8);
         obj.add(0);
         obj.add(99);
         obj.add(12);
         obj.add(4);
         obj.add(45);
         obj.add(18);
         obj.add(7);
         obj.remove(1);
         //For sorting arrlist
         //System.out.println("the elements before sorting " +obj);
        // Collections.sort(obj);
        // System.out.println("the element after sorting" +obj);
         //for resvering the arrylist
      /* System.out.println("this is before resversing" +obj);
       Collections.reverse(obj);
       System.out.println("this is after Resversing" +obj);*/
         for(Integer elements:obj) {
        	 
         
         System.out.println(elements);
       
       
	
	

}
	}
	
}
