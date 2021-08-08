package chapter4.topclass;

class Test {
	public static void main(String[] args) {
		System.out.println(Utensil.NAME + Dessert.NAME);
	}

	private static class Dessert {
		static final String NAME = "pie";
	}

	private static class Utensil {
		static final String NAME = "pot";
	}
}


