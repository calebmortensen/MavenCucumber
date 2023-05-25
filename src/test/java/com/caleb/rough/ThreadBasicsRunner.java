package com.caleb.rough;

//extends Thread
//implements Runnable

class Task1 extends Thread{ // This will run in parallel yielding different outputs
	public void run() { //SIGNATURE
		System.out.print("\nTask1 Started");
		for(int i=101; i<=110; i++) 
			System.out.print(i + " ");
		System.out.println("\nTask1 Done");
	}
}

public class ThreadBasicsRunner {

	public static void main(String[] args) {
		// Task1
		System.out.println("\nTask1 Kicked Off");
		Task1 task1 = new Task1();
		task1.start(); //task1.run(); - doesn't run thread in parallel
			
		//Task2
		System.out.println("\nTask2 Kicked Off");
		for(int i=201; i<=216; i++) 
			System.out.print(i + " ");
		System.out.println("\nTask2 Done");
		
		//Task3
		System.out.println("\nTask3 Kicked Off");
			for(int i=301; i<=320; i++) 
				System.out.print(i + " ");
			System.out.println("\nTask3 Done");
			
			System.out.print("\nMain Done");
	
		}
	}

