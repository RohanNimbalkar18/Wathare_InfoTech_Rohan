package exception_handling;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		//try with resources
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter int value");
			System.out.println("int value " + Integer.parseInt(sc.next()));
			System.out.println("end of try...");
		} // sc.close() : invoked auto by JVM
		System.out.println("main cntd...");
	}

}
