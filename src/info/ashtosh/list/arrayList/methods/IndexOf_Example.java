package info.ashtosh.list.arrayList.methods;

import java.util.ArrayList;
import java.util.List;

/**
 * This class have used indexOf(Object o) method Returns the index of the first
 * occurrence of the specified elementin this list, or -1 if this list does not
 * contain the element.
 * 
 * Insertion Order: Not Preserved <br>
 * Duplicates: Allowed
 * 
 * @author ashutosh
 *
 */
public class IndexOf_Example {

	public static void main(String[] args) {

		List<String> arrayList1 = new ArrayList<>();
		arrayList1.add("A");
		arrayList1.add("C");
		arrayList1.add("A");
		arrayList1.add("D");

		System.out.println(arrayList1.indexOf("A"));
	}

}
