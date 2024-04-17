package date_handling;

import java.util.Scanner;
import static date_handling.Person.sdf;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * Accept DoB for 2 persons Display name of senior person between the 2.
		 */
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter name n dob(yr-mon-day) ");
			Person person1 = new Person(sc.next(), sdf.parse(sc.next()));
			System.out.println("Enter name n dob(yr-mon-day) ");
			Person person2 = new Person(sc.next(), sdf.parse(sc.next()));
			// print name of the senior person
			if (person1.getDob().before(person2.getDob()))
				System.out.println(person1.getName() + " is senior");
			else 
				System.out.println(person2.getName() + " is senior");
			System.out.println(person1);
			System.out.println(person2);

		} // sc.close()
		catch (Exception e) {
			System.out.println("err " + e);
		}

	}

}
