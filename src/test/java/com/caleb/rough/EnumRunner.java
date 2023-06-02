package com.caleb.rough;

import java.util.Arrays;

//enum is like a class
enum Season {
	WINTER, SPRING, SUMMER, FALL;
}

public class EnumRunner {

	public static void main(String[] args) {
		Season season = Season.FALL;
		
		Season season1 = Season.valueOf("WINTER");
		System.out.println(season1);
		System.out.println(Season.SPRING.ordinal());  //1

		System.out.println(Season.values());
		System.out.println(Arrays.toString(Season.values()));
	}

}
