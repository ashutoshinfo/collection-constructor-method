package info.ashtosh.set.sortedSet.treeSet.constructor;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Example {

	public static void main(String[] args) {

		TreeSet<StringBuilder> treeSet1 = new TreeSet<>();
		treeSet1.add(new StringBuilder("X"));
		treeSet1.add(new StringBuilder("B"));
		treeSet1.add(new StringBuilder("Y"));
		System.out.println(treeSet1);

		TreeSet<Integer> treeSet2 = new TreeSet<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return -o1.compareTo(o2);
			}

		});
		treeSet2.addAll(List.of(1, 2, 5, 3, 4, 5));
		System.out.println(treeSet2);

		Set<String> hashSet = new HashSet<>();
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("A");
//		hashSet.add(null);
		TreeSet<String> treeSet3 = new TreeSet<>(hashSet);
		System.out.println(treeSet3);

		TreeSet<Integer> treeSet4 = new TreeSet<>(List.of(1, 2, 5, 3, 4, 5));
		System.out.println(treeSet4);

	}

}
