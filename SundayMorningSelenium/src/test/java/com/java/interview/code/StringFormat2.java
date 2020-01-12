package com.java.interview.code;

public class StringFormat2 {
	
public static void main(String[] args) {
	String s = String.format("Hello %s answered your question", "placeofm");
	System.out.println(s);
	String ss=String.format("Hour %s:Minute %s:Second %s","08","30","45");
	System.out.println(ss);
	Object[] value = { 10,20,30 };
	String sss=String.format("%d:%d:%d", value);
	System.out.println(sss);
	String sss3=String.format("%10d:%10d:%10d", value);
	System.out.println(sss3);
	String ssss=String.format("|% d|% d|% d|", value);
	System.out.println(ssss);
}
}
