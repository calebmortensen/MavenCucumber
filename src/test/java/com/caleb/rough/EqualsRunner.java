package com.caleb.rough;

import java.util.Objects;

class Client {
	
	private int id;
	
	public Client(int id) {
		super();
		this.id = id;
		
	}
//Source -> Generate Hashcode & Equals (Can change values if needed)
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object that) {
		if (this == that)
			return true;
		if (that == null)
			return false;
		if (getClass() != that.getClass())
			return false;
		Client other = (Client) that;
		return id == other.id;
	}
}


public class EqualsRunner {

	public static void main(String[] args) {
	Client c1 = new Client(1);
	Client c2 = new Client(1);
	Client c3 = new Client(2);
	System.out.println(c1.equals(c2)); //false - different objects
	

	}

}
