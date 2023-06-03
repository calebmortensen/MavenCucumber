package api;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNotRunner {
	
	public static boolean isEven(Integer number) {
		return number%2 == 0;
	}

	public static void main(String[] args) {
		List<Integer> numbers = List.of(3,4,5,67,88, 89);
		
		numbers.stream().filter(Predicate.not(PredicateNotRunner::isEven))  //class::method
				.forEach(System.out::println); 
		
		
		//Predicate<Integer> evenNumberPredicate = number -> number%2 == 0;
		//numbers.stream().filter(evenNumberPredicate.negate()).forEach(System.out::println);

	}

}
