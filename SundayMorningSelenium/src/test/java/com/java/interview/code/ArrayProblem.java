package com.java.interview.code;

import java.util.Arrays;

public class ArrayProblem {

	public static void main(String[] args) {

		int[] a = { 2, 5, 9 };
		int[] b = { 3, 7, 8 };
		int totalNo = a.length +b.length;

		int[] c = new int[totalNo];
		
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		
		
		System.out.println(Arrays.toString(c));
		
		
		
	//	int n=0;

//		for (int i = 0; i < a.length; i++) {
//
//			c[n] = a[i];
//			n++;
//		}
		
	
//		for (int i = 0; i < b.length; i++) {
//
//			c[n] = b[i];
//			n++;
//			
//		}
		
		
		

	}

}
