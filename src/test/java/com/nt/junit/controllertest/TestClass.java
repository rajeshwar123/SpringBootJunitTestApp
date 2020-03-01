package com.nt.junit.controllertest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses(value={AdditionTestClass.class,SubTestClass.class,DivTestClass.class,CubeTestClass.class,MapTestClass.class})
public class TestClass {

}
