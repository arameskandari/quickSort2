package com.quickSort;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Parameter;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class QuickSortTest {
	private int[] ints;
	public static ArrayList<int[]> array = new ArrayList<int[]>();

	public QuickSortTest(int[] array) {
		this.ints = array;
	}

	@Parameterized.Parameters
	public static Collection sortLists() {
		for (int i = 0; i < 5; i++) {
			int[] j = new int[10];
			for(int k = 0; k < 10; k++) {
				j[k] = (int) (Math.random()*100);
			}
			array.add(j);
		}
		Collection<Object[]> result = new ArrayList<Object[]>();
	    for (int[] e : array) {
	        result.add(new Object[] { e });
	    }
	    return result;
		//return array;
	}

	@Test
	public void testQuickSortChecker() {
		System.out.println("Success!?");
		assertEquals(QuickSort.sort(ints, 0, ints.length-1), QuickSort.sort(ints, 0, ints.length-1));
	}

}