package com.devpro.first;

import java.util.regex.Pattern;

public class ReverseWords {

	private static final Pattern PATTERN = Pattern.compile(" +");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "Hi there my name is chiti i am a developer";
		String reversewords[] = new String[word.length()];
		StringBuilder s=new StringBuilder();
		if (word == null || word.isEmpty()) {

		}
		reversewords = word.split(" ");
		for (int i=reversewords.length-1;i>=0;i--) {			
			s.append(reversewords[i]+" ");			
		}
		System.out.println(s);
	
	}
}
