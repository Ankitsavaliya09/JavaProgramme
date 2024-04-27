package com.kn.collection;

import java.util.*;

public class CollectionDemo4 {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.add(40);
		pq.add(50);
		pq.add(5);

		PriorityQueue<String> pq1 = new PriorityQueue<String>();

		pq1.add("Ten");
		pq1.add("Twenty");
		pq1.add("Thirty");
		
		System.out.println(pq);
		System.out.println(pq1);
	}
}
