package com.string;

public class JavaString {

	public static void main(String[] args) {
		
	//	int a=10,20;

	int[] a= {10,20};
	System.out.println(a[1]);
	String[] name= {"sarower","Bikash"};
	System.out.println(name[1]);
	double[] d= {10.25,20.25};
	System.out.println(d[1]);
	
	
	String country ="United States Of America";
	String[] pieces =country.split(" ");
	System.out.println(pieces[3]);
	}
}
