package com.kn.collection;

import java.util.*;
public class CollectionDemo5 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(10);
		set.add(5);
		set.add(20);
		set.add(15);
		set.add(1);
//		set.add(10.5); heterogeneous data not allowed
//		set.add(10); Duplicate data not allowed
		
		System.out.println(set);
	}

}
