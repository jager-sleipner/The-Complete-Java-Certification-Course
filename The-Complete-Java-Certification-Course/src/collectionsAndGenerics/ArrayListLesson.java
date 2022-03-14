//Video 35
//Test av .project commit
package collectionsAndGenerics;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListLesson {

	public static void main(String[] args) {

		//Before java 5 - not generics
		ArrayList words = new ArrayList();
		words.add("Hello");
		words.add("There");
		words.add(10);
		words.add(9);
		words.add(10.4);
		words.add("H");
		words.remove(4);
		
		//Not user friendly coz data types can vary in arraylist and you have to cast...
		String item1 = (String) words.get(0);
		Object item2 = words.get(1);
		System.out.println(item1 + item2);
		
		/* Funkar ej
		 * Object item1 = words.get(2); Object item2 = words.get(3);
		 * System.out.println(item1 + item2);
		 */
		
		/*Visar hur man castar:
		 * int item3 = (int) words.get(1); int item4 = (int) words.get(2);
		 * System.out.println(item3 + item4);
		 */
		
		//Generics ArrayList<type>
		//ArrayList - 10 slots, then copy to 20 slot to a new array and then double
		//Faster to receive data, slower for data manipulation
		ArrayList<String> words2 = new ArrayList<String>();
		words2.add("Hello");
		words2.add("There");
		words2.add("H");
		
		String item5 =  words2.get(2);
		System.out.println(item5);
		
		// attaches a new "cart" to the train
		//Faster for manipulation, slower for retrieving 
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		numbers.add(100);
		numbers.add(200);
		numbers.add(45);
		numbers.add(1000);
		numbers.remove(2);
		numbers.remove();
		numbers.removeFirst(); //same as .remove()
		
		for(int number : numbers) {
			System.out.println(number);
		}
		
		
		
	}

}
