package com.app.core;

/*
 * SILVER : 1000 
GOLD : 2000
DIAMOND : 5000
PLATINUM : 10000
 */
public enum ServicePlan {
	SILVER(1000), GOLD(2000), DIAMOND(5000), PLATINUM(10000);
	private int planCost;
	private ServicePlan(int planCost) {
		this.planCost = planCost;
	}

	public int getPlanCost() {
		return planCost;
	}
	//optionally you can override : toString
	

}
