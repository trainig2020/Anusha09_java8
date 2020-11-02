package io.anusha.unit3;

import io.anusha.unit1.Person;

import java.util.Arrays;
import java.util.List;

public class StreamsExample1 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(

		new Person("Anusha", "Gaddam", 20), new Person("Akhila", "Gaddam", 21),
				new Person("Amesha", "Gaddam", 18), new Person("Prathyusha",
						"Bellam", 15));

		long count = people.parallelStream()
				.filter(p -> p.getLastName().startsWith("B")).count();

		System.out.println(count);

	}

}