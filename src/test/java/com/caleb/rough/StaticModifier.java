package com.caleb.rough;

class Player {
	private String name;            //name is an instance variable or member variable
	private static int count = 0;   //without the ****'static'**** modifier, count would not increment
	                                //count variable is shared between multiple instances of the player objects

	// Generated constructor
	public Player(String name) {
		super();
		this.name = name;
		count ++;
	}

	public static int getCount() {        //added static
		//System.out.println(name);       //won't work - can't make a static reference to non-static field
		return count;
	}

	/* public void setCount(int count) { Player.count = count; } */
	 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class StaticModifier {

	public static void main(String[] args) {
		Player player1 = new Player("Ronaldo");
		System.out.println(Player.getCount());     //getCount belongs to class. Removed instance call to player1.getCount
		Player player2 = new Player("Federer");
		System.out.println(Player.getCount());

	}

}
