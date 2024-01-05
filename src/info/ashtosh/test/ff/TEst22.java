package info.ashtosh.test.ff;

import java.util.ArrayList;
import java.util.List;

public class TEst22 {
	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<>();
		integers.add(1);
		integers.add(2);
		integers.add(5);
		System.out.println(integers.size());
		integers.add(3);
		System.out.println(integers.size());
		integers.add(4);
		System.out.println(integers.size());
		integers.add(5);
		integers.add(6);
		integers.add(0, 0);
		integers.add(0, -1);
		integers.remove(0);
		System.out.println(integers);
		integers.remove(Integer.valueOf(5));
//		integers.remove(Integer.valueOf(5));
		System.out.println(integers);
		System.out.println(integers.size());
	}
}
