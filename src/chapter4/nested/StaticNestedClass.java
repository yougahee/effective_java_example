package chapter4.nested;

public class StaticNestedClass {
	private static int outer;
	private int nonStaticOuter;

	public static class Inner {
		public int inner = StaticNestedClass.outer;
	}
}

