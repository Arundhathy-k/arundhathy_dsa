package com.gl;

import java.util.HashMap;
import java.util.Map;

public class HashMapping {

	public static void main(String[] args) {
		HashMap<Integer,String> names = new HashMap<>();
		names.put(1, "ABC");
		names.put(2,"BCD");
		names.put(1, "DCE");
		names.put(null,"XYZ");
		names.put(3, null);
		System.out.println(names);

		for(Map.Entry<Integer, String> e : names.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
	}

}
