package com.nt.junit.controllertest;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class MainTestClass {
	public static void main(String[] args) {
		Result r=JUnitCore.runClasses(TestClass.class);
		for(Failure fail :r.getFailures()) {
			System.out.println("Fail Tests: "+fail.toString());
		}
		System.out.println("Pass Tests :"+ r.wasSuccessful());
	}

}
