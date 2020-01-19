package com.string;

public class StringReverse {

	public static void main(String[] args) {

		
		String word = "{sarower1234#$()}[,$]";
		String text = new String("sarower1234#$");
		String update= text.replace("sarower", "").replace("#$", "");
		System.out.println(update);
		String update2= text.replaceAll("\\w", "");//give all  special char
		System.out.println(update2);
		String update3= text.replaceAll("\\W", "");//remove all  special char
		System.out.println(update3);
		String update4= text.replaceAll("\\d", "");//remove all number
		System.out.println(update4);
		String update5= text.replaceAll("\\D", "");//remove all special char & letter
		System.out.println(update5);
		String update6= text.replaceAll("[A-z]", "");//remove letter
		System.out.println(update6);
		String update7= text.replaceAll("[0-9]", "");//remove number
		System.out.println(update7);
		
	}

}
