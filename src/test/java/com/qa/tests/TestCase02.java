package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.base.BaseTest;

public class TestCase02 extends BaseTest {
	@Test
	public void TestCase_02_addingallitemsinCart() {
		homepg.Item1();
		homepg.Item2();
		homepg.Item3();
		homepg.Item4();
		homepg.Item5();
		homepg.Item6();

	}

}
