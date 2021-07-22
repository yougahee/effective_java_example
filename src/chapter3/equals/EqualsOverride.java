package chapter3.equals;

public class EqualsOverride {
	@Override
	public boolean equals(Object o) {
		//호출금지
		throw new AssertionError();
	}
}
