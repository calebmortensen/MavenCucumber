package api;

import java.util.List;
import java.util.ArrayList;

public class ApiRunner {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Caleb");
		names.add("Amy");
		names.add("Bella");
		List<String> copyOfNames = List.copyOf(names);  //copyOf -unmodifiable / Immutable
		
		//List.of("Jake", "James", "John"); -unmodifiable / Immutable
		doNotChange(copyOfNames);
		System.out.println(copyOfNames);
	}
	
	private static void doNotChange(List<String> names) {
		names.add("ShouldNotBeAllowed");
		
	}

}
