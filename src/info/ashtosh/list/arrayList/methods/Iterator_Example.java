package info.ashtosh.list.arrayList.methods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

/**
 * This class have used iterator(), hasNext(), next(), and remove() method to
 * convert the List into Iterator and iterate each element by confirming the
 * that is has a next element present in iterator or not if true then asking for
 * next element and perform required operation on it.
 * 
 * Insertion Order: Not Preserved <br>
 * Duplicates: Allowed
 * 
 * @author Ashutosh
 *
 */
public class Iterator_Example {

	public static void main(String[] args) {

		List<Object> arrayList1 = new ArrayList<>();
		arrayList1.add("A");
		arrayList1.add(1);
		arrayList1.add("B");
		arrayList1.add(1.2d);
		arrayList1.add("D");
		arrayList1.add(1.3f);
		arrayList1.add(1L);

		Iterator<Object> iterator = arrayList1.iterator();

		// removing All the instance of String from the List
		while (iterator.hasNext()) {

			if (!(iterator.next() instanceof Number)) {
				iterator.remove();
			}
		}

		Spliterator<Object> spliterator = arrayList1.spliterator();

		spliterator.forEachRemaining((x) -> {
			System.out.println(x);
		});

		System.out.println(arrayList1);

	}

}
