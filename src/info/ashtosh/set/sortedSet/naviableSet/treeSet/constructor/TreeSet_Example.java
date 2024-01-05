package info.ashtosh.set.sortedSet.naviableSet.treeSet.constructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Example {

	public static void main(String[] args) {

		TreeSet<StringBuffer> treeSet1 = new TreeSet<>();
		treeSet1.add(new StringBuffer("X"));
// 		treeSet1.add(new StringBuilder("B"));
//		treeSet1.add(new StringBuilder("Y"));
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
		TreeSet<Integer> treeSet6 = new TreeSet<Integer>((o1, o2) -> 0);
		treeSet6.add(2);
		treeSet6.add(22);
		
		System.out.println(treeSet6);
		List<Integer> integers = new ArrayList<>(treeSet6);
		Collections.sort(integers, (o1, o2) -> -o1.compareTo(o2));
		TreeSet<String> integers2 = new TreeSet<>(hashSet);

	}

}
