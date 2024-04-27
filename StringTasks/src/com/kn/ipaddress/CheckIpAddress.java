package com.kn.ipaddress;

public class CheckIpAddress {

	public static void main(String[] args) {
		String s1 = "98.162.256";
		String[] srr = s1.split(".");
		
		if(srr.length<=4) {
			for(int i=0;i<srr.length;i++) {
				
			}
		}else {
			System.out.println("Invalid Ip Address");
		}
	}

}
