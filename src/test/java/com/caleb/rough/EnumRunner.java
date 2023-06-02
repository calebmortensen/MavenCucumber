package com.caleb.rough;

import java.util.Arrays;

//enum is like a class
enum Season {
	WINTER(1), SPRING(2), SUMMER(3), FALL(4);
	//index 0,1,2,3
	
	private int value;
	
	private Season(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
	
	
}

public class EnumRunner {

	public static void main(String[] args) {
		Season season = Season.FALL;
		
		Season season1 = Season.valueOf("WINTER");
		//System.out.println(Season.values());
		System.out.println(Arrays.toString(Season.values()));
		System.out.println(season1);
		System.out.println(Season.SPRING.ordinal());  //1
		System.out.println(Season.SPRING.getValue()); //2

		
	}

}
