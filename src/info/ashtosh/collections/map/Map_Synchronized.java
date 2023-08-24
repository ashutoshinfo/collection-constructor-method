package info.ashtosh.collections.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Map_Synchronized {

	public static void main(String[] args) {
		Map<String, String> nonSyanchronizedMap = new HashMap<>(); // non-Synchronized
		Map<String, String> synchronizedMap = Collections.synchronizedMap(nonSyanchronizedMap); // Synchronized
	}

}
