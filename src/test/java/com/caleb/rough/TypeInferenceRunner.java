package com.caleb.rough;

import java.util.List;

public class TypeInferenceRunner {

	public static void main(String[] args) {
		
		List<String> names1 = List.of("Caleb", "John");
		List<String> names2 = List.of("Jake", "Fred");
		
		List<List<String>> names = List.of(names1, names2);
		
		names.stream().forEach(System.out::println);
		
		/*
		 * for(var i=1; i<10; i++) { System.out.println(i); }   //JRE compliance level 10 for 'var' that infers type
		 */
		
		for(String name:names1)
			System.out.println(name);
		
		List.of("James", "Steven", "Bob", "Matt").stream().filter(s -> s.length() < 5).forEach(System.out::println);

	}

}
