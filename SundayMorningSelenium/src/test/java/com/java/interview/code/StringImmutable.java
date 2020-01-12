package com.java.interview.code;

public class StringImmutable {

	
	public static void main(String[] args) {
		String a="sarower";

		String b=a.concat("ahmmed");
		System.out.println(a);
		System.out.println(b);	
		
		
		StringBuffer s= new StringBuffer("Alam");

		StringBuffer d= s.append("Karim");
		System.out.println(s);;
		System.out.println(d);
	}
}
