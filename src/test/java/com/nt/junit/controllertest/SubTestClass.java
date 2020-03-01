package com.nt.junit.controllertest;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.nt.junit.Controller.UserController;

public class SubTestClass {

	@Before
	public void tearUp() {
		System.out.println("Before Test");
	}

	@Test
	public void test() {
		assertEquals(new Integer(10), UserController.sub(20, 10));

	}
	@After
	public void tearDown() {
		System.out.println("After Test");
	}


}
