package com.kn.collection;

import java.util.*;

public class CollectionDemo {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		list1.add(10);		
//		System.out.println("Data = "+list1.get(5));
		
//		list1.add(3, 1111);
		
//		System.out.println(list1);
//		System.out.println(list1.size());
		System.out.println("******************************");
//		list1.set(3, 33);
//		System.out.println(list1);
		System.out.println("IndexOf(10) = "+list1.indexOf(10));
		System.out.println("IndexOf(30) = "+list1.indexOf(30));
		System.out.println("LastIndexOf(10)= "+list1.lastIndexOf(10));
	}

}
