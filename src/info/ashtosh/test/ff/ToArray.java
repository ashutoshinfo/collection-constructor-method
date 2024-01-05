package info.ashtosh.test.ff;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToArray {
	
	public static void main(String[] args) {
		String[] strings= {"A","C","F"}; 
		
		List<String> asList = Arrays.asList(strings);
		System.out.println(asList);
		asList.set(0, "X");
		System.out.println(asList);
		for (String string : strings) {
			System.out.println(string);
		}
		System.out.println(strings);
		asList.add("v");
		
		Map<Integer, Integer> map=new HashMap<>();
		Map<Integer,Integer> synchronizedMap = Collections.synchronizedMap(map);
		
		
	}

}
