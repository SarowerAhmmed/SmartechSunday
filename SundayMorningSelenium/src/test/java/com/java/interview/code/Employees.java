package com.java.interview.code;

public abstract class Employees {

	abstract void getemployee();
	
	public void getemployee(String name) {

		System.out.println(name);
	}

	public void getemployee(String name, int salary) {

		System.out.println(name);
		System.out.println(salary);
	}
}
