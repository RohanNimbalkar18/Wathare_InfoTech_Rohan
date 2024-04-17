package tester;

import com.iacsd.core.AcType;
import com.iacsd.core.BankAccount;

public class TestEquals2 {
//acctNo, IFSC , customer name , type , balance
	public static void main(String[] args) {
		// up casting
		Object acct1 = new BankAccount(101, "HDFC0001", "Rama Patil", AcType.SAVING, 10000);
		Object acct2 = new BankAccount(101, "HDFC0001", "Rama Patil", AcType.SAVING, 10000);
		Object acct3 = new BankAccount(102, "HDFC0001", "Rama Patil", AcType.CURRENT, 5000);
		Object acct4 = new BankAccount(102, "HDFC0002", "Rama Patil", AcType.CURRENT, 5000);

		System.out.println(acct1.equals(acct2));// t
		String s = "hello";
		System.out.println(acct1.equals(s));// f since : arg is NOT a Bank Account
		System.out.println(acct1.equals(acct3));//f since acct nos are diff
		System.out.println(acct3.equals(acct4));//f : since IFSC different
	}

}
