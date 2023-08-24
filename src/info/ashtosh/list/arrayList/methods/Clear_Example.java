package info.ashtosh.list.arrayList.methods;

import java.util.ArrayList;
import java.util.List;

/**
 * This class have used arrayList method to clear element from List.
 * 
 * Insertion Order: Not Preserved <br>
 * Duplicates: Allowed
 * 
 * @author ashutosh
 *
 */
public class Clear_Example {

	public static void main(String[] args) {

		List<String> arrayList = new ArrayList<>();
		arrayList.add("A");
		arrayList.add("C");
		arrayList.add("B");
		arrayList.add("D");

		System.out.println(arrayList);
		arrayList.clear();
		System.out.println(arrayList);

	}

}
