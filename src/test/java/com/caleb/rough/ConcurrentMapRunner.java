package com.caleb.rough;

import java.util.*;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {

	public static void main(String[] args) {
		Map<Character, LongAdder> occurances = new Hashtable<>();
		
		String str = "ABCD ABCD ABCD";
		for(char character:str.toCharArray()) {
			LongAdder longAdder = occurances.get(character);
			if(longAdder == null) {
				longAdder = new LongAdder();
			}
			longAdder.increment();
			occurances.put(character, longAdder);
		}
			System.out.println(occurances);
	}

}
