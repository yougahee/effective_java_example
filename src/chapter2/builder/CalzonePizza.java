package chapter2.builder;

public class CalzonePizza extends Pizza {
	private final boolean sauceInside;

	public static class Builder extends Pizza.Builder<Builder> {
		private boolean sauceInside = false;

		public Builder sauceInside() {
			sauceInside = true;
			return this;
		}

		@Override
		public CalzonePizza build() {
			return new CalzonePizza(this);
		}

		@Override
		protected Builder self() {
			return this;
		}
	}

	private CalzonePizza(Builder builder) {
		super(builder);
		this.sauceInside = builder.sauceInside;
	}
}
