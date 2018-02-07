package com.quickSort;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(QuickSortTest.class);

		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
			System.out.println("fail");
		}

		System.out.println(result.wasSuccessful());
	}
}