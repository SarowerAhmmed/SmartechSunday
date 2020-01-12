package com.java.interview.code;

public class FindALetter {

	public static void main(String[] args) {

		// String name="sarower";
		String name2 = new String("UNITED STATE OF AMERICA");
		int count = 1;

		for (int i = 0; i < name2.length(); i++) {

			if (name2.charAt(i) == 'E') {
				System.out.println("COUNT ::"+count);
				System.out.println(name2.charAt(i) + "::Position =" + i);
				// System.out.println(i);
				count++;
			}
			
			
		}

	}

}
