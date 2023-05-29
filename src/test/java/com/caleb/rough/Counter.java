package com.caleb.rough;

public class Counter {
	
	private int i = 0;
	
	synchronized public void increment() {  //synchronized - only 1 thread at a time run (Thread Safe)
		i++; //get i, increment, set i
	}

	public int getI() {
		return i;
	}

}
