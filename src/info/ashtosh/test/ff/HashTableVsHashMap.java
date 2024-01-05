package info.ashtosh.test.ff;

import java.util.SortedSet;
import java.util.TreeSet;

public class HashTableVsHashMap {
	public static void main(String[] args) {
		// Hashtable example
		SortedSet<String> sortedSet = new TreeSet<>((str1, str2) -> -str1.compareTo(str2));
		sortedSet.add("A");
		sortedSet.add("B");
		sortedSet.add("C");
		sortedSet.add("D");
		sortedSet.add("E");

		System.out.println(sortedSet.first());
		System.out.println(sortedSet);
	}
}
