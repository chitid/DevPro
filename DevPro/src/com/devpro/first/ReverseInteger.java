package com.devpro.first;
public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer i = 120;
		int rev = 0;
		while (i != 0) {
			int pop = i % 10;
			i = i / 10;
			rev = rev * 10 + pop;
		}
		System.out.println(rev);
	}
}
