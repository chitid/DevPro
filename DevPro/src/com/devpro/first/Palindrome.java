package com.devpro.first;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 132331;
		System.out.println("It is palindrome" + checkPalindrome(x));

	}

	private static boolean checkPalindrome(int x) {

		int rev = 0;
		int preX = x;
		// TODO Auto-generated method stub
		while (x > 0) {
			int y = x % 10;
			x = x / 10;
			rev = rev * 10 + y;
		}
		if (rev == preX)
			return true;
		else
			return false;

	}

}
