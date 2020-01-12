package com.java.interview.code;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class JavaIfElseCondition {

	//if else conditional statement
	//verify
	int BikashAge = 30;

	@Test
	public void gettest() {
		
		if (BikashAge < 21) {
			System.out.println("Still Kid");
		}else if (BikashAge<25) {
			System.out.println("Not finished Bachelor");
		}else {
			System.out.println("Age not found");
		}
		
		System.out.println("1st-I found Bikash age 30");
		
		SoftAssert  obj = new SoftAssert();
		obj.assertEquals(BikashAge, 20);
		obj.assertTrue(BikashAge <21);
		obj.assertFalse(BikashAge >21);
	// Assert	
		
		Assert.assertEquals(BikashAge, 20);
		
		System.out.println("2nd-I found Bikash age 30");
		Assert.assertFalse(BikashAge <21,"Kid");
		
		Assert.assertTrue(BikashAge >21,"Adult");
	}	
}
