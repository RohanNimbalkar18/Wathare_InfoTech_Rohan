package tester;

import com.iacsd.core.AcType;
import com.iacsd.core.BankAccount;

public class TestEquals1 {
//acctNo, IFSC , customer name , type , balance
	public static void main(String[] args) {
		BankAccount acct1 = new BankAccount(101, "HDFC0001", "Rama Patil", AcType.SAVING, 10000);
		BankAccount acct2 = new BankAccount(101, "HDFC0001", "Rama Patil", AcType.SAVING, 10000);
		System.out.println(acct1==acct2);//f
		System.out.println(acct1.equals(acct2));//t
		System.out.println(acct1.hashCode()+" "+acct2.hashCode());//different
	}

}
