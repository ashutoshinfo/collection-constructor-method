package info.ashtosh.list.linkedList.constructor;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListConstructor {

	public static void main(String[] args) {

		List<String> NonSynchronizedList = new LinkedList<>(); // NonSynchronized-LinkedList
		List<String> synchronizedList = Collections.synchronizedList(NonSynchronizedList); // Synchronized-LinkedList

	}

}
