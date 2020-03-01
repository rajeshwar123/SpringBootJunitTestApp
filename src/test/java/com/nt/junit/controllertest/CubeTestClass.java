package com.nt.junit.controllertest;



import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.nt.junit.Controller.UserController;
@Ignore
public class CubeTestClass {

	@Before
	public void tearUp() {
		System.out.println("Before Test");
	}

	@Test
	public void test() {
		assertEquals(new Integer(126), UserController.cube(5));

	}
	@After
	public void tearDown() {
		System.out.println("After Test");
	}


}
