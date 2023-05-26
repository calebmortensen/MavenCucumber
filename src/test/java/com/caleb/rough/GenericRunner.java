package com.caleb.rough;

import java.util.List;

public class GenericRunner {

	public static void main(String[] args) {

		//List<String> list3 = List.of("Apple", "Banana", "Cat", "Dog");

		MyCustomList<String> list = new MyCustomList<>();
		list.addElement("Element 1");
		list.addElement("Element 2");
		String value = list.get(0);

		System.out.println(value);

		MyCustomList<Integer> list2 = new MyCustomList<>();
		list2.addElement(Integer.valueOf(5));
		list2.addElement(Integer.valueOf(7));
		Integer number = list2.get(0);
		System.out.println(number);

		// System.out.println(sumOfNumberList(List.of(1,2,3,4,5)));
		//printWithFP(list3);
		
		random();

	}

	static double sumOfNumberList(List<? extends Number> numbers) {
		double sum = 0.0;
		for (Number number : numbers) {
			sum += number.doubleValue();
		}
		return sum;

	}

	static void addValues(List<? super Number> numbers) {
		numbers.add(1);
		numbers.add(1.0);
		numbers.add(1.0f);
		numbers.add(1l);
	}

	private static void printWithFP(List<String> list) {
		// Lambda Expression ->
		//list.stream().forEach(element -> System.out.println("element - " + element));
	}

	public static void random() {
		// Math.random() generates random number from 0.0 to 0.999
		// Hence, Math.random()*2 will be from 0.0 to 2.999
		double doubleRandomNumber = Math.random() * 3;
		System.out.println("doubleRandomNumber = " + doubleRandomNumber);
		// cast the double to whole number (so rounds down)
		int randomNumber = (int) doubleRandomNumber;
		System.out.println("randomNumber = " + randomNumber);

	}
}
