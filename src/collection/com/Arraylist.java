package collection.com;

import java.util.ArrayList;
import java.util.List;


public class Arraylist {

	public static void main(String[] args) {
		
		List<Integer> number= new ArrayList<>();
		number.add(676);
		number.add(787);
		number.add(670);
		number.add(789);
		number.add(788);
		number.add(0, 675);
		for(Integer element: number) {
			System.out.println("the elemnts are " +element);
		}
		if(number.contains(788)) {
			System.out.println("the number is found");
		}
		else {
			System.out.printf("there is such element");
		}
	}
	

}
