package info.ashtosh.list.arrayList.methods;

import java.util.ArrayList;
import java.util.List;

/**
 * This class have used add(int index, E element) method to insert element List.
 * and Print that out.
 * 
 * Insertion Order: Not Preserved <br>
 * Duplicates: Allowed
 * 
 * @author ashutosh
 *
 */
public class Add_At_Specific_Index_Example {

	public static void main(String[] args) {

		List<String> arrayList = new ArrayList<>();
		arrayList.add("A");
		arrayList.add("C");
		arrayList.add("B");

		arrayList.add(0, "X");

		System.out.println(arrayList);

	}

}
