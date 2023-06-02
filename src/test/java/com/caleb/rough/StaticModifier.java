package com.caleb.rough;

class Player {
	private String name;
	private static int count = 0;   //without the ****'static'**** modifier, count would not increment
	                                //count variable is shared between multiple instances of the player objects

	// Generated constructor
	public Player(String name) {
		super();
		this.name = name;
		count ++;
	}

	public int getCount() {
		return count;
	}

	
	/* public void setCount(int count) { Player.count = count; } */
	 

}

public class StaticModifier {

	public static void main(String[] args) {
		Player player1 = new Player("Ronaldo");
		System.out.println(player1.getCount());
		Player player2 = new Player("Federer");
		System.out.println(player2.getCount());

	}

}
