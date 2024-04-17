package tester;

import java.util.Scanner;

import com.iacsd.core.AcType;
import com.iacsd.core.BankAccount;

public class TestEnum {

	public static void main(String[] args) {
		/*
		 * Display all available acct types to the customer accept a/c details n create
		 * acct instance n display a/c summary
		 */
		try (Scanner sc = new Scanner(System.in)) {
			for (AcType a : AcType.values())
				System.out.println(a);
			System.out.println("Enter a/c details : acctNo,  iFSC,  customerName,  acctType,  balance");
			BankAccount account = new BankAccount(sc.nextInt(), sc.next(), sc.next(),
					AcType.valueOf(sc.next().toUpperCase()), sc.nextDouble());
			System.out.println("A/c Summary " + account);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("main over...");

	}

}
