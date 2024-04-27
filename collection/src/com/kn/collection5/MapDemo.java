package com.kn.collection5;

import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		TreeMap map1 = new TreeMap<>();
		map1.put(1, 100);
		map1.put(2,new Student(1, "Ankit", 7.9));
		map1.put(3, 500);
		map1.put(4,new Student(2, "Nirav", 5.6));
		map1.put(5, 400);
		System.out.println(map1);
	}

}
