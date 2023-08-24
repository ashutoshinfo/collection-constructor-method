package info.ashtosh.list.arrayList.constructors;

import java.util.ArrayList;
import java.util.List;

public class ArrayListConstructor {

	public static void main(String[] args) {

		List<String> arrayList1 = new ArrayList<>();
		List<String> arrayList2 = new ArrayList<>(16);
		List<String> arrayList3 = new ArrayList<>(List.of("A", "B", "C"));
	}

}
