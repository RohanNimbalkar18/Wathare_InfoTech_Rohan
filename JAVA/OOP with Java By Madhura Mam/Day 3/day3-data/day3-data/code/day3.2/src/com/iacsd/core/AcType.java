package com.iacsd.core;

public enum AcType {
	SAVING(10000), CURRENT(5000), FD(50000), DMAT(125000), LOAN(100000), NRE(500000);

	private double minBalance;
	private AcType(double minBalance) {
		this.minBalance = minBalance;
	}
	public double getMinBalance() {
		return minBalance;
	}
	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}
	@Override
	public String toString()
	{
		return name().toLowerCase()+" min bal "+minBalance;
	}
	
}
