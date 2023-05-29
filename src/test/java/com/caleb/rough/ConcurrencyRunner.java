package com.caleb.rough;

public class ConcurrencyRunner {

	public static void main(String[] args) {
		
		//Counter counter = new Counter();
		//counter.increment();
		
		//System.out.println(counter.getI());
		
		BiCounterWithAtomicInteger biCounterWithAtomicInteger = new BiCounterWithAtomicInteger();
		biCounterWithAtomicInteger.getI();
		System.out.println(biCounterWithAtomicInteger.getI());

	}

}
