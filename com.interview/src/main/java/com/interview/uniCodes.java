package com.interview;

public class uniCodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// to use unicode use 0x <- x is the character optional take any other character
		// also
		char x = (char) 0x104D;
		System.out.println(x);
		
		// this will print the numbers from 0 to 68
		for(int c = 0x0000 ; c<0x0045 ; c++) {
			System.out.println("Number here we choose is "+c+"\n");
		}

	}

}
