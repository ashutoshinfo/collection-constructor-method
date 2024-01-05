package info.ashtosh.test.ff;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TEst2 {
	public static void main(String[] args) {
		List<String> nameList = new ArrayList<>();
		nameList.add("A");
		nameList.add("B");
		nameList.add("C");
		nameList.add("D");
		nameList.add("E");

		ListIterator<String> listIterator = nameList.listIterator();
		System.out.println(nameList);

		while (listIterator.hasNext()) {
			String s = listIterator.next();

			if (s.equals("B")) {
				listIterator.remove();

			} else if (s.equals("C")) {
				listIterator.add("F");

			} else if (s.equals("E")) {
				listIterator.set("G");

			} else if (s.equals("G")) {
				listIterator.set("X");

			}

		}
		System.out.println(nameList);
	}
}
