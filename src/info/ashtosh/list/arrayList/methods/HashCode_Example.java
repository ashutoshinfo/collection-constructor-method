package info.ashtosh.list.arrayList.methods;

import java.util.ArrayList;
import java.util.List;

/**
 * This class have used get(int index) method toReturns the element at the
 * specified position in this list.
 * 
 * Insertion Order: Not Preserved <br>
 * Duplicates: Allowed
 * 
 * @author ashutosh
 *
 */
public class HashCode_Example {

	public static void main(String[] args) {

		List<String> arrayList1 = new ArrayList<>();
		arrayList1.add("A");
		arrayList1.add("C");
		arrayList1.add("B");
		arrayList1.add("D");

		System.out.println(arrayList1.indexOf("A")); // 0
		System.out.println(arrayList1.indexOf("B")); // 2
		System.out.println(arrayList1.indexOf("C")); // 1
		System.out.println(arrayList1.indexOf("X")); // -1 : if the element is not present the list

	}

}
