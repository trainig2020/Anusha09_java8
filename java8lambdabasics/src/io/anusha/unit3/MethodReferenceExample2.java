package io.anusha.unit3;

import io.anusha.unit1.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(

		new Person("Anusha", "Gaddam", 20), new Person("Akhila", "Gaddam", 21),
				new Person("Amesha", "Gaddam", 18), new Person("Prathyusha",
						"Bellam", 15));

		System.out.println("printing all persons");

		performConditionally(people, p -> true, System.out::println);

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