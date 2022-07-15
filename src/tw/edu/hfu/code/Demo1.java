/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.edu.hfu.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class Demo1 {

	@Test
	public void test() {
		List<String> l=new ArrayList<>();
		Stream<String> st=l.stream();
	}
	@Test
	public void test2() {
		Integer x[]=new Integer[10];
		Stream<Integer> st=Arrays.stream(x);
	}
	@Test
	public void test3() {
		Stream<String> st=Stream.of("1","2","3");
	}
	@Test
	public void test4() {
		Stream<Integer> st=Stream.iterate(0,x->x+2);
		st.limit(10).forEach(System.out::println);
	}
	
	@Test
	public void test5() {
		Stream.generate(()->Math.random()).limit(10).forEach(System.out::println);
	}
	
}
