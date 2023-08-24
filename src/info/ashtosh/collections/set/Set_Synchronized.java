package info.ashtosh.collections.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Set_Synchronized {

	public static void main(String[] args) {
		Set<String> nonSyanchronizedSet = new HashSet<>(); // non-Synchronized
		Set<String> synchronizedList = Collections.synchronizedSet(nonSyanchronizedSet); // Synchronized
	}

}
