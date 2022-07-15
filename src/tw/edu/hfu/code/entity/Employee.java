/*
Copyright (c) 2022, 2022, HFU and/or its affiliates. All rights reserved.
*/
package tw.edu.hfu.code.entity;

import java.util.Objects;

/**
 *
 * @author:SU
 * @since:11.0 TODO:
 *
 */
public class Employee {

	private String name;
	private int age;
	private double pay;

	public Employee() {}
	
	public Employee(String name, int age, double pay) {
		super();
		this.name = name;
		this.age = age;
		this.pay = pay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", pay=" + pay + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name, pay);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return age == other.age && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(pay) == Double.doubleToLongBits(other.pay);
	}

}
