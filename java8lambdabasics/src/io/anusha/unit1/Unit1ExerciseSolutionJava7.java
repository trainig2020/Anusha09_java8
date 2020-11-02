package io.anusha.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava7 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(

				new Person("Anusha", "Gaddam", 20), 
				new Person("Akhila", "Gaddam", 21),
				new Person("Amesha", "Gaddam", 18), 
				new Person("Prathyusha","Bellam",15));

		// Step 1: Sort list by last name

		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());

			}

		});

		// Step 2: Create a method that prints all elements in the list

		System.out.println("printing all persons");
		printAll(people);

		// step3: create a method that prints all people that have last name
		// beginning with B

		System.out
				.println("Printing all persons with last name beginning with G");
		printConditionally(people, new Condition() {

			@Override
			public boolean test(Person p) {

				return p.getLastName().startsWith("G");
			}

		});

		System.out
				.println("Printing all persons with lfirst name beginning with B");
		printConditionally(people, new Condition() {

			@Override
			public boolean test(Person p) {

				return p.getFirstName().startsWith("P");
			}

		});

	}

	private static void printConditionally(List<Person> people,
			Condition condition) {

		for (Person p : people) {
			if (condition.test(p)) {

				System.out.println(p);
			}

		}

	}

	private static void printAll(List<Person> people) {

		for (Person p : people) {
			System.out.println(p);
		}

	}

}

interface Condition {
	boolean test(Person p);
}