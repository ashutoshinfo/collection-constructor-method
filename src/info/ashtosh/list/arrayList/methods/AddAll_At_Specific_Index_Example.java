package info.ashtosh.list.arrayList.methods;

import java.util.ArrayList;
import java.util.List;

/**
 * This class have used addAll(int index, Collection<? extends E> c) method to insert element List. and Print that out.
 * 
 * Insertion Order: Not Preserved <br>
 * Duplicates: Allowed
 * 
 * @author ashutosh
 *
 */
public class AddAll_At_Specific_Index_Example {

	public static void main(String[] args) {

		List<String> arrayList1 = new ArrayList<>();
		arrayList1.add("A");
		arrayList1.add("C");
		arrayList1.add("B");
		arrayList1.add("D");

		List<String> arrayList2 = new ArrayList<>();
		arrayList2.add("1");
		arrayList2.add("2");
		arrayList2.add("3");
		arrayList2.addAll(1, arrayList1);

		System.out.println(arrayList2);

	}

}
