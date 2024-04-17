package utils;

import java.time.LocalDate;

import com.app.core.Customer;
import com.app.core.ServicePlan;

import custom_exceptions.InvalidInputException;

public class ValidationRules {
//add a method to parse n validate service plan
	public static ServicePlan parseAndValidatePlan(String plan) throws IllegalArgumentException {
		return ServicePlan.valueOf(plan.toUpperCase());
	}

	// add a method to validate reg amount with the plan
	public static void validatePlanAmount(ServicePlan plan, double regAmount) throws InvalidInputException {
		if (plan.getPlanCost() != regAmount)
			throw new InvalidInputException("Reg amount doesn't match with the plan !!!!!");

	}

	public static LocalDate parseDate(String date) {
		return LocalDate.parse(date);
	}

	// add a method to call validation rules
	public static Customer validateAllInputs(String firstName, String lastName, String email, String password,
			double regAmount, String dob, String plan) throws InvalidInputException {
		ServicePlan validatedPlan = parseAndValidatePlan(plan);
		validatePlanAmount(validatedPlan, regAmount);
		LocalDate date = parseDate(dob);
		return new Customer(firstName, lastName, email, password, regAmount, date, validatedPlan);
	}

}
