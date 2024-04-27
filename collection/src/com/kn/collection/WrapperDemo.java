package com.kn.collection;

import java.util.*;

public class WrapperDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);     //al.add(new Integer(10));
		al.add(20);     //al.add(new Integer(20));
		al.add(30);     //al.add(new Integer(30));		
		
		int i1 = al.get(0);   //(int)al.get(0);
		int i2 = al.get(1);	  //(int)al.get(0);
		int i3 = al.get(2);   //(int)al.get(0);
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
	} 

}
