package com.nt.junit.controllertest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.HashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.nt.junit.Controller.UserController;

public class AdditionTestClass {
	
	@Before
	public void tearUp() {
		System.out.println("Before Test");
	}

	@Test
	public void test() {
		assertEquals(new Integer(30), UserController.add(10, 20));
	}
		
	@After
	public void tearDown() {
		System.out.println("After Test");
	}
}