package info.ashtosh.list.arrayList.methods;

import java.util.ArrayList;
import java.util.List;

/**
 * This class have used add method to insert element List. and Print that out.
 * 
 * Insertion Order: Not Preserved <br>
 * Duplicates: Allowed
 * 
 * @author ashutosh
 *
 */
public class ToArray_Example {

	public static void main(String[] args) {

		List<String> arrayList = new ArrayList<>();
		arrayList.add("A");
		arrayList.add("C");
		arrayList.add("B");
		arrayList.add("E");
		arrayList.add("F");
		arrayList.add("G");
		arrayList.add("H");

		Object[] array = arrayList.toArray();

		for (Object object : array) {
			System.out.println(object);
		}

	}
}
