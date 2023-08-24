package info.ashtosh.list.arrayList.methods;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

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
public class ListIterator_Example {

	public static void main(String[] args) {

		List<Object> arrayList1 = new ArrayList<>();
		arrayList1.add("A");
		arrayList1.add(1);
		arrayList1.add("B");
		arrayList1.add(1.2d);
		arrayList1.add("D");
		arrayList1.add(1.3f);
		arrayList1.add(1L);

		ListIterator<Object> listIterator = arrayList1.listIterator();

		// removing All the instance of String from the List
		while (listIterator.hasNext()) {

			if (listIterator.nextIndex() == 2) {
				listIterator.next();
				continue;
			}

			if (!(listIterator.next() instanceof Number)) {
				listIterator.remove();
				listIterator.add(1.4f);
			}
		}
		System.out.println(arrayList1);

		while (listIterator.hasPrevious()) {

			if (listIterator.previousIndex() == 2) {
				listIterator.previous();
				continue;
			}

			if (listIterator.previous() instanceof Float) {
				listIterator.set(12.2);
			}
		}

		System.out.println(arrayList1);

	}

}

class ListIterator_Example2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		// Adding elements using add(E)
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");

		// Using ListIterator to traverse the list
		ListIterator<String> iterator = list.listIterator();

		// hasNext()
		System.out.println("Has Next? " + iterator.hasNext()); // Output: true

		// next()
		System.out.println("Next: " + iterator.next()); // Output: Apple

		// nextIndex()
		System.out.println("Next Index: " + iterator.nextIndex()); // Output: 1

		// hasPrevious()
		System.out.println("Has Previous? " + iterator.hasPrevious()); // Output: true

		// previous()
		System.out.println("Previous: " + iterator.previous()); // Output: Apple

		// previousIndex()
		System.out.println("Previous Index: " + iterator.previousIndex()); // Output: 0

		// Removing element using remove()
		iterator.remove();
		System.out.println("List after remove: " + list); // Output: [Banana, Orange]

		// Using set(E) to modify element
		iterator.next();
		iterator.set("Mango");
		System.out.println("List after set: " + list); // Output: [Banana, Mango]

		// Adding element using add(E)
		iterator.add("Cherry");
		System.out.println("List after add: " + list); // Output: [Banana, Cherry, Mango]
	}
}
