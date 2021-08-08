package chapter4.nested;

public class AnonymousClass {
}

class Inner {
	public void print() {
		System.out.println("hello");
	}
}

class Outer {
	public void outerTest() {
		new Inner() {

			@Override
			public void print() {

			}
		};
	}
}