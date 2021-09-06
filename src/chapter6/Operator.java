package chapter6;

public enum Operator {
	PLUS {public double apply(double x, double y) { return x+y; }},
	MINUS {public double apply(double x, double y) { return x-y; }},
	TIMES {public double apply(double x, double y) { return x*y; }},
	DIVIDE {public double apply(double x, double y) { return x/y; }};

	public abstract double apply(double x, double y);

	public static Operator inverse(Operator op) {
		switch (op) {
			case PLUS: return Operator.MINUS;
			case MINUS: return Operator.PLUS;
			case TIMES: return Operator.DIVIDE;
			case DIVIDE: return Operator.TIMES;

			default: throw new AssertionError("알수 없는 연산 :  " + op);
		}
	}
}
