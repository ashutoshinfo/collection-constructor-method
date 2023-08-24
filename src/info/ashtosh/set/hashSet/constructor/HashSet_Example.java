package info.ashtosh.set.hashSet.constructor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSet_Example {

	public static void main(String[] args) {

		Set<Object> objects1 = new HashSet<>();
		Set<Object> objects2 = new HashSet<>(20);
		Set<Object> objects3 = new HashSet<>(List.of("A", "A", "A", "B")); // Inter conversion of collection object
		Set<Object> objects4 = new HashSet<>(100, 10);

		System.out.println(objects3);
		System.out.println(objects4.size());
	}

}
