package com.kn.lowercase;

public class LowerFirstCharacter {

	public String lowerFirstCharacter(String s1) {
		String[] srr = s1.split(" ");
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < srr.length; i++) {
			char[] crr = srr[i].toCharArray();
			if (crr[0] >= 65 && crr[0] <= 90) {
				crr[0] = (char) (crr[0] + 32);
			}
			for (int j = 0; j < crr.length; j++) {
				sb.append(crr[j]);
			}
			sb.append(" ");
		}
		String result = sb.toString();
		return result.trim();

	}

}
