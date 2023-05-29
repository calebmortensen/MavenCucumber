package com.caleb.rough;

public class BiCounter {
	
	private int i = 0;
	private int j = 0;
	
	
	synchronized public void incrementI() {  //synchronized - ONLY 1 thread at a time run (Thread Safe) BUT PERFORMANCE IMPACT
		i++; //get i, increment, set i
	}

	public int getI() {
		return i;
	}

	
	
	synchronized public void incrementJ() { 
		j++; 
	}

	public int getJ() {
		return j;
	}
}
