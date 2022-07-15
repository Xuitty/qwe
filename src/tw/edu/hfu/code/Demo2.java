/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.edu.hfu.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

import tw.edu.hfu.code.entity.Employee;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class Demo2 {

	List<Employee> list = Arrays.asList(new Employee("Alice", 20, 70831), new Employee("Bard", 54, 20291),
			new Employee("Caps", 61, 34791), new Employee("Drek", 34, 17491), new Employee("Edi", 41, 13211),
			new Employee("Fed", 74, 80291),new Employee("Fed", 74, 80291),new Employee("Edi", 31, 13211));

	@Test // filter
	public void test() {

		list.stream().filter((z) -> {
			System.out.println("123");
			return z.getAge() > 40;
		}).forEach(System.out::println);
	}

	@Test // limit
	public void test2() {
		list.stream().filter((z) -> {
			return z.getAge() > 40;
		}).limit(3).forEach(System.out::println);
		// s.forEach(System.out::println);
	}

	@Test // skip
	public void test3() {
		list.stream().filter((z) -> {
			return z.getAge() > 20;
		}).skip(3).forEach(System.out::println);
	}

	@Test
	public void test4() {
	
		list.stream().filter((z) -> {
			return z.getAge() > 0;
		}).skip(0).distinct().forEach(System.out::println);
	
	}

	@Test
	public void test5() {
	}

	@Test
	public void test6() {
	}

}
