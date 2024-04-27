package com.kn.reversewordsstring;


public class ReverseWordsStringDemo {

	public static void main(String[] args) {
		String s1 = "I am learning string in java";
		String[] srr = s1.split(" ");
		
		ReverseWordsString reverse = new ReverseWordsString();
		reverse.reverseCharacter(srr);
		
		
	}

}
