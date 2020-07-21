package com.devpro.first;

public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		String s = "Hi there i am chiti and deve";
		int k = lengthOfLastWord(s);
		System.out.println("Length of last word" + k);

	}

	// TODO Auto-generated method stub
	private static int lengthOfLastWord(String s) {

		String wL[] = s.split(" ");
		int size = wL.length;
		String k = wL[size - 1];
		return k.length();
	}

}
