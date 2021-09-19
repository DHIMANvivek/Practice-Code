package com.interview;

public class toBinaryString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		int y = -5;

		// this will give a binary number with one's complement
		System.out.println("+5 in 1's complement is " + Integer.toBinaryString(x));

		// this will give two's complement of a negative number
		System.out.println("-5 in 2's complement is " + Integer.toBinaryString(y));

		// remember :- 2's complement always ends with 011
	}

}
