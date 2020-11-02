package io.anusha.unit1;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
		Greeter greeter = new Greeter();

		Greeting lambdaGreeting = () -> System.out.println("HelloWorld");

		Greeting innerClassGreeting = new Greeting() {
			public void perform() {
				System.out.println("Hello World! ");
			}
		};

		greeter.greet(lambdaGreeting);
		greeter.greet(innerClassGreeting);

	}

}
