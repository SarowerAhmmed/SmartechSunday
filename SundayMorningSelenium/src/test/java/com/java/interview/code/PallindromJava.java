package com.java.interview.code;

public class PallindromJava {
	// MOM =MOM
	
	public static void main(String[] args) {
		
		String word ="SAM";
		System.out.println(word);
		
		String revWord =new StringBuffer("SAM").reverse().toString();
		
		System.out.println(revWord);
		
		
		if (word.equals(revWord)) {
			System.out.println("This is Pallindrome");
		}else {
			System.out.println("Not");
		}
	}

}
