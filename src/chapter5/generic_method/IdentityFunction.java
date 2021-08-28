package chapter5.generic_method;

import java.util.function.UnaryOperator;

public class IdentityFunction {
	private static UnaryOperator<Object> IDENTITY_FN = (t) -> t;

	@SuppressWarnings("unchecked")
	public static <T> UnaryOperator<T> identityFunction() {
		return (UnaryOperator<T>) IDENTITY_FN;
	}

	public static void main(String[] args) {
		String[] str = {"가희", "가히", "짱"};
		UnaryOperator<String> sameString = identityFunction();
		for (String s : str)
			System.out.println(sameString.apply(s));

		Number[] numbers = {1,2,3};
		UnaryOperator<Number> sameNumber = identityFunction();
		for (Number n : numbers)
			System.out.println(sameNumber.apply(n));
	}
}
