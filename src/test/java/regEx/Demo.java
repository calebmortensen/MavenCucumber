package regEx;

import java.util.regex.Pattern;

public class Demo {

	public static void main(String[] args) {
		boolean matchingStatus = Pattern.matches("ye[sp]","yes");
		//".*Caleb.*","My name is Caleb Mortensen" - Pass
		//"ye[sp]","yes" or yep - Pass
		//"b{2,4}at","bbat";    -Pass
		if(matchingStatus) {
			System.out.println("Matched");
		}else {
			System.out.println("No Match");
		}

	}

}
