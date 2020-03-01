package com.nt.junit.controllertest;

import static org.junit.Assert.assertEquals;

//import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.nt.junit.Controller.UserController;

public class DivTestClass {

	@Before
	public void tearUp() {
		System.out.println("Before Test");
	}

	@Test
	public void test() {
		assertEquals(new Integer(5), UserController.div(50, 10));
	}
	
	
	
	@Test(expected=AssertionError.class)
	public void test2() {
		System.err.println("Error");
		assertEquals(new Integer(9), UserController.div(100, 10));

	}
	@After
	public void tearDown() {
		System.out.println("After Test");
	}


}
