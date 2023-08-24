package info.ashtosh.list.arrayList.methods;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * This class have used listIterator(int index) method Returns a list iterator
 * over the elements in this list (in propersequence), starting at the specified
 * position in the list.The specified index indicates the first element that
 * would bereturned by an initial call to next.An initial call to previous
 * wouldreturn the element with the specified index minus one.
 * 
 * Insertion Order: Not Preserved <br>
 * Duplicates: Allowed
 * 
 * @author Ashutosh
 *
 */
public class ListIterator_From_Specified_Locaiton_Example {

	public static void main(String[] args) {

		List<Object> arrayList1 = new ArrayList<>();
		arrayList1.add("A");
		arrayList1.add("D");
		arrayList1.add("B");
		arrayList1.add("B");
		arrayList1.add(1);
		arrayList1.add(1.2d);
		arrayList1.add(1.3f);
		arrayList1.add(1L);

		ListIterator<Object> listIterator = arrayList1.listIterator(4);

		while (listIterator.hasNext()) {
			Number number = (Number) listIterator.next();
			System.out.println(number);

		}

	}

}
