package com.java.interview.code;

public class StringTest {
	
	static String a="United";
	static String b="State";
	static String c= "Of";
	static String d="America";
	
	public static void main(String[] args) {
//		System.out.println(a+b+c+d);
//		System.out.println(a+" "+b+" "+c+" "+d);
//		String country =a+" "+b+" "+c+" "+d;
//		System.out.println(country);
//		String country1 =a.concat(b).concat(c).concat(d);
//		System.out.println(country1);
//		String country11 =a.concat(b)+" ".concat(c)+" ".concat(d);
//		System.out.println(country11);
		
		System.out.println(String.format(a,b,c,d, "United","State","Of","America"));
		
	}

}
