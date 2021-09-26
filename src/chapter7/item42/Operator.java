package chapter7.item42;

import java.util.function.DoubleBinaryOperator;

public enum Operator {
	PLUS ("+", (x, y) -> x + y),
	MINUS("-", (x, y) -> x - y),
	TIMES("*", (x, y) -> x * y),
	DIVIDE("/", (x, y) -> x / y);

	private final String symbol;
	// ## double type 인수를 두 개 받는 인터페이스
	private final DoubleBinaryOperator op;

	Operator(String symbol, DoubleBinaryOperator op) {
		this.symbol = symbol;
		this.op = op;
	}

	@Override
	public String toString() {return symbol;}
	public double apply(double x, double y) {
		return op.applyAsDouble(x,y);
	}
}
