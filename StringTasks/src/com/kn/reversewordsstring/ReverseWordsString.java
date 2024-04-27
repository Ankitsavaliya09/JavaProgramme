package com.kn.reversewordsstring;

public class ReverseWordsString {

	public void reverseCharacter(String[] srr) {
		for(int i=0;i<srr.length;i++) {
			char[] crr = srr[i].toCharArray();
			for(int j=crr.length-1;j>=0;j--) {
				System.out.print(crr[j]);
			}
			System.out.print(" ");
		}
	}

}
