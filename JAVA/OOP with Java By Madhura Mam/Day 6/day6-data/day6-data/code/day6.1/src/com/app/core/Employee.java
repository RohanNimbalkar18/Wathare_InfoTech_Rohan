package com.app.core;

public class Employee {
	private String empId;
	private String name;
	private double salary;

	public Employee(String empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public boolean equals(Object o) {
		System.out.println("in emp eq");
		if (o instanceof Employee)
			return this.empId.equals(((Employee) o).empId);
		return false;
	}

	@Override
	public int hashCode() {
		System.out.println("in emp's hashCode");
	//	return 100;
		return empId.hashCode();
		
	}
}
