package utils;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;

import com.banking.AcType;
import com.banking.BankAccount;

import custom_exceptions.InsufficientFundsException;

public class BankingValidationRules {
	// add a method to validate min balance
	public static void validateBalance(AcType type, double balance) throws InsufficientFundsException {
		if (balance <= type.getMinBalance())
			throw new InsufficientFundsException("Balance too low!!!!");
	}

	// validate a/c type
	public static AcType parseAndValidateType(String type) {
		return AcType.valueOf(type.toUpperCase());
	}

	// In case of no txs (withdraw , deposit, funds transfer) ,
	// in 1 year , disable a/c status
	public static void disableAccounts(Map<Integer, BankAccount> acctMap) {
		// since it's searching based upon : value based criteria ,
		// Map ---> Collection<V> : values()
		for (BankAccount a : acctMap.values()) {
			long periodInMonths = Period.between(a.getLastTxDate(), LocalDate.now()).toTotalMonths();
			if (periodInMonths > 12)
				a.setActive(false);
		}
		System.out.println("a/c status updated by admin!");
		
	}

}
