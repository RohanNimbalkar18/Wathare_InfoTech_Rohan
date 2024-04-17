package com.iacsd.core;

//acctNo, IFSC , customer name , type , balance
public class BankAccount {
	private int acctNo;
	private String IFSC;
	private String customerName;
	private AcType acctType;
	private double balance;

	public BankAccount(int acctNo, String iFSC, String customerName, AcType acctType, double balance) {
		super();
		this.acctNo = acctNo;
		IFSC = iFSC;
		this.customerName = customerName;
		this.acctType = acctType;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [acctNo=" + acctNo + ", IFSC=" + IFSC + ", customerName=" + customerName + ", acctType="
				+ acctType + ", balance=" + balance + "]";
	}

	// overrding of equals
	@Override
	public boolean equals(Object anotherObject) {
		System.out.println("in acct's eq");
		if (anotherObject instanceof BankAccount)
			return this.acctNo == ((BankAccount) anotherObject).acctNo;
		return false;
	}

}
