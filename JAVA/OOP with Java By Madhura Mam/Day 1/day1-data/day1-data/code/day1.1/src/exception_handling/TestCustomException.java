package exception_handling;

import java.util.Scanner;

import custom_exception.SpeedOutOfRangeException;

import static utils.ValidationRules.validateSpeed;

public class TestCustomException {

	public static void main(String[] args) /* throws SpeedOutOfRangeException */{
		try(Scanner sc=new Scanner(System.in)) {
			System.out.println("Enter speed");
			//invoke the validation rule
			validateSpeed(sc.nextInt());
			System.out.println("end of try...");
		} //JVM calls auto : sc.close();
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("main continues....");

	}

}
