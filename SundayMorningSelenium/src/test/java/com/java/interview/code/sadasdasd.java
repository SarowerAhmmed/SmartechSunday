package com.java.interview.code;

public class sadasdasd {

	public static void main(String[] args) {
		String s1 = new String("pankaj");
		String s2 = new String("PANKAJ");
		s2.intern();
		System.out.println(s1 ==s2);
		
}
}