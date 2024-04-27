package com.kn.collection5;

import java.util.HashMap;

public class MapDemo1 {

	public static void main(String[] args) {
		HashMap map1 =new HashMap<>();
		map1.put(1, 11);
		map1.put("Two", 5647);
		map1.put(3, new Student(1, "Ankit", 9.4));
		map1.put("Four", "nirav");
		map1.put(5, "6354");
		System.out.println(map1);
	}

}
