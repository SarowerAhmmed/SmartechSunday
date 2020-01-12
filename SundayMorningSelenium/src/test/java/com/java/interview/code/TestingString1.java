package com.java.interview.code;

import org.testng.annotations.Test;

public class TestingString1 {

	@Test
	public void test() {
		
		for(int i=0;i<100;i++) {
			
			if(i%3==0 && i%5==0) {
				System.out.println("FizzBuzz::"+ i);
			}else if(i%3==0) {
				System.out.println("Fizz::"+i);
			}else if(i%5==0) {
				
				System.out.println("Bazz::"+i);
			}
			
		}

	
	}
}
