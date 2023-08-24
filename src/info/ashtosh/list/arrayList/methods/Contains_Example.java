package info.ashtosh.list.arrayList.methods;

import java.util.ArrayList;
import java.util.List;

/**
 * This class have used contains(Object o) method to check the element is
 * present inside the Collection or not element.
 * 
 * Insertion Order: Not Preserved <br>
 * Duplicates: Allowed
 * 
 * @author ashutosh
 *
 */
public class Contains_Example {

	public static void main(String[] args) {

		List<String> arrayList = new ArrayList<>();
		arrayList.add("A");
		arrayList.add("C");
		arrayList.add("B");
		arrayList.add("D");

		boolean contains = arrayList.contains("D");

		System.out.println(contains);

	}

}
