package com.db.demo.solid.s2;

//public class DiscountCalculator {
//
//	public Double calculateDiscount(Double amount, String customerType) {
//
//		if (customerType.equals("Gold"))
//			return amount * 0.90;
//		else if (customerType.equals("Silver"))
//			return amount * 0.95;
//		else
//			return amount;
//	}
//
//}


interface DiscountStrategy {
	
	public abstract Double applyDiscount(Double amount);
	
}

class GoldDiscount implements DiscountStrategy {

	@Override
	public Double applyDiscount(Double amount) {
		return amount * 0.90;
	}
	
}

class SilverDiscount implements DiscountStrategy {

	@Override
	public Double applyDiscount(Double amount) {
		return amount * 0.95;
	}
	
}