package com.caleb.rough;

public class ThrowExceptionRunner {

	public static void main(String[] args) {
		Amount amount1 = new Amount("USD", 10);
		Amount amount2 = new Amount("USD", 20); // EUR - will cause Exception
		amount1.add(amount2);
		System.out.println(amount1);

	}

}
