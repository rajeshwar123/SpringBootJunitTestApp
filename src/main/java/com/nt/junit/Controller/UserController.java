package com.nt.junit.Controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class UserController {

	public static Integer maxKey(Map<Integer, String> map1) {
		// Map<Integer, String> map=new HashMap<>();

		Integer max = 0;
		Set<Integer> keys = map1.keySet();

		Iterator<Integer> itr = keys.iterator();
		while (itr.hasNext()) {
			Integer i = itr.next();
			{
				if (i > max) {
					max = i;
				}
			}

		}
		return max;
	}

	public static Integer add(int a, int b) {
		return a + b;
	}

	public static Integer sub(int a, int b) {
		return a - b;
	}

	public static Integer div(int a, int b) {
		return a / b;
	}

	public static Integer cube(int a) {
		return a * a * a;
	}

}
