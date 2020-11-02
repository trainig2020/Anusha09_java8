package io.anusha.unit2;

public class ThisReferenceExample {

	public void doProcess(int i, Process p) {
		p.process(i);
	}

	public void execute() {
		// this ==?
		doProcess(10, i -> {
			System.out.println("value of i is " + i);
			System.out.println(this);
		});
	}

	public static void main(String[] args) {
		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();

		thisReferenceExample.execute();

	}

	public String toString() {
		return "This is the main ThisreferenceExample class instance";
	}

}