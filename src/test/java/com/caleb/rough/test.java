package com.caleb.rough;

import java.util.Random;

public class test {
	
	public static void main(String[] args) {
		
		
			 double randomNumber = Math.random();
		     System.out.println(randomNumber);
										
	}
		
	public static int generateRandomNumber(int number) {
		Random random = new Random();
		int rNum = random.nextInt(number);
		return ++rNum;
	}
	
}
