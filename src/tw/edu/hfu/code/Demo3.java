/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.edu.hfu.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

import tw.edu.hfu.code.entity.Employee;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class Demo3 {

	List<Employee> list = Arrays.asList(new Employee("Alice", 20, 70831), new Employee("Bard", 54, 20291),
			new Employee("Caps", 61, 34791), new Employee("Drek", 34, 17491), new Employee("Fed", 74, 80291),
			new Employee("Fed", 74, 80291), new Employee("Edi", 41, 13211), new Employee("Edi", 31, 13211));

	@Test 
	public void test() { //map String型態轉換
		List<String> l=Arrays.asList("abc","def","ghi","jkl","mmno","pqr","stu","vwx","yz");
		l.stream().map(z->z.toUpperCase()).forEach(System.out::println);
	}
	@Test 
	public void test2() {
		list.stream().map(Employee::getAge).forEach(System.out::println);
	}

	@Test 
	public void test3() {
		list.stream().map((z)->z.getName()).forEach(System.out::println);
		System.out.println(list);
	}

	@Test
	public void test4() {

	}

	@Test
	public void test5() {
	}

	@Test
	public void test6() {
	}

}
