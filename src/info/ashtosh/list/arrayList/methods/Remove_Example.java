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
public class Remove_Example {

	public static void main(String[] args) {

		List<String> arrayList = new ArrayList<>();
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("D");
		arrayList.add("E");

		arrayList.remove("D"); // only the first occurrence will be deleted.

		System.out.println(arrayList);

	}

}
