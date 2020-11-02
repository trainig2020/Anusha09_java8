package io.anusha.unit2;

import io.anusha.unit1.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StandardFunctionalInterfacesExample {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(

		new Person("Anusha", "Gaddam", 20), new Person("Akhila", "Gaddam", 21),
				new Person("Amesha", "Gaddam", 18), new Person("Prathyusha",
						"Bellam", 15));

		// Step 1: Sort list by last name

		Collections.sort(people,
				(p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

		// Step 2: Create a method that prints all elements in the list

		System.out.println("printing all persons");
		// printAll(people);
		performConditionally(people, p -> true, p -> System.out.println(p));

		// step3: create a method that prints all people that have last name
		// beginning with B

		System.out
				.println("Printing all persons with last name beginning with G");
		performConditionally(people, p -> p.getLastName().startsWith("G"),
				p -> System.out.println(p));

		System.out
				.println("Printing all persons with first name beginning with A");

		performConditionally(people, p -> p.getFirstName().startsWith("P"),
				p -> System.out.println(p.getFirstName()));

	}

	private static void performConditionally(List<Person> people,
			Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person p : people) {
			if (predicate.test(p)) {
				consumer.accept(p);
			}
		}
	}
}