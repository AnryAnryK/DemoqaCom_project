package patterns.builder;

public class Pizza {

	String component1;
	String component2;
	String component3;
	String component4;

	static class Builder {
		private final Pizza pizza;

		Builder() {
			pizza = new Pizza();
		}

		public Builder component1(String component1) {
			pizza.component1 = component1;
			return this;
		}

		public Builder component2(String component2) {
			pizza.component2 = component2;
			return this;
		}

		public Builder component3(String component3) {
			pizza.component3 = component3;
			return this;
		}

		public Builder component4(String component4) {
			pizza.component4 = component4;
			return this;
		}

		public Pizza build() {
			return pizza;
		}
	}
}
