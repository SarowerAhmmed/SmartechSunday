package com.java.interview.code;

public class StringFormat3 {
	private static int hour;
	private static int second;
	private static int minute;

	public static void main(String[] args) {

		// Integer is a wrapper for the primitive type int and is used to objectify it.
		// By then, the line
		String a = String.format("%5d:%5d:%5d", hour, minute, second);
		System.out.println(a);
		String aa = String.format("%5s:%5s:%5s", "Do", "To", "Foo");
		System.out.println(aa);
	}
}
