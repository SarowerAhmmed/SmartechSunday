package com.java.interview.code;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {

	public static void main(String[] args) {

		// only matches
		String text = "This is the text to be searched " + "for occurrences of the pattern.";
		String pattern2 = ".*is.*";
		boolean matches = Pattern.matches(pattern2, text);
		System.out.println("matches = " + matches);

		// use pattern

		String patternString = ".*http://.*";
		Pattern pattern = Pattern.compile(patternString);
		System.out.println(pattern);

		// use pattern and matchers together
		String patternString1 = ".*http://.*";
		Pattern pattern1 = Pattern.compile(patternString1, Pattern.CASE_INSENSITIVE);
		System.out.println(pattern1);
		Matcher matcher = pattern1.matcher(text);
		boolean matches1 = matcher.matches();

		System.out.println("matches = " + matches1);
	}
}
