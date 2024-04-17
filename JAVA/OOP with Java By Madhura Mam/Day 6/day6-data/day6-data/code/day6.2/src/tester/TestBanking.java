package tester;

import java.util.Map;
import java.util.Scanner;

import com.banking.BankAccount;

import static utils.BankingUtils.populateAccountMap;

public class TestBanking {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// init
			// get the popualated map : from utils
			Map<Integer, BankAccount> accountMap = populateAccountMap();
			boolean exit = false;
			while (!exit) {
				System.out.println("Options 1. Display all accts 0. Exit");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("All accounts :");
						for(BankAccount a : accountMap.values())
							System.out.println(a);
						break;
					case 0:
						exit = true;

						break;

					}
				} catch (Exception e) {
					sc.nextLine();
					System.out.println(e);
				}
			}
		}

	}

}
