//Video 35
//Test av .project commit
package collectionsAndGenerics;

import java.util.ArrayList;

public class ArrayListLesson {

	public static void main(String[] args) {

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
		
		int item3 = (int) words.get(2); 
		int item4 = (int) words.get(3);
		System.out.println(item3 + item4);

	}

}
