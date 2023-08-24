package info.ashtosh.list.arrayList.methods;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * This class have used add method to insert element List. and Print that out.
 * 
 * Insertion Order: Not Preserved <br>
 * Duplicates: Allowed
 * 
 * @author ashutosh
 *
 */
public class RemoveAll_Example {

	public static void main(String[] args) {

		List<String> arrayList1 = new ArrayList<>();
		arrayList1.add("A");
		arrayList1.add("B");
		arrayList1.add("C");

		List<String> arrayList2 = new ArrayList<>();
		arrayList2.add("A");
		arrayList2.add("B");
		arrayList2.add("E");

		UnaryOperator<String> squareOperator = in -> {
			if (in.equals("A")) {
				return in.toLowerCase();
			}
			return in;
		};
		
		arrayList1.replaceAll(squareOperator);

		System.out.println(arrayList1);

	}

}
