package com.caleb.rough;

	class Amount {

		private String currency;
		private int amount;

		public Amount(String currency, int amount) {
			super();
			this.currency = currency;
			this.amount = amount;

		}

		// We want to add another Amount. So, type of parameter is Amount.
		// And the name we gave to the parameter is that.
		public void add(Amount that) {
			if(!this.currency.equals(that.currency)) {
				throw new RuntimeException("Currencies Don't Match");
			}
			
			this.amount = this.amount + that.amount;
		}

		public String toString() {
			return amount + " " + currency;
		}

	}
	
	public class ThrowExceptionRunner {

	public static void main(String[] args) {
		Amount amount1 = new Amount("USD", 10);
		Amount amount2 = new Amount("USD", 20);  //EUR - will cause Exception
		amount1.add(amount2);
		System.out.println(amount1);

	}

}
