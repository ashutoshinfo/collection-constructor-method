package info.ashtosh.list.arrayList.methods;

import java.util.ArrayList;
import java.util.List;

/**
 * This class have used equals(Object o) method to check the element(s) of List
 * contain the same elements in the same order.
 * 
 * Insertion Order: Not Preserved <br>
 * Duplicates: Allowed
 * 
 * @author ashutosh
 *
 */
public class Equals_Example {

	public static void main(String[] args) {

		List<String> arrayList1 = new ArrayList<>();
		arrayList1.add("A");
		arrayList1.add("C");
		arrayList1.add("B");
		arrayList1.add("D");

		List<String> arrayList2 = new ArrayList<>();
		arrayList2.add("A");
		arrayList2.add("C");
		arrayList2.add("B");
		arrayList2.add("D");

		boolean isEquals = arrayList1.equals(arrayList2);
		System.out.println(isEquals);

	}

}
