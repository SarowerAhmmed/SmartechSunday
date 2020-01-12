package com.string;

public class ImmutableOrMutable {

	public static void main(String[] args) {

		String name = "sarower";
		System.out.println(name);
		name.concat("ahmmed");
		System.out.println(name);

		String myName = new String("Ahmmed");
		System.out.println(myName);
		myName.concat("ahmmed");
		System.out.println(myName);
		
		StringBuffer buf = new StringBuffer("Smarttech");
		System.out.println(buf);
		buf.append("student");
		System.out.println(buf);
		
		
		StringBuilder buld = new StringBuilder("Student");
		System.out.println(buld);
		buld.append("smarttech");
		System.out.println(buld);
	}

}
