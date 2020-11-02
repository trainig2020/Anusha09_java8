package io.anusha.unit3;

import io.anusha.unit1.Person;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(

		new Person("Anusha", "Gaddam", 20), new Person("Akhila", "Gaddam", 21),
				new Person("Amesha", "Gaddam", 18), new Person("Prathyusha",
						"Bellam", 15));

		System.out.println("Using for loop");

		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i));
		}

		System.out.println("Using for in loop");

		for (Person p : people) {
			System.out.println(p);
		}

		System.out.println("Using lambda for each loop");
		people.forEach(System.out::println);

	}

}