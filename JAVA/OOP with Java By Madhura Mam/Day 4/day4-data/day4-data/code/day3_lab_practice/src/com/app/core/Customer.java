package com.app.core;

import java.time.LocalDate;

/*
 * customer id(int) ,first name, last name (string),
 * email(string),password(string),registrationAmount(double),
 * dob(LocalDate),plan(ServicePlan : enum)
 */
public class Customer {
	private int customerId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private double regAmount;
	private LocalDate dob;
	private ServicePlan plan;
	// static id generator
	private static int idGenerator;
	static {
		idGenerator = 1;
	}

	public Customer(String firstName, String lastName, String email, String password, double regAmount, LocalDate dob,
			ServicePlan plan) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.regAmount = regAmount;
		this.dob = dob;
		this.plan = plan;
		this.customerId = idGenerator++;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", regAmount=" + regAmount + ", dob=" + dob + ", plan=" + plan + "]";
	}

	@Override
	public boolean equals(Object anotherObj) {
		System.out.println("in customer eq");
		if (anotherObj instanceof Customer)
			return this.email.equals(((Customer) anotherObj).email);
		return false;
	}

}
