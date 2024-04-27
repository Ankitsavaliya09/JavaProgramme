package com.kn.collection4;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> h1 = new HashSet<>();
		h1.add(11);
		h1.add(33);
		h1.add(22);
		h1.add(55);
		h1.add(44);
		System.out.println(h1);
		
		LinkedHashSet<Integer> h2 = new LinkedHashSet<>();
		h2.add(11);
		h2.add(33);
		h2.add(22);
		h2.add(55);
		h2.add(44);
		System.out.println(h2);
	}

}
