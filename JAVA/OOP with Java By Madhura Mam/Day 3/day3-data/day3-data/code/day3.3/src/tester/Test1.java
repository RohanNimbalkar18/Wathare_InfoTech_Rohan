package tester;

import java.util.Scanner;

import com.iacsd.core.Vehicle;

import static utils.ShowroomValidations.validateAllInputs;

public class Test1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println(
					"Enter vehicle details : chasisNo,  vehicleColor,  price,  manufactureDate(yr-mon-day), company");
			Vehicle vehicle = validateAllInputs(sc.next(), sc.next(), sc.nextDouble(), sc.next(), sc.next());
			System.out.println(vehicle);
		} catch (Exception e) {
		//	System.out.println(e);
			e.printStackTrace();
		}
	}
}
