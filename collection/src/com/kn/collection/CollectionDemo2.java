package com.kn.collection;

import java.util.*;

public class CollectionDemo2 {

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		
		list1.add(2, 22);
		list1.set(2, 26);
		
		System.out.println(list1);
		
		LinkedList<String> list2 = new LinkedList<String>();
		list2.add("Ten");
		list2.add("Twenty");
		list2.add("Thirty");
		list2.add("Fourty");
		
//		list2.addAll(list1);
		System.out.println(list2);
		
	}

}
