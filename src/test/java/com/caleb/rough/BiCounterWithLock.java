package com.caleb.rough;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {
	
	private int i = 0;
	private int j = 0;
	//LOCKS help to break Synchronized code into multiple sets of code so I and J can be running in PARALLEL (flexibility of Locks)
	
	
	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();
	
	 public void incrementI() {  //synchronized - ONLY 1 thread at a time run (Thread Safe) BUT PERFORMANCE IMPACT
		lockForI.lock();//Get Lock For I   (can use try.lock or for a time period too)
		i++;
		//Release Lock For I
		lockForI.unlock();
	}

	public int getI() {
		return i;
	}

	
	
	 public void incrementJ() { 
		lockForJ.lock();//Get Lock For J
		j++; 
		lockForJ.unlock();//Release Lock For J
	}

	public int getJ() {
		return j;
	}
}
