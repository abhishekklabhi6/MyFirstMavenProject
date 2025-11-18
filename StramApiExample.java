package com.Assignment;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StramApiExample {

	public static void main(String[] args) {

		List<Integer> list =Arrays.asList(1,5,7,8,2);
		Stream<Integer> stream=list.stream();
		boolean result=stream.anyMatch((e)->e.equals(8));
		System.out.println(result);
	}

}
