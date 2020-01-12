package com.string;

public class StringReverse {

	public static void main(String[] args) {

		String name = "sarower";

		for (int i = 0; i < name.length(); i++) {

			System.out.println(name.charAt(i));
		}
		System.out.println("---------------");
		for (int i = name.length() - 1; i > 0; i--) {

			System.out.println(name.charAt(i));
		}
		StringBuffer buf = new StringBuffer("Smarttech");
		System.out.println(buf.reverse());

		StringBuilder buld = new StringBuilder("Student");
		System.out.println(buld.reverse());
		
		
		
		
	}

}
