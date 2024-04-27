package com.kn.collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class CollectionSortingDemo {

	public static void main(String[] args) {
		TreeSet<Integer> list1 = new TreeSet<>();
		
		list1.add(56);
		list1.add(5);
		list1.add(76);
		list1.add(156);
		
		System.out.println(list1);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(56);
		list2.add(96);
		list2.add(5);
		list2.add(256);
		
		System.out.println("Before Sorting = "+list2);
		System.out.println("*************************");
		Collections.sort(list2);
		System.out.println("After Sorting = "+list2);
	}

}
