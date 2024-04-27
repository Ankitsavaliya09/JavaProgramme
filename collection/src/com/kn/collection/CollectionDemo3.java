package com.kn.collection;

import java.util.*;

public class CollectionDemo3 {

	public static void main(String[] args) {
		ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		
		System.out.println("First = "+ad.getFirst());
		System.out.println("Last = "+ad.getLast());
		
		ad.addFirst(111);
		ad.addLast(999);
		
		System.out.println("First = "+ad.getFirst());
		System.out.println("Last = "+ad.getLast());

	}

}
