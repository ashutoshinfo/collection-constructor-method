package info.ashtosh.list.arrayList.methods;

import java.util.ArrayList;
import java.util.List;

/**
 * This class have used containsAll(Collection<?> c) method to check the
 * element(s) is present inside the Collection or not.
 * 
 * Insertion Order: Not Preserved <br>
 * Duplicates: Allowed
 * 
 * @author ashutosh
 *
 */
public class ContainsAll_Example {

	public static void main(String[] args) {

		List<String> arrayList = new ArrayList<>();
		arrayList.add("A");
		arrayList.add("C");
		arrayList.add("B");
		arrayList.add("D");

		boolean containsAll1 = arrayList.containsAll(List.of("A", "B"));
		System.out.println(containsAll1);

		boolean containsAll2 = arrayList.containsAll(List.of("A", "Y"));
		System.out.println(containsAll2);

	}

}
