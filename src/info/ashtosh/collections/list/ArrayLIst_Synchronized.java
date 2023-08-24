package info.ashtosh.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLIst_Synchronized {

	public static void main(String[] args) {
		List<String> nonSyanchronizedList = new ArrayList<>(); // non-Synchronized
		List<String> synchronizedList = Collections.synchronizedList(nonSyanchronizedList); // Synchronized
	}

}
