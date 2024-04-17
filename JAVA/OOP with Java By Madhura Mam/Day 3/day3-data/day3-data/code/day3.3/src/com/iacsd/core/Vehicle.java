package com.iacsd.core;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/*
 * chasisNo(string) : Unique ID, color(enum) , basePrice(double) ,
 *  manufactureDate(LocalDate),company,isAvailable
 */
public class Vehicle {
	private String chasisNo;
	private Color vehicleColor;
	private double price;//base price
	private LocalDate manufactureDate;
	private String company;
	private boolean isAvailable;	
	

	public Vehicle(String chasisNo, Color vehicleColor, double price, LocalDate manufactureDate, String company) {
		super();
		this.chasisNo = chasisNo;
		this.vehicleColor = vehicleColor;
		this.price = price;
		this.manufactureDate = manufactureDate;
		this.company = company;
		this.isAvailable = true;
	}

	
	//How to add a formatted date string instead of Date's toString?
	@Override
	public String toString() {
		return "Vehicle [chasisNo=" + chasisNo + ", vehicleColor=" + vehicleColor + ", price=" + (price+vehicleColor.getAdditionalCost())
				+ ", manufactureDate=" +manufactureDate + ", company=" + company + ", isAvailable=" + isAvailable
				+ "]";
	}

	@Override
	public boolean equals(Object o) {
		System.out.println("in vehicle's eq");
		if (o instanceof Vehicle) {
			Vehicle v=(Vehicle)o;
			return this.chasisNo.equals(v.chasisNo);
		}
		return false;
	}

}
