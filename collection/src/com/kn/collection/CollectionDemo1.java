package com.kn.collection;

import java.util.*;

public class CollectionDemo1 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		System.out.println(list1);
		System.out.println("*******************************");
		
		ArrayList list2 = new ArrayList();
		list2.add("one");
		list2.add("two");
		list2.add("three");
		list2.add("four");
		list2.add("five");
		System.out.println(list2);
		System.out.println("******************************");
		
//		list2.addAll(list1);
		list2.addAll(2, list1);
		System.out.println(list2);
	}

}
