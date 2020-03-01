package com.nt.junit.controllertest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.nt.junit.Controller.UserController;


public class MapTestClass {
	static Map<Integer, String> map;

	@BeforeClass
	public  static void beforClass() {
		map = new HashMap<>();
		map.put(10, "suraj");
		map.put(5, "akash");
		map.put(40, "bhushan");
		map.put(100, "rajeshwar");
		map.put(61, "vijay");
		map.put(0, "ample");
		System.out.println("BeforeClass...");
	}

	@Before
	public void tearUp() {
		System.out.println("Before Test");
	}

	@Test
	public void test() {
		assertEquals(new Integer(100), UserController.maxKey(map));

	}

	@Test
	public void test1() {
		assertEquals(new Integer(100), UserController.maxKey(map));
	}

	@Test
	public void test3() {
		// assertNotNull(map);
		assertNotEquals(new Integer(5), UserController.maxKey(map));
	}

	@After
	public void tearDown() {
		System.out.println("After Test");
		// map.clear();
	}

	@AfterClass
	public static void  afterClass() {
		System.out.println("After Class");
		map.clear();
	}
}
