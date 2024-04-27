package com.kn.collection5;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class MapDemo2 {

	public static void main(String[] args) {
		LinkedHashMap map1 =new LinkedHashMap<>();
		map1.put(1, 11);
		map1.put("Two", 5647);
		map1.put(3, new Student(1, "Ankit", 9.4));
		map1.put("Four", "nirav");
		map1.put(5, "6354");
		System.out.println(map1);
		
		//Accessing keys only using keySet() method which returns a set of objects
		Set keys = map1.keySet();
		System.out.println("Keys = "+keys);
		
		//Accessing key-value pair using entrySet() method which returns a set of objects
		Set kv = map1.entrySet();
		System.out.println("Key-Value = "+kv);
		
		//Accessing only value using values() method which returns a Collection object
		Collection values = map1.values();
		System.out.println("Values = "+values);
	}

}
